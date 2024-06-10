package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class fifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding= ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val btnprev3= findViewById<ImageView>(R.id.btnprev3)
//        val btnnext4 = findViewById<ImageView>(R.id.btnnext4)
        binding.btnprev3.setOnClickListener{
            finish()
        }
        binding.btnperv4.setOnClickListener {
            val intent = Intent(this,fifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1551085254-e96b210db58a?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YmlyZHxlbnwwfHwwfHx8MA%3D%3D").into(binding.imageView5)
    }

}