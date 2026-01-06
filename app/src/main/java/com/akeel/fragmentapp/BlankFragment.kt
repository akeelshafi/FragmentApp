package com.akeel.fragmentapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LifeCycle","onCreateView")
        return inflater.inflate(R.layout.fragment_blank, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LifeCycle","onViewCreated")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCycle","onDestroyView")
    }
}
