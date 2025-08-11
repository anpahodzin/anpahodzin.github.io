package io.github.anpahodzin.portfolio.main.hero

import org.jetbrains.compose.web.css.*

object HeroStyles : StyleSheet() {

    val heroSection by style {
        marginTop(200.px)
        marginBottom(60.px)

        property("display", "grid")
        property("grid-template-columns", "repeat(4, 1fr)")
        property("grid-template-rows", "repeat(2, 1fr)")
        property("column-gap", "20px")

        media("(max-width: 800px)") {
            self.style {
                property("display", "flex")
                property("flex-direction", "column")
            }
        }

//        backgroundColor(Color.blueviolet)
    }

    val heroTitle by style {
        width(100.percent)
        property("align-self", "end")
        property("grid-row", "1/3")
        property("grid-column", "1/4")
//        backgroundColor(Color.lightblue)
    }

    val heroImage by style {
        width(200.px)
        property("aspect-ratio", "2/3")

        justifySelf("end")
        alignSelf(AlignSelf.Start)

        property("object-fit", "cover")
        borderRadius(16.px)

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
        property("margin-bottom", "25%")

        media("(max-width: 800px)") {
            self.style {
                property("text-align", "left")
                property("align-self", "start")
                property("margin-top", "20px")
                property("margin-bottom", "0")
            }
        }
    }
}