// Main package for the app if yours is different then you will have to change it to what you have.
package com.example.bookexamplesapp

// Android and Jetpack Compose imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat

// Main activity class - entry point of the app
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookExamplesAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    helloClass(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// Main composable function that displays the UI
@Composable
fun helloClass(modifier: Modifier = Modifier) {
    // Column arranges children vertically
    Column(modifier = modifier.fillMaxSize(), // Fill entire screen
        verticalArrangement = Arrangement.Center, // Center content vertically
        horizontalAlignment = Alignment.CenterHorizontally) { // Center content horizontally
        Text("Hello Class") // Display text
        Text(text = "Welcome to CPS251") // Display text
        Text(text = "Programing in Android") // Display text
    }
}

/**
 * Preview for Android Studio's design view.
 * This allows you to see the UI in the design tab without running the app.
 */
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun helloClassPreview(){
    helloClass() // Show the same UI as the main function
}

