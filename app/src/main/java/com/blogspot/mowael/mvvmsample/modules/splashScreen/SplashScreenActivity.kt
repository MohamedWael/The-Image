package com.blogspot.mowael.mvvmsample.modules.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.blogspot.mowael.mvvmsample.R
import com.blogspot.mowael.mvvmsample.modules.home.HomeActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({ startNextActivity() }, 3000)
    }

    private fun startNextActivity() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}
