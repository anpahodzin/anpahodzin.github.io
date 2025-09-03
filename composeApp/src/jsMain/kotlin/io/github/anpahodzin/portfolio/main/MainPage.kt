package io.github.anpahodzin.portfolio.main

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.aboutme.AboutMeSection
import io.github.anpahodzin.portfolio.main.contacts.ContactsSection
import io.github.anpahodzin.portfolio.main.footer.FooterSection
import io.github.anpahodzin.portfolio.main.header.HeaderSection
import io.github.anpahodzin.portfolio.main.hero.HeroSection
import io.github.anpahodzin.portfolio.main.tech.TechSection
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.dom.Div

object MainStyle : StyleSheet() {

    val pageContainer by style {
    }
}

@Composable
fun MainPage() {
    Style(MainStyle)

    Div(attrs = { classes(MainStyle.pageContainer) }) {
        HeaderSection()
        HeroSection()
        TechSection()
        AboutMeSection()
        ContactsSection()
        FooterSection()
    }
}