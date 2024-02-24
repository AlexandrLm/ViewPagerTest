package com.example.viewpagertest

import android.os.Bundle
import android.provider.Settings.Global.putInt
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class MyAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3
    private var fragments : Array<Fragment> = arrayOf(BlankFragment(),BlankFragment(),BlankFragment())

    override fun createFragment(position: Int) : Fragment {
        //val fragment = BlankFragment()
        //fragment.arguments = Bundle().apply {
        //    putInt(ARG_OBJECT, position)
        //}
        //fragments = arrayOf(BlankFragment(),BlankFragment(),BlankFragment())
        return fragments[position]
    }
    fun setFragments(fragment: Array<Fragment>){
        fragments = fragment
    }
}