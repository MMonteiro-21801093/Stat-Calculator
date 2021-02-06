package com.example.statscalculator.ui.centraltrend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.statscalculator.R

 class CentralTrendFragment : Fragment(), View.OnClickListener {
    private lateinit var root: View
    private lateinit var centralTrendViewModel: CentralTrendViewModel
    private lateinit var editTextInsert: EditText
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        centralTrendViewModel =ViewModelProvider(this).get(CentralTrendViewModel::class.java)

            root = inflater.inflate(R.layout.fragment_centraltrend, container, false)

        editTextInsert = root.findViewById<View>(R.id.editTextInsert) as EditText
        val btCalculate = root.findViewById<View>(R.id.btCalculate) as Button
        val btReset = root.findViewById<View>(R.id.btReset) as Button
        btCalculate.setOnClickListener(this)
        btReset.setOnClickListener(this)
        return root
    }
     private fun validateFields(): Boolean {
         if ( editTextInsert.text.length > 0)   {
             return true
         }

         Toast.makeText(activity, getString(R.string.error_message01), Toast.LENGTH_SHORT).show()
         return false
     }
     override fun onClick(view: View?) {
         if(view!=null){
             if (view.id == R.id.btCalculate) {
                 if(validateFields()){
                     calculateCentralTrend()
                 }
             }
             if (view.id == R.id.btReset) {
                 intializeFields()
             }
         }

     }

     private fun intializeFields() {
         val editTextTotalNumbers:TextView =  root.findViewById(R.id.resultTotaNumbers)
         val editTextMean:TextView = root.findViewById(R.id.resultMean)
         val resultRange:TextView = root.findViewById(R.id.resultRange)
         val resultStandardDeviation:TextView = root.findViewById(R.id.resultStandardDeviation)
         val resultMedian:TextView = root.findViewById(R.id.resultMedian)
         val resultMin:TextView = root.findViewById(R.id.resultMin)
         val resultMax:TextView = root.findViewById(R.id.resultMax)
         val resulTotalSum:TextView = root.findViewById(R.id.resulTotalSum)
         editTextInsert.setText("")
         editTextTotalNumbers.text = ""
         editTextMean.text = ""
         resultRange.text = ""
         resultStandardDeviation.text = ""
         resultMedian.text = ""
         resultMin.text =""
         resultMax.text =""
         resulTotalSum.text = ""
     }


     private fun calculateCentralTrend() {
             val editTextTotalNumbers:TextView =  root.findViewById(R.id.resultTotaNumbers)
             val editTextMean:TextView = root.findViewById(R.id.resultMean)
             val resultRange:TextView = root.findViewById(R.id.resultRange)
             val resultStandardDeviation:TextView = root.findViewById(R.id.resultStandardDeviation)
             val resultMedian:TextView = root.findViewById(R.id.resultMedian)
             val resultMin:TextView = root.findViewById(R.id.resultMin)
             val resultMax:TextView = root.findViewById(R.id.resultMax)
             val resulTotalSum:TextView = root.findViewById(R.id.resulTotalSum)

             val arrNumbers: List<String> = editTextInsert.text.split(",")
             editTextTotalNumbers.text = arrNumbers.size.toString()
             editTextMean.text = centralTrendViewModel.getMean(arrNumbers)
             resultRange.text = centralTrendViewModel.getRange(arrNumbers)
             resultStandardDeviation.text = centralTrendViewModel.getStandardDeviation(arrNumbers)
             resultMedian.text = centralTrendViewModel.getMedian(arrNumbers)
             resultMin.text = centralTrendViewModel.getMin(arrNumbers)
             resultMax.text = centralTrendViewModel.getMax(arrNumbers)
             resulTotalSum.text = centralTrendViewModel.getTotalSum(arrNumbers)
     }


 }






