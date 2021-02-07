package com.example.statscalculator.ui.anova

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.statscalculator.R

class AnovaFragment : Fragment() , View.OnClickListener{
    private lateinit var root: View
    private lateinit var anovaViewModel: AnovaViewModel
    private lateinit var editLine: EditText
    private lateinit var editColumn: EditText

    private lateinit var cell0: EditText
    private lateinit var cell1: EditText
    private lateinit var cell2: EditText
    private lateinit var cell3: EditText
    private lateinit var cell4: EditText
    private lateinit var cell5: EditText
    private lateinit var cell6: EditText

    private lateinit var cell7: EditText
    private lateinit var cell8: EditText
    private lateinit var cell9: EditText
    private lateinit var cell10: EditText
    private lateinit var cell11: EditText
    private lateinit var cell12: EditText
    private lateinit var cell13: EditText

    private lateinit var cell14: EditText
    private lateinit var cell15: EditText
    private lateinit var cell16: EditText
    private lateinit var cell17: EditText
    private lateinit var cell18: EditText
    private lateinit var cell19: EditText
    private lateinit var cell20: EditText

    private lateinit var cell21: EditText
    private lateinit var cell22: EditText
    private lateinit var cell23: EditText
    private lateinit var cell24: EditText
    private lateinit var cell25: EditText
    private lateinit var cell26: EditText
    private lateinit var cell27: EditText

    private lateinit var cell28: EditText
    private lateinit var cell29: EditText
    private lateinit var cell30: EditText
    private lateinit var cell31: EditText
    private lateinit var cell32: EditText
    private lateinit var cell33: EditText
    private lateinit var cell34: EditText

    private lateinit var cell35: EditText


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        anovaViewModel =
                ViewModelProvider(this).get(AnovaViewModel::class.java)
          root = inflater.inflate(R.layout.fragment_anova, container, false)

        editLine = root.findViewById<View>(R.id.editLine) as EditText
        editColumn = root.findViewById<View>(R.id.editColumn) as EditText


        val btCalculate = root.findViewById<View>(R.id.btCalculate) as Button
        val btReset = root.findViewById<View>(R.id.btReset) as Button
        val btOk = root.findViewById<View>(R.id.btOk) as Button
        btCalculate.setOnClickListener(this)
        btReset.setOnClickListener(this)
        btOk.setOnClickListener(this)

        return root
    }

    override fun onClick(view: View?) {
        if(view!=null){
            if (view.id == R.id.btCalculate) {
                if(validateFieldsANOVA()){

                }
            }
            if (view.id == R.id.btOk) {
                if(validateFieldsMatrix()){
                    formatMatrix()
                }
            }
            if (view.id == R.id.btReset) {
                intializeFields()
            }
        }
    }

    private fun formatMatrix() {
        val col =  editColumn.getText().toString().toInt()
        val row =  editLine.getText().toString().toInt()
        for (c in 1..col) {
            for (r in 1..row) {
                when(c){
                    1-> formatCol1(r)
                    2-> formatCol2(r)
                    3-> formatCol3(r)
                    4-> formatCol4(r)
                    5-> formatCol5(r)
                    6-> formatCol6(r)

                }
            }
        }


    }

    private fun formatCol1(r: Int) {
        if(r==1){
            cell0 = root.findViewById<View>(R.id.cell0) as EditText
            cell0.setVisibility(VISIBLE)
        }
        if(r==2){
            cell6 = root.findViewById<View>(R.id.cell6) as EditText
            cell6.setVisibility(VISIBLE)
        }
        if(r==3){
            cell12 = root.findViewById<View>(R.id.cell12) as EditText
            cell12.setVisibility(VISIBLE)
        }
        if(r==4){
            cell18 = root.findViewById<View>(R.id.cell18) as EditText
            cell18.setVisibility(VISIBLE)
        }
        if(r==5){
            cell24 = root.findViewById<View>(R.id.cell24) as EditText
            cell24.setVisibility(VISIBLE)
        }
        if(r==6){
            cell30 = root.findViewById<View>(R.id.cell30) as EditText
            cell30.setVisibility(VISIBLE)
        }

    }
    private fun formatCol2(r: Int) {
        if(r==1){
            cell1 = root.findViewById<View>(R.id.cell1) as EditText
            cell1.setVisibility(VISIBLE)
        }
        if(r==2){
            cell7 = root.findViewById<View>(R.id.cell7) as EditText
            cell7.setVisibility(VISIBLE)
        }
        if(r==3){
            cell13= root.findViewById<View>(R.id.cell13) as EditText
            cell13.setVisibility(VISIBLE)
        }
        if(r==4){
            cell19 = root.findViewById<View>(R.id.cell19) as EditText
            cell19.setVisibility(VISIBLE)
        }
        if(r==5){
            cell25 = root.findViewById<View>(R.id.cell25) as EditText
            cell25.setVisibility(VISIBLE)
        }
        if(r==6){
            cell31 = root.findViewById<View>(R.id.cell31) as EditText
            cell31.setVisibility(VISIBLE)
        }

    }
    private fun formatCol3(r: Int) {
        if(r==1){
            cell2 = root.findViewById<View>(R.id.cell2) as EditText
            cell2.setVisibility(VISIBLE)
        }
        if(r==2){
            cell8 = root.findViewById<View>(R.id.cell8) as EditText
            cell8.setVisibility(VISIBLE)
        }
        if(r==3){
            cell14= root.findViewById<View>(R.id.cell14) as EditText
            cell14.setVisibility(VISIBLE)
        }
        if(r==4){
            cell20= root.findViewById<View>(R.id.cell20) as EditText
            cell20.setVisibility(VISIBLE)
        }
        if(r==5){
            cell26 = root.findViewById<View>(R.id.cell26) as EditText
            cell26.setVisibility(VISIBLE)
        }
        if(r==6){
            cell32 = root.findViewById<View>(R.id.cell32) as EditText
            cell32.setVisibility(VISIBLE)
        }

    }
    private fun formatCol4(r: Int) {
        if(r==1){
            cell3 = root.findViewById<View>(R.id.cell3) as EditText
            cell3.setVisibility(VISIBLE)
        }
        if(r==2){
            cell9 = root.findViewById<View>(R.id.cell9) as EditText
            cell9.setVisibility(VISIBLE)
        }
        if(r==3){
            cell15= root.findViewById<View>(R.id.cell15) as EditText
            cell15.setVisibility(VISIBLE)
        }
        if(r==4){
            cell21 = root.findViewById<View>(R.id.cell21) as EditText
            cell21.setVisibility(VISIBLE)
        }
        if(r==5){
            cell27 = root.findViewById<View>(R.id.cell27) as EditText
            cell27.setVisibility(VISIBLE)
        }
        if(r==6){
            cell33 = root.findViewById<View>(R.id.cell33) as EditText
            cell33.setVisibility(VISIBLE)
        }

    }
    private fun formatCol5(r: Int) {
        if(r==1){
            cell4 = root.findViewById<View>(R.id.cell4) as EditText
            cell4.setVisibility(VISIBLE)
        }
        if(r==2){
            cell10 = root.findViewById<View>(R.id.cell10) as EditText
            cell10.setVisibility(VISIBLE)
        }
        if(r==3){
            cell16= root.findViewById<View>(R.id.cell16) as EditText
            cell16.setVisibility(VISIBLE)
        }
        if(r==4){
            cell22 = root.findViewById<View>(R.id.cell22) as EditText
            cell22.setVisibility(VISIBLE)
        }
        if(r==5){
            cell28 = root.findViewById<View>(R.id.cell28) as EditText
            cell28.setVisibility(VISIBLE)
        }
        if(r==6){
            cell34 = root.findViewById<View>(R.id.cell34) as EditText
            cell34.setVisibility(VISIBLE)
        }

    }
    private fun formatCol6(r: Int) {
        if(r==1){
            cell5 = root.findViewById<View>(R.id.cell5) as EditText
            cell5.setVisibility(VISIBLE)
        }
        if(r==2){
            cell11 = root.findViewById<View>(R.id.cell11) as EditText
            cell11.setVisibility(VISIBLE)
        }
        if(r==3){
            cell17= root.findViewById<View>(R.id.cell17) as EditText
            cell17.setVisibility(VISIBLE)
        }
        if(r==4){
            cell23 = root.findViewById<View>(R.id.cell23) as EditText
            cell23.setVisibility(VISIBLE)
        }
        if(r==5){
            cell29 = root.findViewById<View>(R.id.cell29) as EditText
            cell29.setVisibility(VISIBLE)
        }
        if(r==6){
            cell35 = root.findViewById<View>(R.id.cell35) as EditText
            cell35.setVisibility(VISIBLE)
        }

    }

    private fun validateFieldsMatrix(): Boolean {
        if ( editColumn.text.length > 0 && editLine.text.length > 0)   {
            return true
        }
        Toast.makeText(activity, getString(R.string.error_message01), Toast.LENGTH_SHORT).show()
        return false
    }

    private fun validateFieldsANOVA(): Boolean {
return false
    }

    private fun intializeFields() {

    }
}

