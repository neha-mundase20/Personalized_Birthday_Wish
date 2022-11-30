package com.example.birthdaygreetinginternlabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StringRes
import com.bumptech.glide.Glide
import com.example.birthdaygreetinginternlabs.R.*

class BirthdayGreetingExtension : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        //to ensure that the passed and received name values are sam
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_birthday_greeting_extension)

        val id1 = findViewById<ImageView>(id.imageView);

        // Adding the gif here using glide library
        Glide.with(this).load(drawable.bt21_confetti).into(id1);

        val name=intent.getStringExtra(NAME_EXTRA)

        //birthdayGreeting.text="Happy Birthday $name"

        val text1= findViewById<TextView>(id.birthdayGreeting)

        text1.text="Happy Birthday $name"

    }
}