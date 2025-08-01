package io.github.anpahodzin.portfolio.main.hero

import org.jetbrains.compose.web.css.*

object HeroStyles : StyleSheet() {

    val heroSection by style {
        //            display(DisplayStyle.Grid)
//            gridTemplateColumns("2fr 1fr")
//            gridTemplateRows("auto auto")
//            columnGap(40.px)
//            gap(1.cssRem)
//            marginTop(200.px)
//            marginBottom(200.px)
        paddingTop(200.px)
        paddingBottom(60.px)

        property("display", "grid")
        property("grid-template-columns", "70% 30%")
        property("grid-template-rows", "80% 20%")

        media("(max-width: 800px)") {
            self.style {
                property("display", "flex")
                property("flex-direction", "column")
            }
        }
    }

    val heroTitle by style {
        fontSize(10.em)
        fontWeight(400)
        lineHeight(1.em)
//            justifySelf(JustifySelf.End)
//            alignSelf(AlignSelf.End)

        property("align-self", "end")
        property("grid-row", "1/3")
    }

    val heroImage by style {
        width(200.px)
//            height(100.percent)
        property("aspect-ratio", "2/3")
        property("justify-self", "center")
        property("align-self", "center")


//            height(100.pc)
//            width(200.px)
//            height(200.px)

        property("object-fit", "cover")
        borderRadius(16.px)
//            backgroundColor(Color.azure)
//        }

        //        media("screen and (min-width: 1000px)") {
//            ".hero-image" style {
//                width(100.percent)
//                height(100.percent)
//            }
//        }
    }

    val heroBio by style {
        fontSize(1.em)
        property("text-align", "right")
        property("align-self", "end")
//            backgroundColor(Color.yellow)
    }
}