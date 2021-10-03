package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "홍드로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.student, "안드로이드", 15, "아이폰 앱 개발자"),
            Profiles(R.drawable.man, "김드로이드", 43, "리액트 앱 개발자"),
            Profiles(R.drawable.student, "신드로이드", 45, "플러터 앱 개발자"),
            Profiles(R.drawable.man, "이드로이드", 19, "유니티 앱 개발자"),
            Profiles(R.drawable.student, "윤드로이드", 86, "알고리즘 앱 개발자"),
            Profiles(R.drawable.student, "민드로이드", 11, "웹 앱 개발자"),
            Profiles(R.drawable.man, "공드로이드", 64, "하이브리드 앱 개발자"),
            Profiles(R.drawable.student, "찰드로이드", 32, "그냥 앱 개발자"),
            Profiles(R.drawable.student, "정드로이드", 33, "배고픈 앱 개발자"),
            Profiles(R.drawable.man, "고드로이드", 26, "졸린 앱 개발자")
        )
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)
    }
}