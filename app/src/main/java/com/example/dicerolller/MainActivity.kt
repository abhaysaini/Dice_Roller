package com.example.dicerolller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
//            Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
//        val rollText :TextView = findViewById(R.id.roll_text)
        val rollImage:ImageView = findViewById(R.id.roll_image)
//        val randomInt = Random().nextInt(6)+1
        val drawableResource = when(Random().nextInt(6)+1){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        rollImage.setImageResource(drawableResource)
//        rollText.text = randomInt.toString()
    }
}