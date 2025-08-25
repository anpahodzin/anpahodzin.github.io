package io.github.anpahodzin.portfolio.main.tech.view

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.tech.TechItem
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

private object TechChipStyles : StyleSheet() {
    val btn by style {
        display(DisplayStyle.Flex)
        backgroundColor(Color.white)
        color(Res.Colors.cursedBlack)
        borderRadius(24.px)
        padding(12.px, 24.px)

        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        textDecorationLine("none")
        columnGap(12.px)

        self + hover style {
            property("box-shadow", "0px 0px 10px 0px ${Res.Colors.headerShadow}")
            property("transform", "scale(1.05, 1.05)")
        }
    }
    val img by style {
        width(24.px)
        height(24.px)
        property("object-fit", "cover")
    }
    val text by style {
        property("white-space", "nowrap")
    }
}

@Composable
fun TechChip(item: TechItem) {
    Style(TechChipStyles)
    A(
        href = item.href,
        attrs = {
            classes(TechChipStyles.btn)
            target(ATarget.Blank)
//          rel="noopener noreferrer"
        }) {
        item.icon?.let {
            Img(
                src = item.icon,
                alt = item.text,
                attrs = { classes(TechChipStyles.img) }
            )
        }
        Div({ classes(TechChipStyles.text) }) {
            Text(item.text)
        }
    }
}