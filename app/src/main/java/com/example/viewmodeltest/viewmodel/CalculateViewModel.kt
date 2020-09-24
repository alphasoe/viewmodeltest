package com.example.viewmodeltest.viewmodel

import androidx.lifecycle.ViewModel

class CalculateViewModel : ViewModel() {
    private var result: Int = 0

    fun getResult(): Int = result

    fun setAddResult(v1: Int, v2: Int) {
        result = v1 + v2
    }

    fun setSubResult(v1: Int, v2: Int) {
        result = v1 - v2
    }

    fun setMulResult(v1: Int, v2: Int) {
        result = v1 * v2
    }

    fun setDivResult(v1: Int, v2: Int) {
        result = v1 / v2
    }
}