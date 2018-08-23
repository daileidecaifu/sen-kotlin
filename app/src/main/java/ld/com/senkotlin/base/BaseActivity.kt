package ld.com.senkotlin.base

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by lorin on 2018/8/17.
 */
open class BaseActivity : AppCompatActivity() {

    fun showToast(content: String) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
    }

    protected fun jumpToOther(cls: Class<*>) {
        startActivity(Intent(this, cls))
    }

    protected fun jumpToOtherAndClose(cls: Class<*>) {
        startActivity(Intent(this, cls))
        finish()
    }
}