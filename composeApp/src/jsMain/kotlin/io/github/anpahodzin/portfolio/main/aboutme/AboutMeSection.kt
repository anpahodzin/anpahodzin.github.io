package io.github.anpahodzin.portfolio.main.aboutme

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMeSection() {
    Style(AboutMeStyles)

    Div(attrs = { classes(AboutMeStyles.aboutMeSection) }) {
        Div(attrs = { classes(AboutMeStyles.aboutLeft) }) {
            H2(attrs = { classes(AboutMeStyles.aboutTitle) }) { Text("About Me") }
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