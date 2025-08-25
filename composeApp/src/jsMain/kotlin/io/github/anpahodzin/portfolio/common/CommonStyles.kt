package io.github.anpahodzin.portfolio.common

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.columnGap
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width

object CommonStyles : StyleSheet() {
    val card by style {
        property("box-shadow", "0 0 10px rgba(255, 255, 255, 0.2)")
    }

    val autoSizedCenterSection by style {
        val topMargin = 60.px
        val bottomMargin = 20.px

        property("padding", "$topMargin  ${Res.Sizes.baseHorizontalPadding} $bottomMargin")
        property("margin", "0 auto")
        maxWidth(Res.Sizes.maxWidth)

        mediaPortraitMode {
            property("padding", "$topMargin  ${Res.Sizes.baseHorizontalPaddingSmall} $bottomMargin")
        }
    }

    val appGridSection by style {
        display(DisplayStyle.Grid)
        property("grid-template-columns", "1fr 2fr")
        property("grid-template-rows", "1fr")
        columnGap(40.px)

        mediaPortraitMode {
            property("grid-template-columns", "1fr")
            property("grid-template-rows", "auto")
        }
    }

    val smallIcon by style {
        width(24.px)
        height(24.px)
        property("object-fit", "cover")
    }
}