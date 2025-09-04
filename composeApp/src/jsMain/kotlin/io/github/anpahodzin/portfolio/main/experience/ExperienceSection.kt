package io.github.anpahodzin.portfolio.main.experience

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.experience.view.CompanyElement
import io.github.anpahodzin.portfolio.main.header.HeaderLinks
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Text

private object ExperienceSectionStyle : StyleSheet() {
    private val borderRadius = 24.px

    val container by style {
        backgroundColor(Res.Colors.graySteel200)
        borderRadius(borderRadius)
        width(100.percent)
    }
    val element by style {
        property("transition", "background-color 0.8s ease")
        self + hover style {
            backgroundColor(Res.Colors.graySteel400)
        }
    }
    val topBorder by style {
        borderRadius(
            topLeft = borderRadius, topRight = borderRadius, bottomRight = 0.px, bottomLeft = 0.px
        )
    }
    val bottomBorder by style {
        borderRadius(
            topLeft = 0.px, topRight = 0.px, bottomRight = borderRadius, bottomLeft = borderRadius
        )
    }
    val divider by style {
        height(1.px)
        backgroundColor(Res.Colors.graySteel400)
        margin(0.px, 24.px)
        mediaPortraitMode {
            margin(0.px, 12.px)
        }
    }
}

@Composable
fun ExperienceSection() {
    Style(ExperienceSectionStyle)

    Div(attrs = {
        id(HeaderLinks.experience.link)
        classes(CommonStyles.sectionMarginPaddingRule, CommonStyles.sectionGridRule)
    }) {
        H2 { Text("EXPERIENCE") }
        Div(attrs = { classes(ExperienceSectionStyle.container) }) {
            Companies.companies.forEachIndexed { index, item ->
                Div(attrs = {
                    classes(buildList {
                        add(ExperienceSectionStyle.element)
                        if (index == 0) add(ExperienceSectionStyle.topBorder)
                        if (index == Companies.companies.size - 1) add(ExperienceSectionStyle.bottomBorder)
                    })
                }) {
                    CompanyElement(item)
                    if (index != Companies.companies.size - 1) {
                        Div(attrs = { classes(ExperienceSectionStyle.divider)})
                    }
                }
            }
        }
    }
}