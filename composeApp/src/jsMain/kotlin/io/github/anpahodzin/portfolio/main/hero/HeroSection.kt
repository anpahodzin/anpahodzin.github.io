package io.github.anpahodzin.portfolio.main.hero

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.hero.title.HeroTitle
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeroSection() {
    Style(HeroStyles)

    Div(attrs = { classes(HeroStyles.heroSection) }) {
        Img(
            src = "avatar.jpg",
            alt = "Profile Photo",
            attrs = { classes(HeroStyles.heroImage) }
        )
        Div(attrs = { classes(HeroStyles.heroTitle) }) {
//            Text("Software")
//            Br()
//            Text("Engineer")
            HeroTitle()
        }
        Div(attrs = { classes(HeroStyles.heroBio) }) {
            Text("Hi, I'm Anton, an Android Developer who builds beautiful and intuitive apps.")
        }
    }
}