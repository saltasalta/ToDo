package com.example.myapplication.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

class TaskScreen {

    @Composable
    fun TaskScreen(viewModel: TaskViewModel) {
        Scaffold() { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
            ) {
                Text("Hello, world!")
            }
        }
    }
    // ...
    @Preview
    @Composable
    fun TaskScreenPreview() {
        MyTestApplicationTheme {
            TaskScreen(viewModel = TaskViewModel())
        }
    }

    @Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun DarkTaskScreenPreview() {
        MyTestApplicationTheme {
            TaskScreen(viewModel = TaskViewModel())
        }
    }
}