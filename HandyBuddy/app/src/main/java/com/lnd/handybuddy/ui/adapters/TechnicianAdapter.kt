package com.lnd.handybuddy.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lnd.handybuddy.R

class TechnicianAdapter(private val technicianList: List<Technician>) :
    RecyclerView.Adapter<TechnicianAdapter.TechnicianViewHolder>() {

    class TechnicianViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgProfile: ImageView = itemView.findViewById(R.id.img_profile)
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnicianViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_technician, parent, false)
        return TechnicianViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TechnicianViewHolder, position: Int) {
        val technician = technicianList[position]
        holder.tvName.text = technician.name
    }

    override fun getItemCount(): Int {
        return technicianList.size
    }
}
