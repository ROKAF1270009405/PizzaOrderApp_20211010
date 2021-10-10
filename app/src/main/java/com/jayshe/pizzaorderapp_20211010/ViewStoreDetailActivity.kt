package com.jayshe.pizzaorderapp_20211010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.jayshe.pizzaorderapp_20211010.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        val storeData = intent.getSerializableExtra("store") as StoreData

        Glide.with(this).load(storeData.logoURL).into(logoImg)

        storeNameTxt.text = storeData.name
        phoneNumTxt.text = storeData.phoneNum

    }
}