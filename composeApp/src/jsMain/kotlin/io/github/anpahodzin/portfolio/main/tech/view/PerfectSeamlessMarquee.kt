package io.github.anpahodzin.portfolio.main.tech.view

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

private class PerfectSeamlessMarqueeStyles(
    speed: CSSSizeValue<out CSSUnitTime>,
    gap: CSSNumeric,
) : StyleSheet() {
    val marqueePerfect by style {
        overflow("hidden")
        padding(15.px, 0.px)
        borderRadius(5.px)
    }

    val marqueeKeyframes by keyframes {
        from { property("transform", "translateX(0)") }
        to { property("transform", "translateX(-50%)") }
    }

    val marqueeContentPerfect by style {
        display(DisplayStyle.Flex)
        property("width", "fit-content")
        animation(marqueeKeyframes) {
            timingFunction(AnimationTimingFunction.Linear)
            iterationCount(Int.MAX_VALUE)
            duration(speed)
        }
        property("will-change", "transform")
    }

    val marqueeItemPerfect by style {
        display(DisplayStyle.Flex)
        property("flex-shrink", "0")
        whiteSpace("nowrap")
        color(Color.white)
        fontSize(18.px)
        fontWeight("bold")
        columnGap(gap)
        paddingLeft(gap)
    }

    init {
        desc(className(marqueePerfect) + hover, className(marqueeContentPerfect)) style {
            property("animation-play-state", "paused")
        }
    }
}

@Composable
fun PerfectSeamlessMarquee(
    speed: CSSSizeValue<out CSSUnitTime>,
    gap: CSSNumeric,
    content: ContentBuilder<HTMLDivElement>? = null,
) {
    val style = PerfectSeamlessMarqueeStyles(speed, gap)

    Style(style)

    Div(attrs = { classes(style.marqueePerfect) }) {
        Div(attrs = { classes(style.marqueeContentPerfect) }) {
            repeat(6) { // todo
                Div(attrs = { classes(style.marqueeItemPerfect) }, content = content)
            }
        }
    }
}