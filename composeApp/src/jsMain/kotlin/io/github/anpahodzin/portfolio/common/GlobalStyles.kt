package io.github.anpahodzin.portfolio.common

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {
    init {
        "body" style {
            margin(0.px)
            padding(0.px)
            backgroundColor(Res.Colors.cursedBlack)
            backgroundImage("noise6.svg")
            color(Res.Colors.white)
            fontFamily("Roboto", "sans-serif")
//            fontFamily("Helvetica Neue", "Arial", "sans-serif")
//            fontSize(16.px)
//            property("font-optical-sizing", "auto")
            property("font-weight", "200")
//            property("font-style", "normal")
//            property("font-variation-settings", "\"wdth\" 87.5")
        }
    }
}