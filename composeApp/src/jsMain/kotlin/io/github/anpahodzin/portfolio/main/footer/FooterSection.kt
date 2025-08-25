package io.github.anpahodzin.portfolio.main.footer

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

private object FooterStyles : StyleSheet() {
    val footerSection by style {
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
        classes(FooterStyles.footerSection, CommonStyles.autoSizedCenterSection)
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