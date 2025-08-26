package io.github.anpahodzin.portfolio.main.tech

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.main.tech.view.PerfectSeamlessMarquee
import io.github.anpahodzin.portfolio.main.tech.view.TechChip
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

object TechSectionStyle : StyleSheet() {
    val techSection by style {
        property("padding", "0")
        property("grid-template-columns", "1fr")
        maxWidth("none")
    }
    val title by style {
        property("margin", "0 auto")
        width(100.percent)
    }
}

private val items = listOf(
    TechItem(href = "https://kotlinlang.org/", text = "Kotlin", icon = "icons/ic_kotlin.svg"),
    TechItem(
        href = "https://www.jetbrains.com/kotlin-multiplatform/",
        text = "KMP",
        icon = "icons/ic_kmp.svg"
    ),
    TechItem(
        href = "https://developer.android.com/compose",
        text = "Jetpack Compose",
        icon = "icons/ic_jetpack_compose.png"
    ),
    TechItem(
        href = "https://www.jetbrains.com/compose-multiplatform/",
        text = "Compose Multiplatform",
        icon = "icons/ic_compose_multiplatform.svg"
    ),
    TechItem(href = "https://flutter.dev/", text = "Flutter", icon = "icons/ic_flutter.svg"),
    TechItem(href = "https://dart.dev/", text = "Dart", icon = "icons/ic_dart.svg"),
    TechItem(href = "https://bloclibrary.dev/", text = "Bloc", icon = "icons/ic_bloc.svg"),
    TechItem(href = "https://insert-koin.io/", text = "Koin", icon = "icons/ic_koin.png"),
    TechItem(href = "https://ktor.io/", text = "Ktor", icon = "icons/ic_ktor.png"),
    TechItem(href = "https://arkivanov.github.io/Decompose/", text = "Decompose", icon = "icons/ic_decompose.png")
)

@Composable
fun TechSection() {
    Style(TechSectionStyle)
    Div(attrs = {
        classes(
            TechSectionStyle.techSection,
            CommonStyles.sectionMarginPaddingRule,
            CommonStyles.sectionGrid
        )
    }) {
        H2(attrs = {
            classes(
                TechSectionStyle.title,
                CommonStyles.sectionMarginPaddingRule,
            )
        }) {
            Text("SKILLS")
        }
        PerfectSeamlessMarquee(
            speed = 30.s,
            gap = 32.px,
        ) {
            items.forEach {
                TechChip(it)
            }
        }
    }
}