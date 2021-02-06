package com.example.statscalculator.ui.quadraticequation

import android.os.Bundle
import android.text.Editable
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
import com.example.statscalculator.ui.centraltrend.CentralTrendViewModel

import kotlin.math.sqrt

class QuadraticEquationFragment : Fragment() , View.OnClickListener{

    private lateinit var quadraticEquationViewModel: QuadraticEquationViewModel
    private lateinit var root: View
    private lateinit var editTextAx: EditText
    private lateinit var editTextBx: EditText
    private lateinit var editTextC: EditText
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        quadraticEquationViewModel =
                ViewModelProvider(this).get(QuadraticEquationViewModel::class.java)
          root = inflater.inflate(R.layout.fragment_quadratic_equation, container, false)

        editTextAx = root.findViewById<View>(R.id.editTextAx) as EditText
        editTextBx = root.findViewById<View>(R.id.editTextBx) as EditText
        editTextC = root.findViewById<View>(R.id.editTextC) as EditText
        val btCalculate = root.findViewById<View>(R.id.btCalculate) as Button
        val btReset = root.findViewById<View>(R.id.btReset) as Button
        btCalculate.setOnClickListener(this)
        btReset.setOnClickListener(this)

        return root
    }
    private fun validateFields(): Boolean {
        if ( editTextAx.text.length > 0 && editTextBx.text.length > 0 && editTextC.text.length > 0)   {
            return true
        }

        Toast.makeText(activity, getString(R.string.error_message01), Toast.LENGTH_SHORT).show()
        return false
    }
    override fun onClick(view: View?) {
        if(view!=null){
            if (view.id == R.id.btCalculate) {
                if(validateFields()){
                    resolveEquation()
                }
            }
            if (view.id == R.id.btReset) {
                intializeFields()
            }
        }
    }

    private fun resolveEquation() {
     val a = editTextAx.getText().toString().replace("+","")
     var b = editTextBx.getText().toString().replace("+","")
     val c = editTextC.getText().toString().replace("+","")

     var delta =  Math.pow(b.toDouble(), 2.0)-4*a.toInt()*c.toInt()

     val deltaResult:TextView =  root.findViewById(R.id.deltaResult)
     var textDeltaResult = "Δ = "
        textDeltaResult+="($b)^2-4"
        if(a.toInt()<0){
            textDeltaResult+=".($a)."
        } else{
            textDeltaResult+=".$a."
        }
        if(c.toInt()<0){
            textDeltaResult+="($c)"
        } else{
            textDeltaResult+="$c"
        }
        val deltaText = delta.toInt()
        textDeltaResult+=" = $deltaText"
        deltaResult.text = textDeltaResult


        if(delta < 0){
        Toast.makeText(activity, getString(R.string.error_message02), Toast.LENGTH_SHORT).show ()
        }else{
            var x1 = (-(b).toInt() + sqrt(delta))/2*a.toInt()
            var x2 = (-(b).toInt() - sqrt(delta))/2*a.toInt()

            var textX1 = "x1 = -($b) + √$deltaText/(2.$a)\n"
            var var1 = 2*a.toInt()
            var var2= sqrt(delta).toInt()
            var var3= -(b).toInt() + sqrt(delta)
            var var4= var3.toInt()/var1.toInt()
              textX1 += "x1 = -($b) + √$deltaText/($var1)\n"
              textX1 += "x1 = -($b) + $var2/($var1)\n"
              textX1 += "x1 = $var3/($var1)\n"
              textX1 += "x1 = $var4\n"
            val x1Result:TextView =  root.findViewById(R.id.x1Result)
            x1Result.text = textX1


            var textX2 = "x2= -($b) - √$deltaText/(2.$a)\n"
            var x2var1 = 2*a.toInt()
            var x2var2= sqrt(delta).toInt()
            var x2var3= -(b).toInt() - sqrt(delta)
            var x2var4= x2var3.toInt()/x2var1.toInt()
            textX2 += "x2 = -($b) - √$deltaText/($x2var1)\n"
            textX2 += "x2 = -($b) - $x2var2/($x2var1)\n"
            textX2 += "x2 = $x2var3/($x2var1)\n"
            textX2 += "x2 = $x2var4\n"

            val x2Result:TextView =  root.findViewById(R.id.x2Result)
            x2Result.text = textX2





            val equatioResult:TextView =  root.findViewById(R.id.equationResult)

            var textResult = "Equation: "
            if(a.toInt() == 1){
                textResult +="x^2"
            }else{
                textResult +="$b"
                textResult +="x^2"
            }

            if(b.toInt() == 1){
                textResult +="x"
            }else{
                if(b.toInt()< 0){
                    textResult +="$b"
                    textResult +="x"
                }else{
                    textResult +="+$b"
                    textResult +="x"
                }
            }

            if(c.toInt()< 0){
                textResult +=c
            }else{
                textResult +="+$c"
            }
            textResult +=" = 0"
            equatioResult.text =textResult
            val equatioResult1:TextView =  root.findViewById(R.id.equationResult1)
            var textResult1 = "S = { "
            textResult1+=x1.toInt()
            textResult1+=","
            textResult1+=x2.toInt()
            textResult1+=" }"
            equatioResult1.text =textResult1
        }
    }

    private fun intializeFields() {
        editTextAx.setText("")
        editTextBx.setText("")
        editTextC.setText("")
    }
}

