package com.stevdza_san.website.components

import androidx.compose.runtime.Composable
import com.stevdza_san.website.util.Res
import com.stevdza_san.website.util.Res.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
) {
    Link(path = link) {
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = if (colorMode.isLight) Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                    else Res.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
                )
                .onClick { onClick?.invoke() }
        ){
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    Github(
        icon = Res.Icon.GITHUB,
        link = "https://github.com/stevdza-san"
    ),
    GithubLight(
        icon = Res.Icon.GITHUB_LIGHT,
        link = "https://github.com/stevdza-san"
    ),
    Gitlab(
        icon = Res.Icon.GITLAB,
        link = "https://gitlab.com"
    ),
    GitlabLight(
        icon = Res.Icon.GITLAB_LIGHT,
        link = "https://gitlab.com"
    ),
    Instagram(
        icon = Res.Icon.INSTAGRAM,
        link = "https://www.instagram.com/stevdza_san"
    ),
    InstagramLight(
        icon = Res.Icon.INSTAGRAM_LIGHT,
        link = "https://www.instagram.com/stevdza_san"
    )
}