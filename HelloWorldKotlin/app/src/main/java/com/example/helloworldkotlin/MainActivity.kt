package com.example.helloworldkotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val TAG = "Salut";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Bonjour Alex"

        Log.i(TAG, text)

        val v: Int = 54
        val n = v / 9-2
        Log.i(TAG, "n :"+n)
        val f = factorielle(n)
        Log.i(TAG, "$n! = $f")
    }

    private fun factorielle(n : Int): Int {
        var r = 0
        if (n > 1) {
            val fnm1: Int = factorielle(n - 1)
            n * fnm1
        } else {
            1
        }
        return r
    }
}