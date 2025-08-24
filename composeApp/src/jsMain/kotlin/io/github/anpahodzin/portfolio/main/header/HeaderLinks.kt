package io.github.anpahodzin.portfolio.main.header

data class HeaderLink(val link: String, val text: String) {
    fun toAnchor(): String = "#$link"
}

object HeaderLinks {
    val aboutMe = HeaderLink("aboutMe", "About Me")
    val projects = HeaderLink("projects", "Projects")
    val skills = HeaderLink("skills", "Skills")
    val contacts = HeaderLink("contacts", "Contacts")

    val links = listOf(
        aboutMe,
        projects,
//        skills,
        contacts
    )
}