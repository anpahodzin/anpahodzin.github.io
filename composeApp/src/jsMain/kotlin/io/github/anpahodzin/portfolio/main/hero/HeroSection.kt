package io.github.anpahodzin.portfolio.main.hero

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.hero.title.HeroTitleSecondLayer
import io.github.anpahodzin.portfolio.main.hero.title.HeroTitleFirstLayer
import io.github.anpahodzin.portfolio.main.hero.views.HeroLayout
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

private object HeroSectionStyle : StyleSheet() {
    val largeCellImage by style {
        position(Position.Absolute)
        bottom(0.px)
        width(100.percent)
    }
    val heroImage by style {
        width(100.percent)

        property("object-fit", "cover")
        borderRadius(24.px)
        mediaPortraitMode {
            width(200.px)
        }
    }
}

@Composable
fun HeroSection() {
    Style(HeroSectionStyle)

    HeroLayout(
        largeGridCell = {
            Div(attrs = { classes(HeroSectionStyle.largeCellImage) }) {
                HeroTitleSecondLayer()
            }
            Div(attrs = { classes(HeroSectionStyle.largeCellImage) }) {
                HeroTitleFirstLayer()
            }
        },
        smallTopGridCell = {
            Img(
                src = "images/avatar.jpg",
                alt = "Profile Photo",
                attrs = { classes(HeroSectionStyle.heroImage) }
            )
        },
        smallBottomGridCell = {
            Text("Hi, I'm Anton, an Android Developer who builds beautiful and intuitive apps.")
        }
    )
}