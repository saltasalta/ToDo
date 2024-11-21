package com.example.myapplication.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.components.TaskAppTopBar
import com.example.myapplication.view_models.TaskViewModel

class TaskScreen {

    @Composable
    fun TaskScreen(viewModel: TaskViewModel) {
        /* our state doesn't toggle the dialog yet, but we'll come
        back to this */
        val deleteAllTasksDialog = remember {
            mutableStateOf(false)
        }

        Scaffold(
            topBar = {
                TaskAppTopBar(deleteAllTasksDialog)
            }) { paddingValues ->
            // ...
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