package com.example.viewpagertest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: MyAdapter
    private lateinit var viewPager: ViewPager2

    private lateinit var fragments : Array<Fragment>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragments = arrayOf(BlankFragment(),BlankFragment2(),BlankFragment3())

        adapter = MyAdapter(this)
        adapter.setFragments(fragments)

        viewPager = findViewById(R.id.pager)
        viewPager.adapter = adapter

        viewPager.currentItem = 1
    }


}