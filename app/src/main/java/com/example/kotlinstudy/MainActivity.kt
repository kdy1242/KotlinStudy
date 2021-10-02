package com.example.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.PermissionRequest
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    val REQUEST_IMAGE_CAPTURE = 1   // 카메라 사진 촬영 요청코드
    lateinit var curPhotoPath: String   // 문자열 형태의 사진 경로 값  (초기 값을 null 로 시작하고 싶을 때)

    override fun onCreate(savedInstanceState: Bundle?) {    // 해당 액티비티가 처음 실행될 때 한번 수행하는 곳 (초기화)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setPermission() // 권한을 수행하는 메소드 수행

    }

    // 테드 퍼미션 설정
    private fun setPermission() {
        val permission = object : PermissionListener {
            override fun onPermissionGranted() {    // 설정해놓은 위험권한들이 허용되었을 경우 이곳을 수행함
                Toast.makeText(this@MainActivity, "권한이 허용되었습니다.", Toast.LENGTH_SHORT).show()
            }

            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {  // 설정해놓은 위험권한들 중 거부를 한 경우 이곳을 수행함
                Toast.makeText(this@MainActivity, "권한이 거부되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
        TedPermission.with(this)
            .setPermissionListener(permission)
            .setRationaleMessage("카메라 앱을 사용하시려면 권한을 허용해주세요.")
            .setDeniedMessage("권한을 거부하셨습니다. [앱 설정] -> [권한] 항목에서 허용해주세요.")
            .setPermissions(android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.CAMERA)
            .check()
    }
}