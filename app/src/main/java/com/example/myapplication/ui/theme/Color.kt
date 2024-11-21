package com.example.myapplication.ui.theme

import androidx.compose.ui.graphics.Color

// ...
val ColorScheme.backgroundColor
    @Composable
    get() = if (isSystemInDarkTheme()) Gray800 else Gray300

val Gray300 = Color(0xFFE0E0E0)
val Gray800 = Color(0xFF424242)