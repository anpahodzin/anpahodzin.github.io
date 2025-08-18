package io.github.anpahodzin.portfolio.main.tech

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.tech.view.PerfectSeamlessMarquee
import io.github.anpahodzin.portfolio.main.tech.view.TechChip

private val items = listOf(
    TechItem(href = "", text = "Kotlin", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin1", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin2", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin3", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin4", icon = "icons/ic_kotlin.svg"),
)

@Composable
fun TechSection() {
    PerfectSeamlessMarquee {
        items.forEach {
            TechChip(href = it.href, text = it.text, icon = it.icon)
        }
    }
}