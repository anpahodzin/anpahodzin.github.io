package io.github.anpahodzin.portfolio.main.footer

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

private object FooterStyles : StyleSheet() {
    val footerSection by style {
        val topMargin = 60.px
        val bottomMargin = 20.px

        property("padding", "0px ${Res.Sizes.baseHorizontalPadding}")
        property("margin", "$topMargin auto $bottomMargin")
        maxWidth(Res.Sizes.maxWidth)

        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        gap(24.px)
    }
}

@Composable
fun FooterSection() {
    Style(FooterStyles)

    Div(attrs = {
        classes(FooterStyles.footerSection)
    }) {
        Div(attrs = {
            style {
                width(100.percent)
                height(2.px)
                backgroundColor(Res.Colors.gray)
            }
        })
        Span {
            Text("Developed with ❤\uFE0F in ")
            A("https://kotlinlang.org/") {
                Text("Kotlin")
            }
            Text(" + ")
            A("https://github.com/JetBrains/compose-multiplatform?tab=readme-ov-file#compose-html") {
                Text("ComposeHtml")
            }
            Text(" by me. 2025")
        }
    }
}