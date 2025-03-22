package com.example.data_onboarding

import com.example.domain.OnboardingRepository

class OnboardingRepositoryImpl(
    private val pref: SharedPreferenceManager
): OnboardingRepository {
    override fun getFirstScreen(): String{
        return if(pref.isFirstLaunch()){
            "onboarding"
        }
        else "home"
    }

    override fun setFirstLaunchCompleted() {
        pref.setFirstLaunchCompleted()
    }

}