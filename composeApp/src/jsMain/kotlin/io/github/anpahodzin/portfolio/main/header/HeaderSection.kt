package io.github.anpahodzin.portfolio.main.header

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

private object HeaderStyles : StyleSheet() {
    val header by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        padding(0.px, 40.px)
        height(Res.Sizes.headerHeight)

        backgroundColor(Res.Colors.headerBackground)
//            borderRadius(16.px)
        property("box-shadow", "0px 0px 5px 2px ${Res.Colors.headerShadow}")
        property("backdrop-filter", "blur(10px)")
        property("-webkit-backdrop-filter", "blur(10px)")

        position(Position.Fixed)
        top(0.px)
        right(0.px)
        left(0.px)
        property("z-index", "1000")
    }
    val navLeft by style {
        display(DisplayStyle.Flex)
        alignItems(AlignItems.Center)
        gap(12.px)
        fontSize(1.2.em)
    }
    val logo by style {
        width(48.px)
        property("aspect-ratio", "1/1")
        property("object-fit", "cover")

        borderRadius(24.px)
        property("box-shadow", "0px 0px 10px 0px #FFFFFF20") //todo hardcoded color
    }
    val navMenu by style {
        display(DisplayStyle.Flex)
        gap(12.px)
    }
    val navItem by style {
        textDecorationLine("none")
        color(Color.white)

        property("white-space", "nowrap")
        borderRadius(24.px)
        padding(8.px, 8.px)

        self + hover style {
            backgroundColor(Res.Colors.gray)
        }
    }
    val signInButton by style {
        backgroundColor(Color("#000000"))
        color(Color("#FFFFFF"))
        padding(8.px, 20.px)
        borderRadius(20.px)
    }
}

@Composable
fun HeaderSection() {
    Style(HeaderStyles)

    Nav(attrs = { classes(HeaderStyles.header) }) {
        Div(attrs = { classes(HeaderStyles.navLeft) }) {
            Img(
                src = "site-icons/android-chrome-512x512.png",
                alt = "Logo",
                attrs = { classes(HeaderStyles.logo) }
            )
            Text("Anton Pahodzin")
        }
        Div(attrs = { classes(HeaderStyles.navMenu) }) {
            HeaderLinks.links.forEach { link ->
                A(
                    href = link.toAnchor(),
                    attrs = { classes(HeaderStyles.navItem) }) { Text(link.text) }
            }
//            A(href = "#") { Text("About Us") }
//            Button(attrs = { classes("sign-in-button") }) { Text("Sign In") }
        }
    }
}