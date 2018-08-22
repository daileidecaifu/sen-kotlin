package ld.com.sen_kotlin.uicomponents

import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by lorin on 2018/8/17.
 */
class TitleBar {

    val TYPE_COMMON: Int = 1
    var type: Int = TYPE_COMMON
    var titleView: View? = null

    var layoutLeft: LinearLayout? = null
    var layoutRight: LinearLayout? = null
    var textViewTitle: TextView? = null
    var textViewRight: TextView? = null
    var mainLayout: RelativeLayout? = null

    constructor()

    constructor(titleView: View, type: Int) : this() {
        this.type = type
        this.titleView = titleView
    }

    fun setLeftVisibility(currentVisibility: Int) {
        layoutLeft?.visibility = currentVisibility
    }

    fun setRightVisibility(currentVisibility: Int) {
        layoutRight?.visibility = currentVisibility
    }
}