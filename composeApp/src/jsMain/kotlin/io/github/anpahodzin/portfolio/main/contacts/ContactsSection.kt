package io.github.anpahodzin.portfolio.main.contacts

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.main.header.HeaderLinks
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

private object ContactsStyles : StyleSheet() {
    val btn by style {
        property("display", "flex")
        property("width", "fit-content")

        color(Color.white)
        borderRadius(24.px)
        padding(12.px, 12.px)

        alignItems(AlignItems.Center)
        textDecorationLine("none")
        columnGap(12.px)

        self + hover style {
            backgroundColor(Res.Colors.gray)
        }
    }
}

@Composable
fun ContactsSection() {
    Style(ContactsStyles)

    Div(attrs = {
        id(HeaderLinks.contacts.link)
        classes(CommonStyles.autoSizedCenterSection, CommonStyles.appGridSection)
    }) {
        H2(attrs = { style { marginBottom(20.px) } }) {
            Text("CONTACTS")
        }
        Div {
            Contacts.contacts.forEach {
                A(
                    href = it.link,
                    attrs = {
                        classes(ContactsStyles.btn)
                        target(ATarget.Blank)
//                        rel="noopener noreferrer"
                    }) {
                    Img(
                        src = it.icon,
                        alt = it.text,
                        attrs = { classes(CommonStyles.smallIcon) }
                    )
                    Div({ style { property("white-space", "nowrap") } }) {
                        Text(it.text)
                    }
                }
            }
        }
    }
}