package io.github.anpahodzin.portfolio.common

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {
    init {
        "body" style {
            backgroundColor(Res.Colors.cursedBlack)
            margin(0.px)
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