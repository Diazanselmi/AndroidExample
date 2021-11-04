package com.interiori.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.interiori.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.helloButton.setOnClickListener {
            binding.greetingTextView.text = "Hello ${binding.nameEditText.text}"
        }
    }
}