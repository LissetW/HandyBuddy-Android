package com.lnd.handybuddy.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lnd.handybuddy.R
import com.lnd.handybuddy.ui.adapters.TechnicianAdapter

class SearchFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TechnicianAdapter
    private lateinit var technicianList: List<Technician>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSearchBinding.inflate(inflater, container, false)

        // Datos de ejemplo
        technicianList = listOf(
            Technician("Juan Pérez", "path_to_image", 4.5),
            Technician("Maria Gómez", "path_to_image", 4.7)
        )

        // Configurar RecyclerView
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = TechnicianAdapter(technicianList)
        recyclerView.adapter = adapter

        return binding.root
    }
}