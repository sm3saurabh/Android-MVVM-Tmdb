package dev.saurabhmishra.mvvm.ui.base

import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Saurabh Mishra on 01/11/20
 */
class BaseActivity: AppCompatActivity() {

    override fun getLastNonConfigurationInstance(): Any? {
        return super.getLastNonConfigurationInstance()
    }
}