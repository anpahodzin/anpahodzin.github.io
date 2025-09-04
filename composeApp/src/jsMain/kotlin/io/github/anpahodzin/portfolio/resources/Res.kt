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

        val graySteel100 = Color("#F8F9FA")
        val graySteel200 = Color("#E9ECEF")
        val graySteel300 = Color("#DEE2E6")
        val graySteel400 = Color("#CED4DA")
        val graySteel500 = Color("#ADB5BD")
        val graySteel600 = Color("#6C757D")
        val graySteel700 = Color("#495057")
        val graySteel800 = Color("#343A40")
        val graySteel900 = Color("#212529")

        val gray = graySteel900
    }

    object Sizes {
        val headerHeight = 64.px

        val maxWidth = 1200.px

        val portraitMaxWidth = 800.px

        val baseHorizontalPadding = 40.px
        val baseHorizontalPaddingSmall = 20.px

        val sectionTopMargin = 40.px
        val sectionBottomMargin = 20.px
        val sectionRowGridGap = 20.px
        val sectionColumnGridGap = 40.px
    }
}