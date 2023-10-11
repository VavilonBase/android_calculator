package com.example.km2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private lateinit var radioButtonPlus: RadioButton
    private lateinit var radioButtonMinus: RadioButton
    private lateinit var radioButtonMul: RadioButton
    private lateinit var radioButtonDiv: RadioButton
    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButtonPlus = findViewById(R.id.radioButtonPlus)
        radioButtonMinus = findViewById(R.id.radioButtonMinus)
        radioButtonMul = findViewById(R.id.radioButtonMul)
        radioButtonDiv = findViewById(R.id.radioButtonDiv)
        number1EditText = findViewById(R.id.editTextNumberDecimal)
        number2EditText = findViewById(R.id.editTextNumberDecimal2)
    }

    fun onClickEqual(view: View) {
        var result = 0.0
        var number1 = number1EditText.text.toString().toDouble()
        var number2 = number2EditText.text.toString().toDouble()
        if (radioButtonPlus.isChecked) {
            result = number1 + number2
        } else if (radioButtonMinus.isChecked) {
            result = number1 - number2
        } else if (radioButtonMul.isChecked) {
            result = number1 * number2
        } else {
            result = number1 / number2
        }
        val intent = Intent(this@MainActivity, ResultActivity::class.java)
        intent.putExtra(MainActivity.RESULT, result)
        startActivity(intent)

    }

    companion object {

        const val RESULT = "RESULT"

    }
}