package com.example.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.kotlinstudy.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var UserList = arrayListOf<User>(
        User(R.drawable.android, "자바", "18", "안녕하세요"),
        User(R.drawable.android2, "자바스크립트", "21", "반갑다"),
        User(R.drawable.android, "코틀린", "24", "집가고싶다"),
        User(R.drawable.android2, "스위프트", "27", "안녕"),
        User(R.drawable.android, "안드로이드", "25", "심심하다"),
        User(R.drawable.android2, "리액트 네이티브", "12", "자고싶다")
    )

    override fun onCreate(savedInstanceState: Bundle?) {    // 액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }
    }
}