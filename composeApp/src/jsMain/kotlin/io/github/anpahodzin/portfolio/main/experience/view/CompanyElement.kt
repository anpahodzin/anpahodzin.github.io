package io.github.anpahodzin.portfolio.main.experience.view

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.main.experience.model.Company
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun CompanyElement(company: Company) {
    Div(attrs = {
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Row)
            alignItems(AlignItems.Center)
            justifyContent(JustifyContent.SpaceBetween)

            gap(18.px)
            padding(18.px, 24.px)
        }
    }) {
        Div(attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
                alignItems(AlignItems.Center)
                gap(18.px)
            }
        }) {
            Img(
                src = company.iconUrl,
                alt = company.name,
                attrs = {
                    style {
                        property("aspect-ratio", "1 / 1")
                        property("object-fit", "cover")
                        width(48.px)
                    }
                }
            )
            Div(attrs = {
                style {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    gap(8.px)
                }
            }) {
                Div(attrs = {
                    style {
                        property("font-weight", "bold")
                        fontSize(20.px)
                        whiteSpace("nowrap")
                        color(Color.black)
                    }
                }) {
                    Text(company.name)
                }
                Div(attrs = {
                    style {
                        color(Res.Colors.graySteel600)
                    }
                }) {
                    Text(company.position)
                }
            }
        }
        Div(attrs = {
            style {
                property("font-weight", "bold")
                fontSize(30.px)
                whiteSpace("nowrap")
                color(Color.black)
            }
        }) {
            Text(company.date)
        }
    }
}