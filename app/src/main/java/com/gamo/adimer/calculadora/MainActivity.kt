package com.gamo.adimer.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1= findViewById<EditText>(R.id.et1)
        val et2= findViewById<EditText>(R.id.et2)
        val r1= findViewById<RadioButton>(R.id.r1)
        val r2= findViewById<RadioButton>(R.id.r2)
        val r3= findViewById<RadioButton>(R.id.r3)
        val r4= findViewById<RadioButton>(R.id.r4)
        val tv1= findViewById<TextView>(R.id.tv1)
        val button= findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (r1.isChecked){
                val num1=et1.text.toString().toInt()
                val num2=et2.text.toString().toInt()
                tv1.text="Resultado = ${num1+num2}"
            }
            if (r2.isChecked){
                val num1=et1.text.toString().toInt()
                val num2=et2.text.toString().toInt()
                tv1.text="Resultado = ${num1-num2}"
            }
            if (r3.isChecked){
                val num1=et1.text.toString().toInt()
                val num2=et2.text.toString().toInt()
                tv1.text="Resultado = ${num1*num2}"
            }
            if (r4.isChecked){
                val num1=et1.text.toString().toFloat()
                val num2=et2.text.toString().toFloat()
                tv1.text="Resultado = ${num1/num2}"
            }
        }

    }
}