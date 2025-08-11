package io.github.anpahodzin.portfolio.common.handwritten

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.anpahodzin.portfolio.common.handwritten.PathAnimationStylesheet.draw
import io.github.anpahodzin.portfolio.resources.Res
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.ExperimentalComposeWebSvgApi
import org.jetbrains.compose.web.css.AnimationFillMode
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.animation
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.delay
import org.jetbrains.compose.web.css.duration
import org.jetbrains.compose.web.css.fillMode
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.plus
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.timingFunction
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.ElementScope
import org.jetbrains.compose.web.svg.Defs
import org.jetbrains.compose.web.svg.LinearGradient
import org.jetbrains.compose.web.svg.Mask
import org.jetbrains.compose.web.svg.Path
import org.jetbrains.compose.web.svg.Rect
import org.jetbrains.compose.web.svg.Stop
import org.jetbrains.compose.web.svg.Svg
import org.w3c.dom.svg.SVGDefsElement
import org.w3c.dom.svg.SVGElement
import org.w3c.dom.svg.SVGPathElement

//CSS
private object PathAnimationStylesheet : StyleSheet() {
    val draw by keyframes {
//        from { property("stroke-dashoffset", "100%") }
        to { property("stroke-dashoffset", "0") }
    }

    val maskedPath by style {
        property("fill", "none")
        property("stroke-linecap", "round")
        property("stroke-linejoin", "round")
        property("stroke-width", "13px")
        property("stroke", "white")

        backgroundColor(Color.lightblue)
    }
}

//private fun pathName(index: Int) = "custom-path-id-$index"

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
fun HandwrittenAnimationView(
    viewBox: String,
    paths: List<String>,
    delayAnimationMs: Int = 2000,
    durationAnimationMs: Int = 5000,
) {
    Style(PathAnimationStylesheet)

    val uniqueName = viewBox.replace(" ","-")
    val pathName: (Int) -> String = { index -> "custom-path-id-$uniqueName-$index" }

    var pathLengthList by remember { mutableStateOf(emptyList<Float>()) }


    LaunchedEffect(Unit) {
        window.requestAnimationFrame {
            paths.forEachIndexed { index, path ->
                (document.getElementById(pathName(index)) as? SVGPathElement)?.let { element ->
                    pathLengthList = pathLengthList + element.getTotalLength()
//                    println("Length ${pathName(index)}: ${element.getTotalLength()}")
                }
            }
        }
    }

    Svg(viewBox) {
        val gradientId = "rainbow-gradient$uniqueName"
        val maskId = "title-mask$uniqueName"
        Defs {
            RainbowLinearGradient(gradientId)
        }

        Mask(maskId) {
            val pieceOfDuration = durationAnimationMs / pathLengthList.sum()
//            println("pieceOfDuration: $pieceOfDuration")
            paths.forEachIndexed { index, path ->
                Path(d = path, attrs = {
                    id(pathName(index))
                    classes(PathAnimationStylesheet.maskedPath)

                    style {
                        val length = pathLengthList.getOrNull(index)?: return@style
                        val pastLength = pathLengthList.take(index).sum()
                        property("stroke-dasharray", "$length")
                        property("stroke-dashoffset", "$length")
//                        println("style id: ${pathItem.id} length: $length time: ${pieceOfDuration * length} pastLength: $pastLength delay: ${delayAnimationMs.ms +(pieceOfDuration * pastLength).ms}")

                        animation(draw) {
                            delay(delayAnimationMs.ms + (pieceOfDuration * pastLength).ms)

                            duration((pieceOfDuration * length).ms)
                            timingFunction(AnimationTimingFunction.Linear)
                            fillMode(AnimationFillMode.Forwards)
                        }
                    }
                })

            }
        }

        Rect(x = 0.px, y = 0.px, width = 100.percent, height = 100.percent, attrs = {
            attr("fill", "url(#$gradientId)")
            attr("mask", "url(#$maskId)")
        })
    }
}

@OptIn(ExperimentalComposeWebSvgApi::class)
@Composable
private fun ElementScope<SVGElement>.RainbowLinearGradient(id: String) {
    LinearGradient(attrs = { id(id) }) {
        Stop(attrs = {
            attr("offset", "0%")
            style {
                property("stop-color", Res.Colors.dodgerBlue)
            }
        })
        Stop(attrs = {
            attr("offset", "33%")
            style {
                property("stop-color", Res.Colors.violet)
            }
        })
        Stop(attrs = {
            attr("offset", "66%")
            style {
                property("stop-color", Res.Colors.pink)
            }
        })
        Stop(attrs = {
            attr("offset", "100%")
            style {
                property("stop-color", Res.Colors.orange)
            }
        })
    }
}