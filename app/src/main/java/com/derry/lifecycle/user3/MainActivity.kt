package com.derry.lifecycle.user3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.derry.lifecycle.R

// TODO 第二个版本 MVP 的 P层
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 一般是在BaseActivity 关联注册的
        // 观察者 与 被观察者 关联的环节
        lifecycle.addObserver(MyObserver())
        lifecycle.addObserver(MyObserver2())
    }

}