package io.github.anpahodzin.portfolio.main.hero.views

import androidx.compose.runtime.*
import kotlinx.browser.window
import kotlinx.coroutines.delay
import org.jetbrains.compose.web.attributes.height
import org.jetbrains.compose.web.attributes.width
import org.jetbrains.compose.web.dom.Canvas
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.Path2D
import kotlin.math.PI

private val path = listOf(
    "M71,48a19.62,19.62,0,0,0,5-13c0-16-11.5-21.5-19-21C42.52,15,37,27,37,39c0,29,30,37,31,70,.42,14-8,29-26,29s-28.5-10.5-28-26c.29-9,2-13,2-13",
    "M120.5,75.5s-21.63-.2-26.5,31c-4.19,26.82,7.75,29.75,11.5,30a6.88,6.88,0,0,0,1,0c4.48,0,20.56-2.13,26.5-31,6.37-30.93-11.5-30-11.5-30h-2c-14,0-26,24.19-11.5,30,15,6,42.5-13,54.5-20,7.43-4.33,45-27,45-49,0-8-4-14-13-14-6.7,0-19,3-25,32-9.19,44.41-27,123.95-27,131s3,9,6,9c9,0,19.59-19,19-36-1-29-11-37-11-37s4,4,14,4c46,0,59-78,59-78s-16,67-16,78c0,9,7,11,11,11,11,0,24-22,24-22",
    "M209,75h33",
    "M209,75h33",
    "M259.5,75.5s-8,33-10,40-3,21,6,21,18-13,21-21c2.22-5.92,11-40,11-40s-9.11,36-10,40c-2,9,1,21,9,21s16-10,19-21c1.6-5.87,10-40,10-40h0c-8.87,27.83-2.78,41,9,41,12,0,18-18,18-18,4.49-11.22,14-21.77,25-22,6.54-.13,9,3,11.14,6.18l-.14-.18c-2.14-3.18-4.46-6.13-11-6-11,.23-19.51,10.78-24,22-2,5-2.9,8-5,14-6,17,2,24,10,24s16-7,21-20c3.07-8,16-41,16-41s-7.72,32.08-11,43c-3,10,2,18,10,18,11,0,15.89-16,20-27,12-32,13.28-34.76,13-34l-15,61s6-32,18-45c13-14,27-16,27-16",
    "M447.5,103.5s16,2,22,1,20-8,20-18c0-8-5-10-12-10-5.56,0-24,13-24,41,0,7,3,19,15,19,16,0,35-23,35-23",
    "M74.5,198.5s4-2,4-11-6-16-19-16c-20,0-20,23-20,25,0,13,11,24,11,24s-34.47-3-36,43c-1,24,15,30,27,30,34,0,57-61,57-61l-14,61s20-61,39-61c5.11,0,9,4,7,12-2.72,10.88-8.31,28.39-8,40,0,6,3,9,7,9,15,0,21.42-19.29,31-40,4.3-9.3,10-21,23-21,11.86,0,15,13,15,13h0s-3.14-13-15-13c-13,0-18.7,11.7-23,21-9.58,20.71-4,40,8,40,26,0,33-61,33-61l-20,91c-9,46-56,15-28-7,12.9-10.13,17.25-12.63,34-29s49-55,49-55-5,25-7,36-5,25,5,25,19-19,19-19",
    "M241.5,213.5v1h0",
    "M274.5,232.5l-14,61s20-61,39-61c5.11,0,9,4,7,12-2.72,10.88-8.31,28.39-8,40,0,6,3,9,7,9,8,0,14.17-5.53,19.62-13.84l9.38-18.16c5.09.45,10.59.57,14,0,6-1,20-8,20-18,0-8-5-10-12-10-5.56,0-24,13-24,41,0,7,3,19,15,19,16,0,31-16,36-21a106.8,106.8,0,0,0,9.5-11.23c5,.43,11.23.77,14.5.23,6-1,20-8,20-18,0-8-5-10-12-10-5.56,0-24,13-24,41,0,7,3,19,15,19,16,0,35-15,40-33,3.73-13.42,7-27,7-27l-15,61s6-33,19-46c14-14,26-15,26-15",
)

@Composable
fun HeroCanvas() {
//    Canvas(attrs = {}) {
//
////        c
//    }

//    var canvasRef by remember { mutableStateOf<HTMLCanvasElement?>(null) }
//    var ctx by remember { mutableStateOf<CanvasRenderingContext2D?>(null) }

    LaunchedEffect(Unit) {

        window.requestAnimationFrame {

        }
        delay(1000)

    }


    Canvas({

        width(1000)
        height(1000)
        style {
            property("border", "1px solid black")
        }
        ref { canvas ->
//            canvasRef = canvas
//            ctx =
//            onDispose { ctx = null }


            val ctx = canvas.getContext("2d") as CanvasRenderingContext2D
            ctx.strokeStyle = "orange"
            ctx.fillStyle = "lightblue"
            ctx.fillText("Software\nEngineer",x = 0.0, y = 0.0, )

//            val path =
//                Path2D("M71,48a19.62,19.62,0,0,0,5-13c0-16-11.5-21.5-19-21C42.52,15,37,27,37,39c0,29,30,37,31,70,.42,14-8,29-26,29s-28.5-10.5-28-26c.29-9,2-13,2-13")
//
//
//            ctx.strokeStyle = "lightblue"
//            ctx.lineWidth = 50.0
//            ctx.stroke(path)

            // рисуем сразу
//            ctx.fillStyle = "lightblue"
//            ctx.fillRect(50.0, 50.0, 200.0, 100.0)

//            ctx.beginPath()
//            ctx.arc(200.0, 200.0, 40.0, 0.0, 2 * PI)
//            ctx.fillStyle = "orange"
//            ctx.fill()

//            // можно даже анимацию прямо тут запустить
//            var x = 50.0
//            fun animate() {
//                ctx.clearRect(0.0, 0.0, canvas.width.toDouble(), canvas.height.toDouble())
//                ctx.fillStyle = "green"
//                ctx.beginPath()
//                ctx.arc(x, 150.0, 30.0, 0.0, 2 * PI)
//                ctx.fill()
//                x += 2
//                if (x < canvas.width) {
//                    window.requestAnimationFrame { animate() }
//                }
//            }
//            animate()

            onDispose { /* если нужно очистить */ }
        }
    })
}