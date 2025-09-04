package io.github.anpahodzin.portfolio.common

import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.columnGap
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.rowGap
import org.jetbrains.compose.web.css.width

object CommonStyles : StyleSheet() {
    val card by style {
        property("box-shadow", "0 0 10px rgba(255, 255, 255, 0.2)")
    }

    val sectionMarginPaddingRule by style {
        val topMargin = Res.Sizes.sectionTopMargin
        val bottomMargin = Res.Sizes.sectionBottomMargin
        property("margin", "$topMargin auto $bottomMargin")

        property("scroll-margin-top", "${Res.Sizes.headerHeight}")

        property("padding", "0 ${Res.Sizes.baseHorizontalPadding}")
        maxWidth(Res.Sizes.maxWidth)

        mediaPortraitMode {
            property("padding", "0 ${Res.Sizes.baseHorizontalPaddingSmall}")
        }
    }

    val sectionGridRule by style {
        display(DisplayStyle.Grid)
        property("grid-template-columns", "1fr 2fr")
        property("grid-template-rows", "1fr")
        columnGap(Res.Sizes.sectionColumnGridGap)
        rowGap(Res.Sizes.sectionRowGridGap)

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