package ld.com.senkotlin.base

import android.app.Application

/**
 * Created by lorin on 2018/8/17.
 */

class SenKTApplication : Application() {

    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

    }

}