package io.github.anpahodzin.portfolio.common

import org.jetbrains.compose.web.css.*

object GlobalStyles : StyleSheet() {
    init {
        "body" style {
            margin(0.px)
            padding(0.px)
            backgroundColor(Color("#121212"))
            color(Color("#FFFFFF"))
//            fontFamily("Roboto", "sans-serif")
            fontFamily("Helvetica Neue", "Arial", "sans-serif")
//            fontSize(16.px)
            property("font-optical-sizing", "auto")
            property("font-weight", "300")
//            property("font-style", "normal")
            property("font-variation-settings", "\"wdth\" 87.5")
        }
    }
}