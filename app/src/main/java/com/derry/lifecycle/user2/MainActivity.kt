package com.derry.lifecycle.user2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.derry.lifecycle.R

// TODO 第二个版本 MVP 的 P层
class MainActivity : AppCompatActivity() {

    private var myPresenter: MyPresenter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myPresenter = MyPresenter()
    }

    override fun onResume() {
        super.onResume()
        myPresenter ?.onResume()  // 会出现人为失误
    }

    override fun onPause() {
        super.onPause()
        myPresenter ?.onPause()  // 会出现人为失误
    }
}