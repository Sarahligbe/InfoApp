package com.example.infoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    var adapter:InfoAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact() {
        adapter = InfoAdapter(this, DummyData.facts)
        binding?.infoLv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}