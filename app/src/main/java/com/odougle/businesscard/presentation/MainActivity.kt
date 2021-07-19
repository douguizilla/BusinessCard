package com.odougle.businesscard.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.odougle.businesscard.App
import com.odougle.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    private val mainViewModel: MainViewModel by viewModels{
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getAllBusinessCard()
        insertListener()
    }

    private fun insertListener(){
        binding.tvFloatButton.setOnClickListener {
            val intent = Intent(this@MainActivity, AddBusinessCardActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getAllBusinessCard(){
        mainViewModel.getAll().observe(this, { businessCard ->


        })
    }
}