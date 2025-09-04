package io.github.anpahodzin.portfolio.main.experience

import io.github.anpahodzin.portfolio.main.experience.model.Company

object Companies {
    val companies = listOf(
        Company(
            iconUrl = "icons/ic_scnsoft.png",
            url = "https://www.scnsoft.com/",
            name = "Science soft",
            position = "Android, Kotlin Multiplatform, and Flutter Developer",
            date = "2020 - NOW"
        ),
        Company(
            iconUrl = "icons/ic_solveit.svg",
            url = "https://solveit.dev/",
            name = "SolveIt",
            position = "Android Developer",
            date = "2019 - 2020"
        ),
        Company(
            iconUrl = "icons/ic_blakit.png",
            url = "https://blakitech.com/",
            name = "Blakit",
            position = "Android Developer",
            date = "2017 - 2019"
        ),
    )
}