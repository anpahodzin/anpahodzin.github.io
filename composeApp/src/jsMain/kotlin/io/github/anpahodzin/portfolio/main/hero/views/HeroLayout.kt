package io.github.anpahodzin.portfolio.main.hero.views

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.hero.title.HeroText
import io.github.anpahodzin.portfolio.main.hero.title.HeroTitle
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

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

    val largeCellImage by style {
        position(Position.Absolute)
        bottom(0.px)
        property("z-index", "2")
        width(100.percent)
        height(auto)
    }

    val heroImage by style {
        width(100.percent)

        property("object-fit", "cover")
        borderRadius(16.px)
        mediaPortraitMode {
            width(200.px)
        }
    }
}

@Composable
fun HeroLayout() {
    Style(HeroLayoutStyle)

    Div(attrs = {
        classes(
            HeroLayoutStyle.gridContainer,
            CommonStyles.sectionMarginPaddingRule,
            CommonStyles.sectionGridRule
        )
    }) {
        Div(attrs = { classes(HeroLayoutStyle.gridItemLarge) }) {
            Div(attrs = { classes(HeroLayoutStyle.largeCellImage) }) {
                HeroText()
            }
            Div(attrs = { classes(HeroLayoutStyle.largeCellImage) }) {
                HeroTitle()
            }
        }
        Div(attrs = { classes(HeroLayoutStyle.gridItem1) }) {
            Img(
                src = "images/avatar.jpg",
                alt = "Profile Photo",
                attrs = { classes(HeroLayoutStyle.heroImage) }
            )
        }
        Div(attrs = { classes(HeroLayoutStyle.gridItem2) }) {
            Text("Hi, I'm Anton, an Android Developer who builds beautiful and intuitive apps.")
        }
    }
}