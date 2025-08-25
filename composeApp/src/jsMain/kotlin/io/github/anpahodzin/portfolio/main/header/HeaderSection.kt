package io.github.anpahodzin.portfolio.main.header

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

private object HeaderStyles : StyleSheet() {
    val section by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        padding(0.px, Res.Sizes.baseHorizontalPadding)
        height(Res.Sizes.headerHeight)

        backgroundColor(Res.Colors.headerBackground)
        property("box-shadow", "0px 0px 5px 2px ${Res.Colors.headerShadow}")
        property("backdrop-filter", "blur(10px)")
        property("-webkit-backdrop-filter", "blur(10px)")

        position(Position.Fixed)
        top(0.px)
        right(0.px)
        left(0.px)
        property("z-index", "1000")

        mediaPortraitMode {
            padding(0.px, Res.Sizes.baseHorizontalPaddingSmall)
        }
    }
    val navLeft by style {
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        gap(12.px)
        fontSize(1.2.em)
    }
    val logo by style {
        width(48.px)
        property("aspect-ratio", "1/1")
        property("object-fit", "cover")

        borderRadius(24.px)
        property("box-shadow", "0px 0px 10px 5px ${Res.Colors.headerShadow}")
        mediaPortraitMode {
            property("display", "none")
        }
    }
    val navMenu by style {
        display(DisplayStyle.Flex)
        gap(12.px)
    }
    val navItem by style {
        textDecorationLine("none")
        color(Color.white)

        property("white-space", "nowrap")
        borderRadius(24.px)
        padding(8.px, 8.px)

        self + hover style {
            backgroundColor(Res.Colors.gray)
        }
    }
}

@Composable
fun HeaderSection() {
    Style(HeaderStyles)

    Nav(attrs = { classes(HeaderStyles.section) }) {
        Div(attrs = { classes(HeaderStyles.navLeft) }) {
            Img(
                src = "site-icons/android-chrome-512x512.png",
                alt = "Logo",
                attrs = { classes(HeaderStyles.logo) }
            )
            Div {
                Text("Anton")
                Br()
                Text("Pahodzin")
            }
        }
        Div(attrs = { classes(HeaderStyles.navMenu) }) {
            HeaderLinks.links.forEach { link ->
                A(
                    href = link.toAnchor(),
                    attrs = { classes(HeaderStyles.navItem) }) { Text(link.text) }
            }
        }
    }
}