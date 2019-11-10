package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      setListeners()

    }

    private fun setListeners() {
        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(
                Box_One_Text, Box_Two_Text, Box_Three_Text,
                Box_Four_Text, Box_Five_Text, constraint_layout,redButton, greenButton, yellowButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.Box_One_Text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.Box_Two_Text -> view.setBackgroundColor(Color.GRAY)
            R.id.Box_Three_Text -> view.setBackgroundColor(Color.BLUE)
            R.id.Box_Four_Text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.Box_Five_Text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> red_button.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> yellow_button.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> green_button.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setBackgroundResource(){


    }
}
