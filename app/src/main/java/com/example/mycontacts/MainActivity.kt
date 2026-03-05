package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val firstName="Ntokozo"
        val lastName="Ngcobo"
        val  address="25 Abelia street"
        val isMale=false
        val dayOfBirth=23
        val monthOfBirth="may"
        val yearOfBirth=2005

        Log.d("hello", firstName + " " + lastName+ "you live in " + address + " it is" + isMale+ "that you are male, you were born on " +
                ""+ dayOfBirth+" "+ monthOfBirth+" "+yearOfBirth)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}