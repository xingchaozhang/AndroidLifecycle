package com.derry.lifecycle.user3

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

// DefaultLifecycleObserver 就是对 LifecycleObserver 二次封装  为了用户好用
class MyObserver2 : DefaultLifecycleObserver {

    private val TAG = "MyObserver2"

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d(TAG,"onCreate run ...")

        // 项目实战 给大家演示好处 可以拿到 Activity Fragment 所有环境 Toast
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(TAG,"onResume run ...")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d(TAG,"onPause run ...")
    }

}