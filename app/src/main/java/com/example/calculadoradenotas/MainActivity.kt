package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btCalcular = CalcularNotas
        val resultado = Resultado

        btCalcular.setOnClickListener{
            val N1 = Integer.parseInt(Nota1.text.toString())
            val N2 = Integer.parseInt(Nota2.text.toString())
            val Falta = Integer.parseInt(Ft.text.toString())
            val Media = (N1+N2)/2

            if (Media >= 7 && Falta <=10){

                resultado.setText("Aluno foi Aprovado!" + "\n" + "Obteve Nota Final: " + Media + "\n" + " E teve: " + Falta +"Faltas")
                resultado.setTextColor(Color.BLUE)
            }else{

                resultado.setText("Aluno foi Reprovado!" + "\n" + "Obteve Nota Final: " + Media + "\n" + " E teve: " + Falta +"Faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}