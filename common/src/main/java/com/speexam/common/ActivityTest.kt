package com.speexam.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class ActivityTest: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_test)
    }

    fun setNavigation(id: Int) {
        val host = NavHostFragment.create(id)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_test_root, host).setPrimaryNavigationFragment(host)
            .commit()
    }
}