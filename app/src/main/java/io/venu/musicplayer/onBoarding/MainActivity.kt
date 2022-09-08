package io.venu.musicplayer.onBoarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import io.venu.musicplayer.R
import io.venu.musicplayer.databinding.ActivityMainBinding
import io.venu.musicplayer.onBoarding.adapter.onBoardingAdapter
import io.venu.musicplayer.onBoarding.onBoardingModal.onBoardingDataClass

class MainActivity : AppCompatActivity() {

    val onBoardDataList = ArrayList<onBoardingDataClass>()


    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        setAdapter()

    }

    private fun setAdapter() {

        activityMainBinding.onboardingViewPager.adapter = onBoardingAdapter(getOnBoardingList())
    }

    private fun initViews() {

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private fun getOnBoardingList(): ArrayList<onBoardingDataClass> {
        onBoardDataList.add(
            onBoardingDataClass(
                getString(R.string.onboard_one_dec),
                R.raw.onboard_one
            )
        )
        onBoardDataList.add(
            onBoardingDataClass(
                getString(R.string.onboard_two_dec),
                R.raw.onboard_two
            )
        )
        onBoardDataList.add(
            onBoardingDataClass(
                getString(R.string.onboard_three_dec),
                R.raw.onboard_three
            )
        )
        println(onBoardDataList.size.toString())

        return onBoardDataList
    }
}