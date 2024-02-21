package com.example.sweetalertdialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cn.pedant.SweetAlert.SweetAlertDialog

class MainActivity : AppCompatActivity() {

    // Step 1 -> Add Dependency of Sweet Alert Dialog Box
    // Step 2 -> Creating UI in activity_main.xml
    // Step 3 -> Implement SweetAlertDialogBox in MainActivity.kt

    override fun onCreate(savedInstanceState: Bundle?) {  //This parameter is a Bundle object that can potentially hold saved state
        // information from the activity's previous lifecycle. It's nullable (Bundle?), meaning it might be null in some cases.
        super.onCreate(savedInstanceState)    // To call parent class of AppCompatActivity so that it should be call first
        setContentView(R.layout.activity_main)    // Associates a visual layout with the activity, defining what the user will see.

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success SweetAlert")
                .setContentText("This is Success Sweet Alert Dialog Box")
                .show()
        }
        btn2.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error SweetAlert")
                .setContentText("This is Error Sweet Alert Dialog Box")
                .show()
        }
        btn3.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning SweetAlert")
                .setContentText("This is Warning Sweet Alert Dialog Box")
                .show()
        }
    }
}