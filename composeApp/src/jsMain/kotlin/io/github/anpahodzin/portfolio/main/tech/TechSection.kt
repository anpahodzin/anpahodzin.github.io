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
    TechItem(href = "https://kotlinlang.org/", text = "Kotlin", icon = "icons/ic_kotlin.svg"),
    TechItem(href = "https://www.jetbrains.com/kotlin-multiplatform/", text = "KMP", icon = "icons/ic_kmp.svg"),
    TechItem(href = "https://developer.android.com/compose", text = "Jetpack Compose", icon = "icons/ic_jetpack_compose.png"),
    TechItem(href = "https://flutter.dev/", text = "Flutter", icon = "icons/ic_flutter.svg"),
    TechItem(href = "https://dart.dev/", text = "Dart", icon = "icons/ic_dart.svg"),
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