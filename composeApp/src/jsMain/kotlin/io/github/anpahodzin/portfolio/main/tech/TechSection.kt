package io.github.anpahodzin.portfolio.main.tech

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun TechSection() {
    Style(TechStyles)

//    H2(attrs = { classes("") }) { Text("Technology") } //todo add style
    Div(attrs = { classes(TechStyles.techSection) }) {
        val techList = listOf("coinbase", "Spotify", "zoom", "slack", "Dropbox", "Google")
        techList.forEach { tech ->
            Div(attrs = { classes(TechStyles.techCard) }) {
                Text(tech)
            }
        }
    }
}