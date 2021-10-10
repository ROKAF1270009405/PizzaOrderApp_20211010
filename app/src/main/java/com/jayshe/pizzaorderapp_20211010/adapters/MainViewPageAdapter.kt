package com.jayshe.pizzaorderapp_20211010.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.jayshe.pizzaorderapp_20211010.fragments.MyProfileFragment
import com.jayshe.pizzaorderapp_20211010.fragments.PizzaStoreListFragment

class MainViewPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {

        return when(position) {

            0-> PizzaStoreListFragment()
            else -> MyProfileFragment()

        }

    }


}