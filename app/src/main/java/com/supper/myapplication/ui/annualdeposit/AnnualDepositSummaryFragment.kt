package com.supper.myapplication.ui.annualdeposit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.supper.myapplication.databinding.FragmentAnnualDepositSummaryBinding

class AnnualDepositSummaryFragment : Fragment() {

    private var _binding: FragmentAnnualDepositSummaryBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: AnnualDepositSummaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnnualDepositSummaryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(AnnualDepositSummaryViewModel::class.java)
        // TODO: Observe ViewModel data and update UI
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}