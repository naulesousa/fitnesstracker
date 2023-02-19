package co.naulesousa.fitnesstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ImcActivity : AppCompatActivity() {

    private lateinit var editWeigth: EditText
    private lateinit var editHeight: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        editWeigth = findViewById(R.id.edit_imc_weight)
        editHeight = findViewById(R.id.edit_imc_height)

        val btnSend: Button = findViewById(R.id.btn_imc_send)
        btnSend.setOnClickListener {

        }
    }

    private fun validate(): Boolean {
        if (editWeigth.text.toString().isNotEmpty() && editHeight.text.toString().isNotEmpty()
            && !editWeigth.text.toString().startsWith("0")
            && !editHeight.text.toString().startsWith("0")) {
            return true
        } else {
            return false
        }
    }
}