package com.example.statscalculator.ui.centraltrend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Math.pow
import java.lang.Math.sqrt

class CentralTrendViewModel : ViewModel() {
    fun getMean(arrNumbers: List<String>): String {
        var sumNumbers:Double=0.0
        for (s in arrNumbers) {
           sumNumbers+= s.toDouble()
        }
        val mean:Double = sumNumbers/arrNumbers.size.toDouble()

        return "%.2f".format( mean.toString().toDouble())
    }

    fun getRange(arrNumbers: List<String>): String{
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()

        var result:Double = arrNumbers1[arrNumbers1.size-1]!! - arrNumbers1[0]!!
        return (result).toString()
    }
    fun getMedian(arrNumbers: List<String>): String{
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()
        if(arrNumbers1.size % 2 !=0){
            return (arrNumbers1[arrNumbers1.size/2]).toString()
        }
        var result:Double = (arrNumbers1[(arrNumbers1.size-1)/2]!! + arrNumbers1[arrNumbers1.size/2]!!)/2.0
        return (result).toString()
    }
    fun getStandardDeviation(arrNumbers: List<String>): String{

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

        return "%.2f".format( sD.toString().toDouble())
    }

    fun getMin(arrNumbers: List<String>): CharSequence? {
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()
        return (arrNumbers1[0]).toString()
    }
    fun getMax(arrNumbers: List<String>): CharSequence? {
        var arrNumbers1 = arrayOfNulls<Double>(arrNumbers.size)

        for (i in arrNumbers1.indices) {
            arrNumbers1[i]= arrNumbers[i].toDouble()
        }
        arrNumbers1.sort()
        return (arrNumbers1[arrNumbers1.size-1]).toString()
    }
    fun getTotalSum(arrNumbers: List<String>): CharSequence? {
        var sumNumbers:Double=0.0
        for (s in arrNumbers) {
            sumNumbers+= s.toDouble()
        }
        return "%.2f".format( sumNumbers.toString().toDouble())
    }
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}


