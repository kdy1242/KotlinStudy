package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {    // 해당 액티비티가 처음 실행될 때 한번 수행하는 곳 (초기화)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        /* 웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 */
        webView.loadUrl("https://www.naver.com")    // 링크 주소를 Load 함
    }

    override fun onBackPressed() {
        if(webView.canGoBack()) {
            // 웹사이트에서 뒤로 갈 페이지가 존재한다면...
            webView.goBack()    // 웹사이트 뒤로가기
        }
        else {
            super.onBackPressed()   // 본래의 백버튼 기능 수행 (안드로이드)
        }
    }
}