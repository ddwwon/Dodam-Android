package com.umc.dodam.src.main.home.homeCalenderRecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.umc.dodam.databinding.HomeCalenderItemBinding

class HomeCalenderAdapter (val dayList: ArrayList<String>) : RecyclerView.Adapter<HomeCalenderAdapter.ViewHolder>() {

    lateinit var binding: HomeCalenderItemBinding

//    var dayList = mutableListOf<String>()
    class ViewHolder(val binding: HomeCalenderItemBinding): RecyclerView.ViewHolder(binding.root){
//        fun bind(){
//
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = HomeCalenderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        binding.tvDay.setText(dayList.get(position))
    }

    override fun getItemCount() = dayList.size
}