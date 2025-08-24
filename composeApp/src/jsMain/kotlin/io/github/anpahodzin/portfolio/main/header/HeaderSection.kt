package io.github.anpahodzin.portfolio.main.header

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.*

@Composable
fun HeaderSection() {
    Style(HeaderStyles)

    Nav(attrs = { classes(HeaderStyles.header) }) {
        Div(attrs = { classes(HeaderStyles.logo) }) { Text("Anton Pahodzin") }
        Div(attrs = { classes(HeaderStyles.navMenu) }) {
            HeaderLinks.links.forEach { link ->
                A(href = link.toAnchor(), attrs = { classes(HeaderStyles.navItem) }) { Text(link.text) }
            }
//            A(href = "#") { Text("About Us") }
//            Button(attrs = { classes("sign-in-button") }) { Text("Sign In") }
        }
    }
}