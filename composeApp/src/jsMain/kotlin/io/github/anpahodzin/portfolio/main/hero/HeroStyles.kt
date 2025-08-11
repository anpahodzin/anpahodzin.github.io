package io.github.anpahodzin.portfolio.main.hero

import org.jetbrains.compose.web.css.*

object HeroStyles : StyleSheet() {

    val heroSection by style {
        //            display(DisplayStyle.Grid)
//            gridTemplateColumns("2fr 1fr")
//            gridTemplateRows("auto auto")
//            columnGap(1.vw)
//            gap(1.cssRem)
//            marginTop(200.px)
//            marginBottom(200.px)
        marginTop(200.px)
        marginBottom(60.px)

        property("display", "grid")
        property("grid-template-columns", "70% 30%")
        property("grid-template-rows", "80% 20%")

        media("(max-width: 800px)") {
            self.style {
                property("display", "flex")
                property("flex-direction", "column")
            }
        }

//        backgroundColor(Color.blueviolet)
    }

    val heroTitle by style {
        fontSize(10.em)
//        fontWeight(400)
        lineHeight(1.em)
//            justifySelf(JustifySelf.End)
//            alignSelf(AlignSelf.End)
//        backgroundColor(Color.lightblue)
        width(100.percent)
        property("align-self", "end")
        property("grid-row", "1/3")
    }

    val heroImage by style {
        width(200.px)
//            height(100.percent)
        property("aspect-ratio", "2/3")
//        property("justify-self", "center")
//        property("align-self", "end")
        justifySelf("end")
        alignSelf(AlignSelf.Start)


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

        media("(max-width: 800px)") {
            self.style {
                justifySelf("center")
                alignSelf(AlignSelf.Center)
            }
        }
    }

    val heroBio by style {
        fontSize(1.em)
        property("text-align", "right")
        property("align-self", "end")
//            backgroundColor(Color.yellow)
    }
}