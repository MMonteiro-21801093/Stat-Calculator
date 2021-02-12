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
import androidx.lifecycle.Observer
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

        val resultMean:TextView = root.findViewById(R.id.resultMean)
        centralTrendViewModel.resultMean.observe(viewLifecycleOwner, Observer {
            resultMean.text = it
        })
        val resultTotalNumbers:TextView = root.findViewById(R.id.resultTotalNumbers)
        centralTrendViewModel.resultTotalNumbers.observe(viewLifecycleOwner, Observer {
            resultTotalNumbers.text = it
        })
        val resultRange:TextView = root.findViewById(R.id.resultRange)
        centralTrendViewModel.resultRange.observe(viewLifecycleOwner, Observer {
            resultRange.text = it
        })
        val resultStandardDeviation:TextView = root.findViewById(R.id.resultStandardDeviation)
        centralTrendViewModel.resultStandardDeviation.observe(viewLifecycleOwner, Observer {
            resultStandardDeviation.text = it
        })
        val resultMedian:TextView = root.findViewById(R.id.resultMedian)
        centralTrendViewModel.resultMedian.observe(viewLifecycleOwner, Observer {
            resultMedian.text = it
        })
        val resultMin:TextView = root.findViewById(R.id.resultMin)
        centralTrendViewModel.resultMin.observe(viewLifecycleOwner, Observer {
            resultMin.text = it
        })
        val resultMax:TextView = root.findViewById(R.id.resultMax)
        centralTrendViewModel.resultMax.observe(viewLifecycleOwner, Observer {
            resultMax.text = it
        })
        val resulTotalSum:TextView = root.findViewById(R.id.resulTotalSum)
        centralTrendViewModel.resulTotalSum.observe(viewLifecycleOwner, Observer {
            resulTotalSum.text = it
        })
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
         editTextInsert.setText("")
         centralTrendViewModel.intializeFields()
     }


     private fun calculateCentralTrend() {
             val arrNumbers: List<String> = editTextInsert.text.split(",")
             centralTrendViewModel.getTotalNumbers(arrNumbers.size.toString())
             centralTrendViewModel.getMean(arrNumbers)
             centralTrendViewModel.getRange(arrNumbers)
             centralTrendViewModel.getStandardDeviation(arrNumbers)
             centralTrendViewModel.getMedian(arrNumbers)
             centralTrendViewModel.getMin(arrNumbers)
             centralTrendViewModel.getMax(arrNumbers)
             centralTrendViewModel.getTotalSum(arrNumbers)
     }


 }






