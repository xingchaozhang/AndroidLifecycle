package com.derry.lifecycle.user5

import android.util.Log

class MyPresenter : IPresenter {
    private val TAG = "test"

    override fun onResume() {
        Log.d(TAG, "Lifecycle call onResume")
    }

    override fun onPause() {
        Log.d(TAG, "Lifecycle call onPause")
    }
}