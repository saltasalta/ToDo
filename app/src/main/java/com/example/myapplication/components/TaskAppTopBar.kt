package com.example.myapplication.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

class TaskAppTopBar {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TaskAppTopBar(
        deleteAllTasksDialog: MutableState<Boolean>,
    ) {
        TopAppBar(
            title = {
                Text(text = "My Task App")
            },
            actions = {
                IconButton(onClick = {
                    deleteAllTasksDialog.value = true
                }) {
                    Icon(
                        Icons.Default.Delete,
                        contentDescription = "Delete Icon",
                        tint = MaterialTheme.colorScheme.error
                    )
                }
            })
    }



}