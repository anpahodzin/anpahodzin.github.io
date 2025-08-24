package io.github.anpahodzin.portfolio.main.aboutme

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.header.HeaderLinks
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

object AboutMeStyles : StyleSheet() {

    val aboutMeSection by style {
//        marginTop(80.px)
//        marginBottom(80.px)
//
//        property("display", "grid")
//        property("grid-template-columns", "repeat(2, 1fr)")
//        columnGap(40.px)
//
//        mediaPortraitMode {
//            property("display", "flex")
//            property("flex-direction", "column")
//        }

        val topMargin = 60.px
        val bottomMargin = 20.px

        display(DisplayStyle.Grid)
        property("grid-template-columns", "1fr 2fr")
        property("grid-template-rows", "1fr")
        columnGap(40.px)

        property("padding", "0px ${Res.Sizes.baseHorizontalPadding}")
        property("margin", "$topMargin auto $bottomMargin")
        maxWidth(Res.Sizes.maxWidth)
//        property("height", "calc(100vh - $topMargin - $bottomMargin)")

        mediaPortraitMode {
            property("grid-template-columns", "1fr")
            property("grid-template-rows", "auto auto auto")
            height(auto)
        }
    }

    val aboutLeft by style {

    }

    val aboutRight by style {
        paddingRight(24.px)
        paddingLeft(24.px)
    }
    val aboutTitle by style {
        fontSize(2.5.em)
        marginBottom(20.px)
    }
}

@Composable
fun AboutMeSection() {
    Style(AboutMeStyles)

    Div(attrs = {
        id(HeaderLinks.aboutMe.link)
        classes(AboutMeStyles.aboutMeSection)
    }) {
        Div(attrs = { classes(AboutMeStyles.aboutLeft) }) {
            H2(attrs = { classes(AboutMeStyles.aboutTitle) }) { Text("ABOUT ME") }
        }
        Div(attrs = { classes(AboutMeStyles.aboutRight) }) {
            P {
                Text(
                    """Android developer with 8+ years of experience and a strong background in building high-quality mobile applications. 
                    Proficient in modern technologies including Kotlin, Jetpack Compose, MVVM, Coroutines, and dependency injection. 
                    Skilled in Kotlin Multiplatform (KMP) with experience using Decompose for scalable modular architecture and code sharing across platforms. 
                    Since 2023, also working as a Flutter developer, skilled in Dart, Flutter SDK, BLoC, Provider, and cross-platform development for Android and iOS. 
                    Passionate about clean code, scalable architecture, and delivering smooth user experiences.""".trimMargin()
                )
            }
        }
    }
}