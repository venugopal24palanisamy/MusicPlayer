package io.venu.musicplayer.onBoarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.venu.musicplayer.R
import io.venu.musicplayer.databinding.ItemOnboardingAdapterBinding
import io.venu.musicplayer.onBoarding.onBoardingModal.onBoardingDataClass

class onBoardingAdapter(private var onBoardingList: ArrayList<onBoardingDataClass>) :
    RecyclerView.Adapter<onBoardingAdapter.ViewHolder>() {

    lateinit var bind: ItemOnboardingAdapterBinding

    class ViewHolder(bind: ItemOnboardingAdapterBinding) :
        RecyclerView.ViewHolder(bind.root) {
        fun bind(onBoardingDataClass: onBoardingDataClass) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        bind = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_onboarding_adapter,
            parent,
            false
        )

        return ViewHolder(bind)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(onBoardingList[position])

    }

    override fun getItemCount(): Int {
        return onBoardingList.size
    }
}