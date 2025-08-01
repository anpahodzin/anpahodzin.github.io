package io.github.anpahodzin.portfolio.main.tech

import org.jetbrains.compose.web.css.*

object TechStyles : StyleSheet() {
    val techSection by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        overflowX("auto")
        gap(16.px)
        padding(16.px, 0.px)
    }

    val techCard by style {
        padding(12.px, 24.px)
        border(1.px, LineStyle.Solid, Color.whitesmoke)
        borderRadius(20.px)
        whiteSpace("nowrap")
        backgroundColor(Color("#252525"))
    }
}