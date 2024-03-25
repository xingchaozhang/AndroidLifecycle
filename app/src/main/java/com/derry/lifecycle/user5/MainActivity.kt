package com.derry.lifecycle.user5

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.derry.lifecycle.R

// TODO 第五个版本  接口监听法，设计模式的设计环节，你会见到这种写法
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private var myPresenter : IPresenter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 一般是在BaseActivity 关联注册的   (省略：工厂设计模式)
        myPresenter = MyPresenter3()

        lifecycle.addObserver(myPresenter !!)
    }
}