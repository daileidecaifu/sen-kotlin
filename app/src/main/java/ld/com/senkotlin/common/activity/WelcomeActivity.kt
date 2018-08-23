package ld.com.senkotlin.common.activity

import android.content.pm.PackageManager
import android.os.Bundle
import ld.com.senkotlin.MainActivity
import ld.com.senkotlin.R
import ld.com.senkotlin.base.BaseActivity
import ld.com.senkotlin.base.SenKTApplication
import ld.com.senkotlin.utils.PermissionUtil

/**
 * Created by lorin on 2018/8/23.
 */

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
//        init()
    }

    fun init() {
        if (PermissionUtil.checkWriteStoragePermission(this@WelcomeActivity)) {
            delayJump()
        }
    }

    fun delayJump() {
        Thread.sleep(2000)
        jumpToOtherAndClose(MainActivity::class.java)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == PermissionUtil.REQUEST_EXTERNAL_WRITE) {
            if (grantResults.isNotEmpty()&& grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 权限被用户同意，可以去放肆了。
                delayJump()
            } else {
                // 权限被用户拒绝了，洗洗睡吧。
                showToast("Permission fail, Quit")
                this@WelcomeActivity.finish()

            }
        }
    }
}