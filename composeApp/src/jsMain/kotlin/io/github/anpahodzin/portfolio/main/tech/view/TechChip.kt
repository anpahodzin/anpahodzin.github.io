package io.github.anpahodzin.portfolio.main.tech.view

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

private object TechChipStyles : StyleSheet() {
    val btn by style {
        display(DisplayStyle.Flex)
        backgroundColor(Color.white)
        color(Color("#111")) //todo hardcoded color
        borderRadius(24.px)
        padding(12.px, 24.px)

        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        textDecorationLine("none")
        columnGap(12.px)

        self + hover style {
            property("box-shadow", "0px 0px 10px 0px #FFFFFF20") //todo hardcoded color
            property("transform", "scale(1.05, 1.05)")
        }
    }

    val img by style {
        width(24.px)
        height(24.px)
        property("object-fit", "cover")
    }
    val text by style {
//        textDecorationLine("none")
    }
}

@Composable
fun TechChip(
    href: String,
    text: String,
    icon: String,
) {
    Style(TechChipStyles)
    A(
        href = href,
        attrs = { classes(TechChipStyles.btn) }) {
        Img(
            src = icon,
            alt = text,
            attrs = { classes(TechChipStyles.img) }
        )
        Div({ classes(TechChipStyles.text) }) {
            Text(text)
        }
    }
}