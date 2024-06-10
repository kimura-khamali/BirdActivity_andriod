package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val btnprev5= findViewById<ImageView>(R.id.btnprev5)
//        val btnnextpr = findViewById<ImageView>(R.id.btnnextpr)
        binding.btnprev5.setOnClickListener{
            finish()
        }
        binding.btnnextpr.setOnClickListener {
            val intent = Intent(this,fifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1606567595334-d39972c85dbe?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D").into(binding.imageView9)
    }
}