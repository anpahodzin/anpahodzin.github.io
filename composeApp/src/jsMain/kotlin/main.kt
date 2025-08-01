import io.github.anpahodzin.portfolio.common.CommonStyles
import io.github.anpahodzin.portfolio.common.GlobalStyles
import io.github.anpahodzin.portfolio.main.MainPage
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposableInBody

fun main() {
    renderComposableInBody {
        Style(GlobalStyles)
        Style(CommonStyles)
        MainPage()
    }
}