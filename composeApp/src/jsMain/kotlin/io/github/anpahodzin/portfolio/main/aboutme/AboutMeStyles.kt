package io.github.anpahodzin.portfolio.main.aboutme

import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import org.jetbrains.compose.web.css.*

object AboutMeStyles : StyleSheet() {

    val aboutMeSection by style {
        marginTop(80.px)
        marginBottom(80.px)

        property("display", "grid")
        property("grid-template-columns", "repeat(2, 1fr)")
        columnGap(40.px)

        mediaPortraitMode {
            property("display", "flex")
            property("flex-direction", "column")
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