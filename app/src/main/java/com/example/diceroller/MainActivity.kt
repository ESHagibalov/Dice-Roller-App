package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.urov
            2 -> R.drawable.shef
            3 -> R.drawable.protass
            4 -> R.drawable.kulyash
            5 -> R.drawable.hud
            6 -> R.drawable.dshasg
            7-> R.drawable.white
            else-> R.drawable.zhenashefa
        }

        val drawableResource1 = when (randomInt1) {
            1 -> R.drawable.urov
            2 -> R.drawable.shef
            3 -> R.drawable.protass
            4 -> R.drawable.kulyash
            5 -> R.drawable.hud
            6 -> R.drawable.dshasg
            7-> R.drawable.white
            else-> R.drawable.zhenashefa
        }


        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.urov
            2 -> R.drawable.shef
            3 -> R.drawable.protass
            4 -> R.drawable.kulyash
            5 -> R.drawable.hud
            6 -> R.drawable.dshasg
            7-> R.drawable.white
            else-> R.drawable.zhenashefa
        }
        diceImage.setImageResource(drawableResource)
        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)


    }
}
