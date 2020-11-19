import java.util.*

data class Presentation(
        val presenter: Presenter,
        val title: String,
        val type: PresentationType = PresentationType.Talk,
        val synopsis: String,
        val startsAt: Long,
        val duration: Int = 30,
        val requiredLevel: Level = Level.Fundamentals,
        val id: Int = 0
)

data class Presenter(
        val name: String,
        val familyName: String,
        val bio: String = ""
)

sealed class PresentationType {
    object Talk : PresentationType()
    object Workshop : PresentationType()
}

sealed class Level {
    object Fundamentals : Level()
    object Intermediate : Level()
    object Advanced : Level()
}

val presentationMock = Presentation(
        presenter = Presenter(
                name = "Oussama",
                familyName = "Hafferssas",
                bio = "Software Engineer"
        ),
        title = "Interesting facts about Jetpack Compose",
        synopsis = "Even though Jetpack Compose just hit alpha, it has generated huge interest in the Android community. This workshop covers an introduction to the fundamental parts of Compose: setting up views, managing state, and theming. Combining these three areas provides a delightful user experience for any app. By the end of the session, viewers will have an understanding of how to create a UI in compose and have confidence in their ability to use Compose to quickly create a screen in their apps.",
        startsAt = Calendar.getInstance(TimeZone.getTimeZone("GMT+1")).apply {
            set(2020, 11, 14, 20, 0)
        }.timeInMillis,
        duration = 60,
        requiredLevel = Level.Intermediate
)