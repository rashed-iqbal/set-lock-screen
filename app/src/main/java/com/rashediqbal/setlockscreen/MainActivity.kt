package com.rashediqbal.setlockscreen

import android.app.Dialog
import android.app.admin.DevicePolicyManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lockScreenBtn:Button = findViewById(R.id.lock_screen_btn)
        lockScreenBtn.setOnClickListener {
            val intent = Intent(DevicePolicyManager.ACTION_SET_NEW_PASSWORD)
            startActivity(intent)
        }

        val aboutBtn:ImageButton = findViewById(R.id.aboutBtn)

        aboutBtn.setOnClickListener {
            showAboutDialog()
        }

    }

    private fun showAboutDialog() {
        val aboutDialog = Dialog(this)
        aboutDialog.setContentView(R.layout.about_dialog)
        aboutDialog.show()
    }
}