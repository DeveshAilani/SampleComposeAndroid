package com.example.samplecompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.samplecompose.ui.theme.SampleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    // This modifiers will applies sequentially
                    .background(Color.LightGray)
                    .fillMaxWidth()
                    // .width(300.dp)
                    // .requiredWidth(600.dp)
                    .fillMaxHeight(0.5f)
                    .border(5.dp, Color.Yellow, shape = RoundedCornerShape(15.dp))
                    .padding(16.dp, 32.dp)
                    .border(5.dp, Color.Green)
                    .padding(12.dp)
            ) {
                Text(
                    text = "Hello",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .offset(x = 15.dp, y = 5.dp)
                )

                Spacer(modifier = Modifier.height(50.dp))

                Text(text = "World 1", modifier = Modifier
                    .background(Color.White)
                    .clickable {
                        Toast
                            .makeText(this@MainActivity, "Something clicked", Toast.LENGTH_LONG)
                            .show()
                    })
            }
        }
    }
}