package io.github.anpahodzin.portfolio.main.contacts

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.header.HeaderLinks
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*

private object ContactsStyles : StyleSheet() {
    val contactsSection by style {
        val topMargin = 60.px
        val bottomMargin = 20.px

        display(DisplayStyle.Grid)
        property("grid-template-columns", "1fr 2fr")
        property("grid-template-rows", "1fr")
        columnGap(40.px)

        property("padding", "0px ${Res.Sizes.baseHorizontalPadding}")
        property("margin", "$topMargin auto $bottomMargin")
        maxWidth(Res.Sizes.maxWidth)
//        property("height", "calc(100vh - $topMargin - $bottomMargin)")

        mediaPortraitMode {
            property("grid-template-columns", "1fr")
            property("grid-template-rows", "auto auto auto")
            height(auto)
        }
    }

    val contactsTitle by style {
        marginBottom(20.px)
    }

    val contactsRight by style {
//        display(DisplayStyle.Block)
//        flexDirection(FlexDirection.Column)

        property("display", "flex")
        property("flex-direction", "column")
//        property("align-items","flex-start")

    }

    val btn by style {
//        property("display", "inline-flex")
//        display(DisplayStyle.LegacyInlineFlex)
//        backgroundColor(Color.white)

        property("display", "flex")
//        width: fit-content;
        property("width", "fit-content")
//        property("flex-direction","column")
//        property("align-items","flex-start")
//        property("display","inline")


//        display: block;

//        flex-direction: column;
//        align-items: flex-start;


        color(Color.white) //todo hardcoded color
        borderRadius(24.px)
        padding(12.px, 12.px)

//        flexDirection(FlexDirection.Row)
//        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        textDecorationLine("none")
        columnGap(12.px)

        self + hover style {
            backgroundColor(Res.Colors.gray)
        }
    }

    val img by style {
        width(24.px)
        height(24.px)
        property("object-fit", "cover")
        property("flex-shrink", "0")
        property("fill", "white")
    }

    val text by style {
//        white-space: nowrap;
        property("white-space", "nowrap")
    }
}

@Composable
fun ContactsSection() {
    Style(ContactsStyles)

    Div(attrs = {
        id(HeaderLinks.contacts.link)
        classes(ContactsStyles.contactsSection)
    }) {
        H2(attrs = { classes(ContactsStyles.contactsTitle) }) {
            Text("CONTACTS")
        }
        Div(attrs = { classes(ContactsStyles.contactsRight) }) {
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
                        attrs = { classes(ContactsStyles.img) }
                    )
                    Div({ classes(ContactsStyles.text) }) {
                        Text(it.text)
                    }
                }
            }
        }
    }
}