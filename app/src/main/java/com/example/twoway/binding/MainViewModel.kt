package com.example.twoway.binding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.twoway.binding.R

class MainViewModel : ViewModel() {

    enum class RadioType {
        TYPE_A,
        TYPE_B,
        TYPE_C,
    }

    var radioType = MutableLiveData(RadioType.TYPE_A)
}
