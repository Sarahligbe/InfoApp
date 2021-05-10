package com.example.infoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infoapp.databinding.ActivityDetailBinding
import com.example.infoapp.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name:String? = null
    private var detail:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(InfoAdapter.LOGO_EXTRAs,0)
        name = intent.getStringExtra(InfoAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(InfoAdapter.FACT_EXTRAs)
        setUpFactDetail()
    }

    private fun setUpFactDetail(){
        binding?.detailTv?.text = detail
            binding?.logoIv?.setImageResource(logo)
            title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}