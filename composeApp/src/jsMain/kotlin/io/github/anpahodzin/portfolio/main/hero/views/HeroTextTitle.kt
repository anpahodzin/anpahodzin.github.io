package io.github.anpahodzin.portfolio.main.hero.views

import androidx.compose.runtime.*
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle.Companion.Block
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLElement

private object HeroTextTitleStyle : StyleSheet() {
    val heroTitleContainer by style {
//        display(Inline)
    }

    val heroTitle by style {
//        display(Inline)
    }
}

@Composable
fun HeroTextTitle() {
    Style(HeroTextTitleStyle)

    var containerRef by remember { mutableStateOf<HTMLElement?>(null) }
    var textRef by remember { mutableStateOf<HTMLElement?>(null) }

    DisposableEffect(Unit) {
        val callback = {
            val scale = (containerRef?.clientWidth ?: 1).toFloat() / (textRef?.clientWidth ?: 1)
//            textRef?.style?.setProperty("transform", "scale(${scale})")
            println("scale: $scale clientWidth ${containerRef?.clientWidth} clientWidth ${textRef?.clientWidth} scrollWidth ${textRef?.scrollWidth}  textRef $textRef")
        }
        window.requestAnimationFrame {
            println("requestAnimationFrame")
            callback()
        }
        window.addEventListener("resize", { callback() })
        onDispose {
            window.removeEventListener("resize", { callback() })
        }
    }


    Div(attrs = {
        classes(HeroTextTitleStyle.heroTitleContainer)
        style {
            display(Block)
//            property("display", "inline-block")
//            alignItems(AlignItems.Center)
            alignContent(AlignContent.Center)
//            alignSelf(AlignSelf.Center)
//            justifyItems("center")
//            justifySelf("center")
            justifyContent(JustifyContent.Center)
        }
        ref { element ->
            containerRef = element
            onDispose { containerRef = null }
        }
    }) {
        Div(
            attrs = {
                style {
                    property("display", "inline-block")
//                    property("display", "block")
//                    alignItems(AlignItems.Center)
//                    alignContent(AlignContent.Center)
//                    alignSelf(AlignSelf.Center)
//                    justifyItems("center")
//                    justifySelf("center")
//                    justifyContent(JustifyContent.Center)
                }
                ref { element ->
                    textRef = element
                    onDispose { textRef = null }
                }
            }
        ) {
//            Span(attrs = {}) {
                Text("Software")
//            }
            Br()
//            Span(attrs = {}) {
                Text("Engineer")
//            }
        }
//        Span(attrs = {
//            style {
////                display: inline-block;
//                property("display","inline-block")
////                property("display","block")
////                property("white-space", "nowrap")
//                alignItems(AlignItems.Center)
//                alignContent(AlignContent.Center)
//                alignSelf(AlignSelf.Center)
//                justifyItems("center")
//                justifySelf("center")
//                justifyContent(JustifyContent.Center)
//            }
//            ref { element ->
//                println("ref $element")
//                textRef = element
////                element.style
//                onDispose { textRef = null}
//            }
//        }) {
//            Text("Software\nEngineer")
//        }
    }
}