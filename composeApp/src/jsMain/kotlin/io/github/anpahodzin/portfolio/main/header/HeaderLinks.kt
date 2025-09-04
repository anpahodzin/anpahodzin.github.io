package io.github.anpahodzin.portfolio.main.header

data class HeaderLink(val link: String, val text: String) {
    fun toAnchor(): String = "#$link"
}

object HeaderLinks {
    val aboutMe = HeaderLink("aboutMe", "About Me")
    val experience = HeaderLink("experience", "Experience")
    val contacts = HeaderLink("contacts", "Contacts")

    val links = listOf(
        aboutMe,
        experience,
        contacts
    )
}