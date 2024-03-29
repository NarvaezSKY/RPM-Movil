package com.rpm.rpmsqlite

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.rpm.rpmsqlite.Rmotos.GarajeActivity
import com.rpm.rpmsqlite.Routes.ListarRutasActivity
import com.rpm.rpmsqlite.Routes.MapsActivity
import com.rpm.rpmsqlite.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnTrazarRuta = binding.btnTrazarRuta
        btnTrazarRuta.setOnClickListener {
            val intent = Intent(requireContext(), MapsActivity::class.java)
            startActivity(intent)
        }
        val btnListarRuta = binding.btnTusRutas
        btnListarRuta.setOnClickListener {
            val intent = Intent(requireContext(), ListarRutasActivity::class.java)
            startActivity(intent)
        }
        binding.btnGaraje.setOnClickListener {
            val intent = Intent(requireContext(), GarajeActivity::class.java)
            startActivity(intent)
        }
        binding.btnExplorar.setOnClickListener {
            Toast.makeText(requireContext(), "Proximamente!!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
