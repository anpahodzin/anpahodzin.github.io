package io.github.anpahodzin.portfolio.main.aboutme

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.main.header.HeaderLinks
import org.jetbrains.compose.web.css.marginBottom
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMeSection() {
    Div(attrs = {
        id(HeaderLinks.aboutMe.link)
        classes(CommonStyles.autoSizedCenterSection, CommonStyles.appGridSection)
    }) {
        Div {
            H2(attrs = {
                style {
                    marginBottom(20.px)
                }
            }) { Text("ABOUT ME") }
        }
        Div {
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