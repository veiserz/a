package com.hashaan.foody.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.hashaan.foody.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var postDelayed = Handler().postDelayed({
            val startAct = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(startAct)
        }, 2000)

    }
    override fun onPause() {
        super.onPause()
        finish()
    }
    }

