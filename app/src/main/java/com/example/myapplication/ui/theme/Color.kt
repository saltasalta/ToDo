package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// ...
val ColorScheme.backgroundColor
    @Composable
    get() = if (isSystemInDarkTheme()) Gray800 else Gray300

val Gray300 = Color(0xFFE0E0E0)
val Gray800 = Color(0xFF424242)