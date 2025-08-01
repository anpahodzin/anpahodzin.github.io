package io.github.anpahodzin.portfolio.common

import org.jetbrains.compose.web.css.StyleSheet

object CommonStyles : StyleSheet() {
    val card by style {
        property("box-shadow", "0 0 10px rgba(255, 255, 255, 0.2)")
    }
}