package com.example.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.kotlinstudy.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {    // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = arrayOf("사과", "배", "딸기", "키위", "파인애플")
        // context 란 한 액티비티의 모든 정보를 담고있다.
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

    }
}