package com.example.dodam.src.main.home

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dodam.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class WriteScheduleFragment() : BottomSheetDialogFragment(){
//    , Parcel
//    constructor(parcel: Parcel) : this() {
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_write_schedule, container, false)
    }

//    override fun dismiss() {
//        super.dismiss()
//    }
}