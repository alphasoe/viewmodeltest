package com.example.viewmodeltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeltest.viewmodel.CalculateViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var calculateViewModel = ViewModelProvider(this).get(CalculateViewModel::class.java)

        result_textView.text =
            if (calculateViewModel.getResult() == 0) "Result: " else "Result: ${calculateViewModel.getResult()
                .toString()}"

        add_btn.setOnClickListener {
            calculateViewModel.setAddResult(
                editText1.text.toString().toInt(),
                editText2.text.toString().toInt()
            )
            result_textView.text = "Result: ${calculateViewModel.getResult().toString()}"
        }

        sub_btn.setOnClickListener {
            calculateViewModel.setSubResult(
                editText1.text.toString().toInt(),
                editText2.text.toString().toInt()
            )
            result_textView.text = "Result: ${calculateViewModel.getResult().toString()}"
        }

        mul_btn.setOnClickListener {
            calculateViewModel.setMulResult(
                editText1.text.toString().toInt(),
                editText2.text.toString().toInt()
            )
            result_textView.text = "Result: ${calculateViewModel.getResult().toString()}"
        }

        div_btn.setOnClickListener {
            calculateViewModel.setDivResult(
                editText1.text.toString().toInt(),
                editText2.text.toString().toInt()
            )
            result_textView.text = "Result: ${calculateViewModel.getResult().toString()}"
        }
    }
}