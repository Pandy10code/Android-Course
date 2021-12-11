package com.example.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.correo)
        val celular = findViewById<EditText>(R.id.celular)
        val clave = findViewById<EditText>(R.id.clave)
        val boton = findViewById<Button>(R.id.enviar)

        boton.setOnClickListener {
            //Instruccion para verificar que el boton se este pulsando.
            Log.d("MainActivity", "Pulsar botton")
            //Instruccion para presentar un mensaje breve al pie de la app
            val mensaje = "Email: ${email.text}, Fono: ${celular.text}"

            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }
    }
}