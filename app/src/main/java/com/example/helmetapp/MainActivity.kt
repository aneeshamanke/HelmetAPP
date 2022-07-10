package com.example.helmetapp
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Pattern


public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun openWebURL(view: View) {
        val browse = Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/kux-sqbh-bwy"))
        startActivity(browse)
    }

}