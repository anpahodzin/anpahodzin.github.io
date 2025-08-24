package io.github.anpahodzin.portfolio.main.contacts

import androidx.compose.runtime.Composable
import io.github.anpahodzin.portfolio.common.mediaPortraitMode
import io.github.anpahodzin.portfolio.main.aboutme.AboutMeStyles
import io.github.anpahodzin.portfolio.main.header.HeaderLinks
import io.github.anpahodzin.portfolio.resources.Res
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

object ContactsStyles : StyleSheet() {
    val contactsSection by style {
        val topMargin = 60.px
        val bottomMargin = 20.px

        display(DisplayStyle.Grid)
        property("grid-template-columns", "1fr 3fr")
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

    }
}

@Composable
fun ContactsSection() {
    Style(ContactsStyles)

    Div(attrs = {
        id(HeaderLinks.contacts.link)
        classes(ContactsStyles.contactsSection)
    }) {
        H2(attrs = { classes(ContactsStyles.contactsTitle) }) { Text("CONTACTS") }
    }
}