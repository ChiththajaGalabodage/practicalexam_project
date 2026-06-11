package com.example.practicalexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.practicalexam.data.AppDatabase
import com.example.practicalexam.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val database = AppDatabase.getDatabase(this)
        val userDao = database.userDao()

        setContent {
            MaterialTheme {
                Surface {
                    AppNavigation(userDao = userDao)
                }
            }
        }
    }
}
