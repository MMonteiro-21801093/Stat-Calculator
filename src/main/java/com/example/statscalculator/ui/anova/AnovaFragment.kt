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




    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        anovaViewModel = ViewModelProvider(this).get(AnovaViewModel::class.java)

        root = inflater.inflate(R.layout.fragment_anova, container, false)

        editLine = root.findViewById<View>(R.id.editLine) as EditText
        editColumn = root.findViewById<View>(R.id.editColumn) as EditText

        val txtGreatMean:TextView = root.findViewById(R.id.greatMean)
        anovaViewModel.txtGreatMean.observe(viewLifecycleOwner, Observer {
            txtGreatMean.text = it
        })


        val groupMean:TextView = root.findViewById(R.id.groupMean)
        anovaViewModel.groupMean.observe(viewLifecycleOwner, Observer {
            groupMean.text = it
        })

        anovaViewModel.intializeVariables(root)
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
                anovaViewModel.greatMean()
                anovaViewModel.groupMean()
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
                    1-> anovaViewModel.formatCol1(r,root)
                    2-> anovaViewModel.formatCol2(r,root)
                    3-> anovaViewModel.formatCol3(r,root)
                    4-> anovaViewModel.formatCol4(r,root)
                    5-> anovaViewModel.formatCol5(r,root)
                    6-> anovaViewModel.formatCol6(r,root)
                }
            }
        }


    }

    private fun validateFieldsMatrix(): Boolean {
        if ( editColumn.text.length > 0 && editLine.text.length > 0)   {
            return true
        }
        Toast.makeText(activity, getString(R.string.error_message01), Toast.LENGTH_SHORT).show()
        return false
    }




    private fun intializeFields() {

    }
}

