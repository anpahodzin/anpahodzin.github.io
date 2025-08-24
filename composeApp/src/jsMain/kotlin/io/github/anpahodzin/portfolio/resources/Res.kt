package io.github.anpahodzin.portfolio.resources

import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px

object Res {
    object Colors {
        val white = Color.white
        val black = Color.black

        val cursedBlack = Color("#121212")

        val dodgerBlue = Color("#178FF7")
        val violet = Color("#A66AFB")
        val pink = Color("#EB447E")
        val orange = Color("#F55507")

        val headerBackground = Color("#16161640")
        val headerShadow = Color("#AFAFAF20")
    }

    object Sizes {
        val headerHeight = 64.px

        val maxWidth = 1200.px

        val portraitMaxWidth = 800.px
        val baseHorizontalPadding = 40.px
    }
}