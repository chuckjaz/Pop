package jez.jetpackpop.ui

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = AppColors,
        content = content
    )
}

private val AppColors = lightColors(
    primary = Color(0xFF1446A0),
    primaryVariant = Color(0xFF0C2F6F),
    onPrimary = Color.White,

    secondary = Color(0xFFDB3069),
    secondaryVariant = Color(0xFF5F1830),
    onSecondary = Color.White,

    background = Color(0xFF3C3C3B),
    onBackground = Color.White,

    surface = Color(0xFFEBEBD3),
    onSurface = Color(0xFF3C3C3B),

    error = Color(0xFFB00020),
    onError = Color.White,
)

val Colors.overlay: Color @Composable get() = Color(0f, 0f, 0f, 0.33f)

val target1: Color = Color(0xFFDB3069)
val target2: Color = Color(0xFFF5D547)
val target3: Color = Color(0xFF31C059)

