package io.github.anpahodzin.portfolio.main

import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px

object MainStyle : StyleSheet() {

    val pageContainer by style {
        padding(0.px, 60.px)
        maxWidth(1200.px)
        property("margin", "0px auto")
    }
}