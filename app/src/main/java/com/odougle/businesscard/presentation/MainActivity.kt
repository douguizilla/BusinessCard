package com.odougle.businesscard.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.businesscard.R
import com.odougle.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}