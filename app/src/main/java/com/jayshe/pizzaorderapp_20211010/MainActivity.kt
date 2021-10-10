package com.jayshe.pizzaorderapp_20211010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jayshe.pizzaorderapp_20211010.adapters.MainViewPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainViewPageAdapter: MainViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewPageAdapter = MainViewPageAdapter(supportFragmentManager)
        mainViewPager.adapter = mainViewPageAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)



    }
}