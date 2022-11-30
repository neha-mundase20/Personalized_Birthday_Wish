package com.example.birthdaygreetinginternlabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /*fun createBirthdayCard(view: View) {
        //val value = "Button is clicked"

        //val duration = Toast.LENGTH_LONG

        //val name = nameInput.editableText.toString()

        //val name ="Button is clicked"

        //Toast.makeText(this,name, Toast.LENGTH_LONG).show()

    }*/

    fun createBirthdayCard(view: View) {
        var name= findViewById<EditText>(R.id.nameInput) .editableText.toString()
        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()

        val intent = Intent(this,BirthdayGreetingExtension::class.java)
        //syntax to call new activity
        //Intent manages switching of activity

        intent.putExtra(BirthdayGreetingExtension.NAME_EXTRA,name)
        //passing name parameter to next activity

        startActivity(intent)
        //inherited method from AppCompactActivity
        //when button will be clicked we wil shift to new activity
    }
}