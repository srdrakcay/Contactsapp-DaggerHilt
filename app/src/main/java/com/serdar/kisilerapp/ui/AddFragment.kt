package com.serdar.kisilerapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.serdar.kisilerapp.R
import com.serdar.kisilerapp.data.model.Kisiler
import com.serdar.kisilerapp.databinding.FragmentAddBinding
import com.serdar.kisilerapp.viewmodel.PersonViewModule
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddFragment : Fragment() {

    private lateinit var binding: FragmentAddBinding
    private lateinit var viewModel: PersonViewModule
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAddBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.add.setOnClickListener {
            addPerson()
        }

    }
    private  fun addPerson(){
        val surname = binding.surname.text.toString()
        val name = binding.name.text.toString()
        val number = binding.number.text.toString()

        val transaction = Kisiler(0, name, number,surname.toLong())
        viewModel.addPersons(transaction)
    }

}