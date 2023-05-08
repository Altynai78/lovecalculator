package com.example.lovecalculator.remote

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lovecalculator.R

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    val viewModel: LoveViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            calculateBtn.setOnClickListener {
                viewModel.liveLove(firstNameEd.text.toString(), secondNameEd.text.toString())
                    .observe(viewLifecycleOwner) { loveModel ->
                        Log.e("ololo", "initClickers: ${loveModel}")
                    }
            }
        }
    }}