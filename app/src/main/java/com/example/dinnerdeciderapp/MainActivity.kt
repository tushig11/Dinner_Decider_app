package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
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
        if(TextUtils.isEmpty(foodInput.text)) {
            Toast.makeText(this, "Please enter your food name", Toast.LENGTH_LONG).show()
        }else{
            choices.add(foodInput.text.toString())
            foodOutput.text = choices[choices.size - 1]
        }
    }

    fun decideBtnClick(view: View){
        val randomChoice = Random.nextInt(0,choices.size)
        foodOutput.text = choices[randomChoice]
    }
}