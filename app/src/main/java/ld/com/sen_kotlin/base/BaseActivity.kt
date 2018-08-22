package ld.com.sen_kotlin.base

import android.app.Activity
import android.widget.Toast

/**
 * Created by lorin on 2018/8/17.
 */
class BaseActivity :Activity(){

    fun showToast(content:String){
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show()
    }

}