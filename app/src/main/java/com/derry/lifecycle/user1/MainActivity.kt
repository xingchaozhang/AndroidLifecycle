package com.derry.lifecycle.user1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.derry.lifecycle.R

// TODO 第一个版本 监听器监听生命周期
class MainActivity : AppCompatActivity() {

    private var myListener: MyListener ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myListener = MyListener()
    }

    override fun onStart() {
        super.onStart()
        myListener ?.start() // 会出现人为失误，一旦出现人为失误 造成不一致性功能问题
    }

    override fun onStop() {
        super.onStop()
        myListener ?.stop() // 会出现人为失误
    }
}