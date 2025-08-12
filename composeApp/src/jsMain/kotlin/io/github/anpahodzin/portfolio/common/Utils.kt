package io.github.anpahodzin.portfolio.common

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.CSSBuilder
import org.jetbrains.compose.web.css.StyleScope
import org.jetbrains.compose.web.css.media

fun CSSBuilder.mediaPortraitMode(
    cssRule: StyleScope.() -> Unit
) {
    media("(max-width: ${Res.Sizes.portraitMaxWidth})") {
        self.style {
            cssRule.invoke(this)
        }
    }
}