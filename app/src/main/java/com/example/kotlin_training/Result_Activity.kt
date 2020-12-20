package com.example.kotlin_training

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result_.*

class Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tv_score.text = "Your score is $correctAnswer out of $totalQuestion"

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}