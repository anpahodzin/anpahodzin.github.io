package io.github.anpahodzin.portfolio.main.contacts

data class Contact(val link: String, val icon: String, val text: String)

object Contacts{
    val contacts = listOf(
        Contact("https://github.com/anpahodzin/MultiplatformNews", "icons/ic_github.svg", "GitHub"),
        Contact("https://www.linkedin.com/in/anton-pahodzin", "icons/ic_linkedin.svg", "LinkedIn"),
        Contact("https://x.com/anpahodzin", "icons/ic_x.svg", "Twitter / X"),
        Contact("mailto:anton.pahodzin@gmail.com", "icons/ic_mail.svg", "Email"),
    )
}