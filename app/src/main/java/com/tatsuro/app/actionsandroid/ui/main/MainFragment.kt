package com.tatsuro.app.actionsandroid.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tatsuro.app.actionsandroid.R
import com.tatsuro.app.actionsandroid.databinding.MainFragmentBinding

class MainFragment : Fragment(R.layout.main_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MainFragmentBinding.bind(view)
            .let {
                val viewModel: MainViewModel by viewModels()
                it.lifecycleOwner = viewLifecycleOwner
                it.viewModel = viewModel
            }
    }
}
