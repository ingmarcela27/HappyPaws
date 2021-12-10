package com.example.happypaws.view.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.happypaws.R


@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //aqui se llama la funcion startimer dentro de la funcion onCreate
        //cuando se inicie la aplicacion va a funcionar se ejecuta la funcion StarTimer y me remite a la vista seleccionada.
        startTimer()
    }
    fun startTimer(){
        object: CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {
            }

            //funcion para que despues de que aparezca el Splash me dirija a la vista que quiero(MainActivity)
            override fun onFinish() {
                val intent = Intent(applicationContext, SignInActivity::class.java).apply {}
                startActivity(intent)
            }

            //se debe colocar para que se inicie correctamente el timer.
         }.start()
    }
}
