package com.example.myloginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       login_btn.setOnClickListener {

           var status=if (username_in.text.toString().equals("alvingayao")
                   && password_in.text.toString().equals("password")) "Logged In Successfully!"

           else "Login Failed!"
           Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
       }
    }

    private fun showActivities(){
        activities_layout.visibility=View.VISIBLE
        tasks_layout.visibility=View.GONE
        home_in.visibility=View.GONE
    }
    private fun showTasks(){
        activities_layout.visibility=View.GONE
        tasks_layout.visibility=View.VISIBLE
        home_in.visibility=View.GONE
    }
}