package com.example.assembletheconstructoryourself


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.assembletheconstructoryourself.databinding.FragmentFirstPageBinding

class FirstPageFragment : Fragment() {

    private var _binding: FragmentFirstPageBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstPageBinding.inflate(inflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    // Обработчик нажатия кнопки "Добавить детали"
        binding.addDetailsButton.setOnClickListener {
            findNavController().navigate(R.id.secondPageFragment)
        }
        // Переход на вторую страницу
    }
}