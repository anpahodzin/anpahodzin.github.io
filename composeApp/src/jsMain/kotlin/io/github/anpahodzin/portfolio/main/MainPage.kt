package io.github.anpahodzin.portfolio.main

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.aboutme.AboutMeSection
import io.github.anpahodzin.portfolio.main.header.HeaderSection
import io.github.anpahodzin.portfolio.main.hero.HeroSection
import io.github.anpahodzin.portfolio.main.tech.TechSection
import io.github.anpahodzin.portfolio.main.tech.view.PerfectSeamlessMarquee
import io.github.anpahodzin.portfolio.main.tech.view.TechChip
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div

@Composable
fun MainPage() {
    Style(MainStyle)

    Div(attrs = { classes(MainStyle.pageContainer) }) {
        HeaderSection()
        HeroSection()
        TechSection()
        AboutMeSection()
    }
}