package ru.resodostudios.cashsense.wallet.widget.ui

import androidx.compose.runtime.Composable
import androidx.glance.GlanceTheme
import ru.resodostudios.cashsense.core.designsystem.theme.supportsDynamicTheming

@Composable
fun CsGlanceTheme(
    content: @Composable () -> Unit,
) {
    GlanceTheme(
        colors = if (supportsDynamicTheming()) GlanceTheme.colors else CsGlanceColorScheme.colors,
        content = content,
    )
}