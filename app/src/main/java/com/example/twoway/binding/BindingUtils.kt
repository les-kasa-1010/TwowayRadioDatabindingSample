@file:JvmName("BindingUtils")

package com.example.twoway.binding

import androidx.databinding.InverseMethod


@InverseMethod("buttonIdToType")
fun typeToButtonId(radioType: MainViewModel.RadioType): Int {
    var selectedButtonId = -1

    radioType?.run {
        selectedButtonId = when (this) {
            MainViewModel.RadioType.TYPE_A -> R.id.radioA
            MainViewModel.RadioType.TYPE_B -> R.id.radioB
            MainViewModel.RadioType.TYPE_C -> R.id.radioC
        }
    }

    return selectedButtonId
}

fun buttonIdToType(selectedButtonId: Int): MainViewModel.RadioType? {
    var type: MainViewModel.RadioType? = null
    when (selectedButtonId) {
        R.id.radioA -> {
            type = MainViewModel.RadioType.TYPE_A
        }
        R.id.radioB -> {
            type = MainViewModel.RadioType.TYPE_B
        }
        R.id.radioC -> {
            type = MainViewModel.RadioType.TYPE_C
        }
    }
    return type
}