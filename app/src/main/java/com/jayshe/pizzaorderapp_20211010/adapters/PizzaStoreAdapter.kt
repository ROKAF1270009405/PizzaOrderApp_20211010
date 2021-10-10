package com.jayshe.pizzaorderapp_20211010.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.jayshe.pizzaorderapp_20211010.R
import com.jayshe.pizzaorderapp_20211010.datas.StoreData

class PizzaStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val data =  mList[position]

        val logoImg = row.findViewById<ImageView>( R.id.logoImg )
        val storeNameTxt = row.findViewById<TextView>( R.id.storeNameTxt )

        storeNameTxt.text = data.name
        return row
    }

}