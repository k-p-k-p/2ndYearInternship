package com.example.jetpackone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.example.jetpackone.ui.theme.JetPackOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JetPackOneTheme {
               Column (

               ) {
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "A")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "B")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "C")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "D")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "E")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "F")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "G")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "H")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "I")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "J")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "K")
                   }
                   Row(
                       modifier = Modifier
                           .padding(10.dp)
                           .size(width = 400.dp ,height = 40.dp )
                           .background(Color.Red , RoundedCornerShape(10.dp))
                   ) {
                       Text(text = "L")
                   }
               }
            }
        }
    }
}




