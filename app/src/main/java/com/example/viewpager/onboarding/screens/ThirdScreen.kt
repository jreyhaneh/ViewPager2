package com.example.viewpager.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.R

class ThirdScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.screen_third, container, false)



        view.findViewById<TextView>(R.id.next_third_screen).setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)

        }
        return view
    }


}