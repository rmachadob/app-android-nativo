package com.example.appframelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class activity_resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)



        lbIMC.text = intent.getDoubleExtra("imc",0.0).toString()
        lbFaixa.text = intent.getStringExtra("faixa")



    }
}
