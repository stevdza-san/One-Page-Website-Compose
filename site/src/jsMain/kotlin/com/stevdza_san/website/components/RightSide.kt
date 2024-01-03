package com.stevdza_san.website.components

import androidx.compose.runtime.Composable
import com.stevdza_san.website.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun RightSide(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height((Res.Dimens.MAX_CARD_HEIGHT - 24).px)
            )
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .objectFit(ObjectFit.Cover),
            src = Res.Image.PROFILE_PHOTO
        )
    }
}