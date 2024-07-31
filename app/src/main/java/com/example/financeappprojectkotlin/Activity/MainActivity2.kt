package com.example.financeappprojectkotlin.Activity

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.financeappprojectkotlin.Adapter.ExpenseListAdapter
import com.example.financeappprojectkotlin.R
import com.example.financeappprojectkotlin.ViewModel.MainViewModel
import com.example.financeappprojectkotlin.databinding.ActivityMainBinding
import androidx.recyclerview.widget.RecyclerView

import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur

class MainActivity2 : ComponentActivity() {

    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        initRecyclerView()
        setBlurEffect()
    }

    private fun setBlurEffect() {
        val radius = 10f
        val decorView = window.decorView
        val rootView = decorView.findViewById<View>(android.R.id.content) as ViewGroup
        val windowBackground = decorView.background

        binding.blurView.setupWith(rootView)
            .setFrameClearDrawable(windowBackground)
            .setBlurRadius(radius)

        binding.blurView.setOutlineProvider (ViewOutlineProvider.BACKGROUND)
        binding.blurView.setClipToOutline(true)
    }

    private fun initRecyclerView() {
        binding.main.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.main.adapter = ExpenseListAdapter(mainViewModel.loadData())
    }
}
