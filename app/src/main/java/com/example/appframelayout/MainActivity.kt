package com.example.appframelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btCalcular.setOnClickListener { view: View? ->


            var peso = txtPeso.text.toString().toDouble()
            var altura = txtAltura.text.toString().toDouble()

            var imc = peso/Math.pow(altura,2.0)

            var rbId = rgSexo.checkedRadioButtonId;
            var faixa = ""

            if(rbId == R.id.rbMasculino){
                //imc para homens

                if(imc < 20.0){
                    faixa = "Abaixo do Normal"
                }
                else if(imc < 24.9){
                    faixa = "Normal"
                }
                else if(imc < 29.9){
                    faixa = "Obesidade Leve"
                }
                else if(imc < 39.9){
                    faixa = "Obesidade Moderada"
                }
                else{
                    faixa = "Obesidade Mórbida"
                }

            }
            else{
                //imc para mulheres

                if(imc < 19.0){
                    faixa = "Abaixo do Normal"
                }
                else if(imc < 23.9){
                    faixa = "Normal"
                }
                else if(imc < 28.9){
                    faixa = "Obesidade Leve"
                }
                else if(imc < 38.9){
                    faixa = "Obesidade Moderada"
                }
                else{
                    faixa = "Obesidade Mórbida"
                }
            }

            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("imc",imc)
            intent.putExtra("faixa",faixa)
            startActivity(intent)


        }


    }
}
