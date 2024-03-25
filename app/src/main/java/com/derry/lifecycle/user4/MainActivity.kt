package com.derry.lifecycle.user4

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.derry.lifecycle.R

// TODO 第四个版本  会内部类 监听
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 一般是在BaseActivity 关联注册的
        lifecycle.addObserver(MyObserver())
    }

    inner class MyObserver : LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun onResume() {
            Log.d(TAG, "Lifecycle call onResume");
            // 逻辑
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onPause() {
            Log.d(TAG, "Lifecycle call onPause");
        }
    }

    /*override fun onResume() {
        super.onResume()
        // 逻辑
    }*/
}