package io.github.anpahodzin.portfolio.main.header

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*

object HeaderStyles : StyleSheet() {

    val header by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        padding(0.px, 40.px)

        backgroundColor(Res.Colors.headerBackground)
//            borderRadius(16.px)
        property("box-shadow", "0px 0px 5px 2px ${Res.Colors.headerShadow}")
        property("backdrop-filter", "blur(10px)")
        property("-webkit-backdrop-filter", "blur(10px)")

        position(Position.Fixed)
        top(0.px)
        right(0.px)
        left(0.px)
        property("z-index", "1000")
//            property("margin", "0px auto")
    }
    val logo by style {
        fontSize(2.em)
        fontWeight("bold")
    }
    val navMenu by style {
        display(DisplayStyle.Flex)
        gap(24.px)
    }
    val navItem by style {
        textDecorationLine("none")
        color(Color("#ffffff"))
        hover {
//                color(Color("#"))
//                textDecorationLine(TextDecorationLine.Underline)
        }
    }

    val signInButton by style {
        backgroundColor(Color("#000000"))
        color(Color("#FFFFFF"))
        padding(8.px, 20.px)
        borderRadius(20.px)
    }
}