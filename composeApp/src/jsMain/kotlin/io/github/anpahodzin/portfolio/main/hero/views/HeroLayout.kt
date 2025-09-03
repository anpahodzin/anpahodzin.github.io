package io.github.anpahodzin.portfolio.main.hero.views

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

private object HeroLayoutStyle : StyleSheet() {
    val gridContainer by style {
        val topMargin = Res.Sizes.headerHeight + 40.px
        val bottomMargin = 20.px

        property("grid-template-columns", "2.6fr 1fr")
        property("margin", "$topMargin auto $bottomMargin")
        property("height", "calc(100vh - $topMargin - $bottomMargin)")

        mediaPortraitMode {
            property("grid-template-columns", "1fr")
            height(auto)
        }
    }
    val gridItemLarge by style {
        property("grid-column", "1")
        property("grid-row", "1 / 3")
        position(Position.Relative)
        overflow("hidden")

        mediaPortraitMode {
            property("grid-column", "1")
            property("grid-row", "2")
            property("aspect-ratio", "512 / 354")
        }
    }
    val gridItem1 by style {
        property("grid-column", "2")
        property("grid-row", "1")
        padding(16.px)

        justifySelf("end")
        alignSelf(AlignSelf.Start)

        mediaPortraitMode {
            property("grid-column", "1")
            property("grid-row", "1")
            justifySelf("center")
            alignSelf(AlignSelf.Center)
        }
    }
    val gridItem2 by style {
        property("grid-column", "2")
        property("grid-row", "2")

        property("text-align", "right")
        property("align-self", "end")
        property("margin", "0 0 30%")

        mediaPortraitMode {
            property("grid-column", "1")
            property("grid-row", "3")

            property("text-align", "left")
            property("align-self", "start")
            property("margin", "20px 0 0")
        }
    }
}

/*
On landscape mode:
┌────────────────┬─────────┐
│                │small top│
│                │  cell   │
│                ├─────────┤
│                │  small  │
│                │  bottom │
│   large cell   │  cell   │
└────────────────┴─────────┘
On portrait mode:
┌───────────┐
│ small top │
│   cell    │
├───────────┤
│large cell │
├───────────┤
│   small   │
│   bottom  │
│   cell    │
└───────────┘
 */

@Composable
fun HeroLayout(
    largeGridCell: ContentBuilder<HTMLDivElement> = {},
    smallTopGridCell: ContentBuilder<HTMLDivElement> = {},
    smallBottomGridCell: ContentBuilder<HTMLDivElement> = {},
) {
    Style(HeroLayoutStyle)

    Div(attrs = {
        classes(
            HeroLayoutStyle.gridContainer,
            CommonStyles.sectionMarginPaddingRule,
            CommonStyles.sectionGridRule
        )
    }) {
        Div(attrs = { classes(HeroLayoutStyle.gridItemLarge) }) {
            largeGridCell()
        }
        Div(attrs = { classes(HeroLayoutStyle.gridItem1) }) {
            smallTopGridCell()
        }
        Div(attrs = { classes(HeroLayoutStyle.gridItem2) }) {
            smallBottomGridCell()
        }
    }
}