package io.github.anpahodzin.portfolio.common

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {
    init {
        "html" style {
            property("scroll-behavior", "smooth")
        }
        "body" style {
            backgroundColor(Res.Colors.cursedBlack)
            margin(0.px)
            color(Res.Colors.graySteel100)
            fontFamily("Roboto", "sans-serif")
//            fontFamily("Helvetica Neue", "Arial", "sans-serif")
//            fontSize(16.px)
//            property("font-optical-sizing", "auto")
            property("font-weight", "200")
//            property("font-style", "normal")
//            property("font-variation-settings", "\"wdth\" 87.5")
        }

        "h2" style {
            margin(0.px)
            fontSize(2.5.em)
            property("font-weight", "200")
        }

        "a" style {
            color(Res.Colors.graySteel100)
        }
    }
}