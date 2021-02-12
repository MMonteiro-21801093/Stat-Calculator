package com.example.statscalculator.ui.centraltrend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Math.pow
import java.lang.Math.sqrt

class CentralTrendViewModel : ViewModel() {
    private val _resultMean = MutableLiveData<String>().apply {
        value = ""
    }
    val resultMean: LiveData<String> = _resultMean

    private val _resultTotalNumbers = MutableLiveData<String>().apply {
        value = ""
    }
    val resultTotalNumbers: LiveData<String> = _resultTotalNumbers

    private val _resultRange = MutableLiveData<String>().apply {
        value = ""
    }
    val resultRange: LiveData<String> = _resultRange

    private val _resultStandardDeviation = MutableLiveData<String>().apply {
        value = ""
    }
    val resultStandardDeviation: LiveData<String> = _resultStandardDeviation

    private val _resultMedian = MutableLiveData<String>().apply {
        value = ""
    }
    val resultMedian: LiveData<String> = _resultMedian

    private val _resultMin = MutableLiveData<String>().apply {
        value = ""
    }
    val resultMin: LiveData<String> = _resultMin

    private val _resultMax = MutableLiveData<String>().apply {
        value = ""
    }
    val resultMax: LiveData<String> = _resultMax

    private val _resultTotalSum = MutableLiveData<String>().apply {
        value = ""
    }
    val resulTotalSum: LiveData<String> = _resultTotalSum

    fun getTotalNumbers(total: String){
        _resultTotalNumbers.value = total
    }
    fun getMean(arrNumbers: List<String>){
        var sumNumbers:Double=0.0
        for (s in arrNumbers) {
           sumNumbers+= s.toDouble()
        }
        val mean:Double = sumNumbers/arrNumbers.size.toDouble()

        _resultMean.value = "%.2f".format( mean.toString().toDouble())
    }

    fun getRange(arrNumbers: List<String>) {
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()

        var result:Double = arrNumbers1[arrNumbers1.size-1]!! - arrNumbers1[0]!!
        _resultRange.value = (result).toString()
    }
    fun getMedian(arrNumbers: List<String>) {
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()
        if(arrNumbers1.size % 2 !=0){
            _resultMedian.value = (arrNumbers1[arrNumbers1.size/2]).toString()
        }else{
            var result:Double = (arrNumbers1[(arrNumbers1.size-1)/2]!! + arrNumbers1[arrNumbers1.size/2]!!)/2.0
            _resultMedian.value = (result).toString()
        }

    }
    fun getStandardDeviation(arrNumbers: List<String>){

        var sumNumbers:Double=0.0
        for (s in arrNumbers) {
            sumNumbers+= s.toDouble()
        }
        val mean:Double = sumNumbers/arrNumbers.size.toDouble()
        sumNumbers=0.0
        for (s in arrNumbers) {
            sumNumbers+= pow(s.toDouble()-mean, 2.0)
        }

        val sD:Double = sqrt( sumNumbers/arrNumbers.size.toDouble())

        _resultStandardDeviation.value = "%.2f".format( sD.toString().toDouble())
    }

    fun getMin(arrNumbers: List<String>)  {
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()
        _resultMin.value = (arrNumbers1[0]).toString()
    }
    fun getMax(arrNumbers: List<String>) {
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()
        _resultMax.value= (arrNumbers1[arrNumbers1.size-1]).toString()
    }
    fun getTotalSum(arrNumbers: List<String>) {
        var sumNumbers:Double=0.0
        for (s in arrNumbers) {
            sumNumbers+= s.toDouble()
        }
        _resultTotalSum.value = "%.2f".format( sumNumbers.toString().toDouble())
    }

    fun intializeFields() {
        _resultMean.value =""
        _resultTotalNumbers.value =""
        _resultRange.value =""
        _resultStandardDeviation.value =""
        _resultMedian.value =""
        _resultMin.value =""
        _resultMax.value =""
        _resultTotalSum.value =""
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}


