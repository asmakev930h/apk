package com.example.hellotermuxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellotermuxapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changeGreetingButton.setOnClickListener {
            binding.greetingTextView.text = "Button Tapped! Ready for Compilation."
        }
    }
}
