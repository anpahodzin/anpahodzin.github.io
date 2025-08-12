package io.github.anpahodzin.portfolio.main.hero

import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*

object HeroStyles : StyleSheet() {

    val heroSection by style {
        val topMargin = 200.px
        val bottomMargin = 60.px
        property("padding", "0px ${Res.Sizes.baseHorizontalPadding}")
        property("margin", "$topMargin auto $bottomMargin")

        maxWidth(Res.Sizes.maxWidth)
        property("height", "calc(100vh - $topMargin)")

        property("display", "grid")
        property("grid-template-columns", "repeat(4, 1fr)")
        property("grid-template-rows", "repeat(2, 1fr)")
        property("column-gap", "40px")
        property("row-gap", "20px")

        mediaPortraitMode {
            property("height", "auto")
            property("display", "flex")
            property("flex-direction", "column")
        }
//      backgroundColor(Color.blueviolet)
    }

    val heroTitle by style {
        width(100.percent)
        property("align-self", "end")
        property("grid-row", "1/3")
        property("grid-column", "1/4")
//      backgroundColor(Color.lightblue)
    }

    val heroImage by style {
        width(200.px)
        property("aspect-ratio", "2/3")

        justifySelf("end")
        alignSelf(AlignSelf.Start)

        property("object-fit", "cover")
        borderRadius(16.px)

        mediaPortraitMode {
            justifySelf("center")
            alignSelf(AlignSelf.Center)
        }
    }

    val heroBio by style {
        fontSize(1.em)
        property("text-align", "right")
        property("align-self", "end")
        property("margin-bottom", "30%")

        mediaPortraitMode {
            property("text-align", "left")
            property("align-self", "start")
//          property("margin-top", "40px")
            property("margin-bottom", "0")
        }
    }
}