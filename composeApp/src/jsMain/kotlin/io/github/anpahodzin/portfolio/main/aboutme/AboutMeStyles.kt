package io.github.anpahodzin.portfolio.main.aboutme

import org.jetbrains.compose.web.css.*

object AboutMeStyles : StyleSheet() {

    val aboutMeSection by style {
        marginTop(80.px)
        marginBottom(80.px)

        property("display", "grid")
        property("grid-template-columns", "30% 70%")
        columnGap(40.px)

        media("(max-width: 800px)") {
            self.style {
                property("display", "flex")
                property("flex-direction", "column")
            }
        }
    }

    val aboutLeft by style {

    }

    val aboutRight by style {

    }
    val aboutTitle by style {
        fontSize(2.5.em)
        marginBottom(20.px)
    }
}