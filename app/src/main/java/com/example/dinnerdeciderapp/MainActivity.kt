package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var choices = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print(choices.size)
        setContentView(R.layout.activity_main)
    }

    fun addBtnClick(view: View){
        choices.add(foodInput.text.toString())
        foodOutput.text = choices[choices.size-1]
        print(choices.size)
    }

    fun decideBtnClick(view: View){
        val randomChoice = Random.nextInt(0,choices.size)
        foodOutput.text = choices[randomChoice]
    }
}