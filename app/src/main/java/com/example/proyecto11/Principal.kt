package com.example.proyecto11

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Principal : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Trabajo de Jorge Mañas Garcia

        val boton = findViewById<Button>(R.id.button)
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val resultado = findViewById<TextView>(R.id.textoResultado)

        boton.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            if(val1 > val2){
                resultado.setText("El mayor es $val1")
            }
            else if(val1 < val2){
                resultado.setText("El mayor es $val2")
            }
            else{
                resultado.setText("")
            }
        }
    }
}