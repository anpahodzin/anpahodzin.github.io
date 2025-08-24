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
            A(href = "#about", attrs = { classes(HeaderStyles.navItem) }) { Text("About Me") }
            A(href = "#projects", attrs = { classes(HeaderStyles.navItem) }) { Text("Projects") }
            A(href = "#contacts", attrs = { classes(HeaderStyles.navItem) }) { Text("Contacts") }
//            A(href = "#") { Text("About Us") }
//            Button(attrs = { classes("sign-in-button") }) { Text("Sign In") }
        }
    }
}