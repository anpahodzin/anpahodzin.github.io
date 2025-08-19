package io.github.anpahodzin.portfolio.main.tech

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.tech.view.PerfectSeamlessMarquee
import io.github.anpahodzin.portfolio.main.tech.view.TechChip
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.maxWidth
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

object TechSectionStyle : StyleSheet() {

    val techSection by style {
        val topMargin = 60.px
        val bottomMargin = 60.px
        property("margin", "$topMargin auto $bottomMargin")
    }

    val title by style {
        property("padding", "0px ${Res.Sizes.baseHorizontalPadding} 20px")
        property("margin", "0 auto")

        maxWidth(Res.Sizes.maxWidth)
    }
}

private val items = listOf(
    TechItem(href = "", text = "Kotlin", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin1", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin2", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin3", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "", text = "Kotlin4", icon = "icons/ic_kotlin.svg"),
)

@Composable
fun TechSection() {
    Style(TechSectionStyle)
    Div(attrs = { classes(TechSectionStyle.techSection) }) {
        H2(attrs = { classes(TechSectionStyle.title) }) {
            Text("SKILLS")
        }
        PerfectSeamlessMarquee(
            speed = 30.s,
            gap = 32.px,
        ) {
            items.forEach {
                TechChip(href = it.href, text = it.text, icon = it.icon)
            }
        }
    }
}