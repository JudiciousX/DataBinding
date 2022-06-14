package acom.example.databinding

import acom.example.databinding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val binding : ActivityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.button.setOnClickListener {
//            binding.user = User().apply {
//
//            }
//        }
        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.user = User()

    }
}