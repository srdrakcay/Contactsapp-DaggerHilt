package com.serdar.kisilerapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.serdar.kisilerapp.databinding.ActivityMainBinding
import com.serdar.kisilerapp.databinding.FragmentAddBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.addButton.setOnClickListener {

            val intent = Intent(this, FragmentAddBinding::class.java)
            startActivity(intent)
             }

    }

}