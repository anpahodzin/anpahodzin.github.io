package io.github.anpahodzin.portfolio.main.experience.view

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.experience.model.Company
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

private object ExperienceStyles : StyleSheet() {
    val container by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        alignItems(AlignItems.Center)
        justifyContent(JustifyContent.SpaceBetween)

        gap(18.px)
        padding(18.px, 24.px)

        textDecorationLine("none")

        mediaPortraitMode {
            gap(12.px)
            padding(12.px, 12.px)
        }
    }
    val containerIconTitle by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        alignItems(AlignItems.Center)
        gap(18.px)
        mediaPortraitMode {
            gap(12.px)
        }
    }
    val containerTitleDesc by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        gap(8.px)
        mediaPortraitMode {
            gap(4.px)
        }
    }
    val icon by style {
        property("aspect-ratio", "1 / 1")
        property("object-fit", "cover")
        width(48.px)
        mediaPortraitMode {
            width(32.px)
        }
    }
    val title by style {
        property("font-weight", "bold")
        fontSize(20.px)
        whiteSpace("nowrap")
        color(Color.black)
        mediaPortraitMode {
            fontSize(18.px)
        }
    }
    val description by style {
        color(Res.Colors.graySteel600)
        mediaPortraitMode {
            fontSize(12.px)
        }
    }
    val date by style {
        property("font-weight", "bold")
        fontSize(30.px)
        whiteSpace("nowrap")
        color(Color.black)
        mediaPortraitMode {
            fontSize(18.px)
        }
    }
}

@Composable
fun CompanyElement(company: Company) {
    Style(ExperienceStyles)
    A(
        href = company.url,
        attrs = {
            classes(ExperienceStyles.container)
            target(ATarget.Blank)
//            rel="noopener noreferrer"
        }) {
        Div(attrs = { classes(ExperienceStyles.containerIconTitle) }) {
            Img(
                src = company.iconUrl,
                alt = company.name,
                attrs = { classes(ExperienceStyles.icon) }
            )
            Div(attrs = { classes(ExperienceStyles.containerTitleDesc) }) {
                Div(attrs = { classes(ExperienceStyles.title) }) {
                    Text(company.name)
                }
                Div(attrs = { classes(ExperienceStyles.description) }) {
                    Text(company.position)
                }
            }
        }
        Div(attrs = { classes(ExperienceStyles.date) }) {
            Text(company.date)
        }
    }
}