package com.derry.lifecycle.user5

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

interface IPresenter : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume()

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause()

}