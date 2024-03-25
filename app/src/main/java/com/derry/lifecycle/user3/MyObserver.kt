package com.derry.lifecycle.user3

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

// 观察者  眼睛
class MyObserver : LifecycleObserver {

    private val TAG = "MyObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME) // 画面可见 就连接
    fun connectListener() = Log.d(TAG,"connectListener run ...")

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)  // 画面不可见 就断开连接
    fun disconnectListener() = Log.d(TAG,"disconnectListener run ...")

}