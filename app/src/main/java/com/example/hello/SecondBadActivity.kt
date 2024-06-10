package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBadBinding
import com.squareup.picasso.Picasso

class SecondBadActivity : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")
    lateinit var binding: ActivitySecondBadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondBadBinding.inflate((layoutInflater))
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        val btnprev= findViewById<ImageView>(R.id.btnprev)
//        val btnnext2 = findViewById<ImageView>(R.id.btnnext2)
        binding.btnprev.setOnClickListener{
            finish()
        }
       binding.btnnext2.setOnClickListener {
            val intent = Intent(this,ThirdBadActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1620694563886-c3a80ec55f41?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGJpcmRzfGVufDB8fDB8fHww")
            .into(binding.ImageView3)
    }
}