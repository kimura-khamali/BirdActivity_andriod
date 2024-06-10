package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBadBinding
import com.squareup.picasso.Picasso

class ThirdBadActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
    lateinit var binding: ActivityThirdBadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBadBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val btnprev2= findViewById<ImageView>(R.id.btnprev2)
//        val btnmext3 = findViewById<ImageView>(R.id.btnmext3)
        binding.btnprev2.setOnClickListener{
            finish()
        }
        binding.btnmext3.setOnClickListener {
            val intent = Intent(this,FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1606567595334-d39972c85dbe?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D").into(binding.imageView14)
    }
}