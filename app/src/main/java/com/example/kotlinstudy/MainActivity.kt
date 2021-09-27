package com.example.kotlinstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinstudy.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {    // 앱이 최초 실행됐을 때 수행 //액티비티가 최초 실행되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // xml 화면 뷰를 연결한다.
        btn_a.setOnClickListener {
            // var : 변수 값이 언제든지 변경 될 수 있음.
            // val : 자바에서는 final 값이 변경되지 못하는 변수.

            val intent = Intent(this, SubActivity::class.java)  // 다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg", tv_sendMeg.text.toString())    // HelloWorld 라는 텍스트 값을 담은 뒤 msg 라는 키로 잠갔다.
            startActivity(intent)   // intent 에 저장되어있는 액티비티 쪽으로 이동한다.
            finish()                // 자기 자신 액티비티를 파괴한다.
        }
    }
}