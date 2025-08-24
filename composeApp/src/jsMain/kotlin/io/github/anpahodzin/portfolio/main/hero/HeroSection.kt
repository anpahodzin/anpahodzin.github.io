package io.github.anpahodzin.portfolio.main.hero

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.hero.title.HeroTitle
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.rgba
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeroSection() {
    Style(HeroStyles)

    Div(attrs = { classes(HeroStyles.heroSection) }) {
        Img(
            src = "images/avatar.jpg",
            alt = "Profile Photo",
            attrs = { classes(HeroStyles.heroImage) }
        )
        Div(attrs = { classes(HeroStyles.heroTitle) }) {
            Div(attrs = { style {
//                property("position", "relative")
//                property("top", "0")
//                property("left", "0")
//                property("width", "100%")
//                property("height", "100%")
//                property("align-self", "end")
                property("grid-area", "overlap")
                backgroundColor(rgba(200, 0, 0, 0.3))
            } }) {
                Div(attrs = { /*classes(HeroStyles.heroTitleLayer)*/ }) {
                    Text("Software")
                    Br()
                    Text("Engineer")
                }
                Div(attrs = { /*classes(HeroStyles.heroTitleLayer)*/  style { backgroundColor(rgba(200, 200, 200, 0.2)) }}) {
                    HeroTitle()
                }
            }
        }
        Div(attrs = { classes(HeroStyles.heroBio) }) {
            Text("Hi, I'm Anton, an Android Developer who builds beautiful and intuitive apps.")
        }
    }
}