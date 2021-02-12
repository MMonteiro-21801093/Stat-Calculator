package com.example.statscalculator.ui.anova

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.statscalculator.R

class AnovaViewModel : ViewModel() {
    private val _greateMean = MutableLiveData<String>().apply {
        value = ""
    }
    val txtGreatMean: LiveData<String> = _greateMean

    private val _groupMean= MutableLiveData<String>().apply {
        value = ""
    }
    val groupMean: LiveData<String> = _groupMean

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
      fun intializeVariables(root: View){
          cell0 = root.findViewById<View>(R.id.cell0) as EditText
          cell6 = root.findViewById<View>(R.id.cell6) as EditText
          cell12 = root.findViewById<View>(R.id.cell12) as EditText
          cell18 = root.findViewById<View>(R.id.cell18) as EditText
          cell24 = root.findViewById<View>(R.id.cell24) as EditText
          cell30 = root.findViewById<View>(R.id.cell30) as EditText
          cell1 = root.findViewById<View>(R.id.cell1) as EditText
          cell7 = root.findViewById<View>(R.id.cell7) as EditText
          cell13= root.findViewById<View>(R.id.cell13) as EditText
          cell19 = root.findViewById<View>(R.id.cell19) as EditText
          cell25 = root.findViewById<View>(R.id.cell25) as EditText
          cell31 = root.findViewById<View>(R.id.cell31) as EditText
          cell2 = root.findViewById<View>(R.id.cell2) as EditText
          cell8 = root.findViewById<View>(R.id.cell8) as EditText
          cell14= root.findViewById<View>(R.id.cell14) as EditText
          cell20= root.findViewById<View>(R.id.cell20) as EditText
          cell26 = root.findViewById<View>(R.id.cell26) as EditText
          cell32 = root.findViewById<View>(R.id.cell32) as EditText
          cell4 = root.findViewById<View>(R.id.cell4) as EditText
          cell10 = root.findViewById<View>(R.id.cell10) as EditText
          cell16= root.findViewById<View>(R.id.cell16) as EditText
          cell22 = root.findViewById<View>(R.id.cell22) as EditText
          cell28 = root.findViewById<View>(R.id.cell28) as EditText
          cell34 = root.findViewById<View>(R.id.cell34) as EditText
          cell5 = root.findViewById<View>(R.id.cell5) as EditText
          cell11 = root.findViewById<View>(R.id.cell11) as EditText
          cell17= root.findViewById<View>(R.id.cell17) as EditText
          cell23 = root.findViewById<View>(R.id.cell23) as EditText
          cell29 = root.findViewById<View>(R.id.cell29) as EditText
          cell35 = root.findViewById<View>(R.id.cell35) as EditText
          cell3 = root.findViewById<View>(R.id.cell3) as EditText
          cell9 = root.findViewById<View>(R.id.cell9) as EditText
          cell15= root.findViewById<View>(R.id.cell15) as EditText
          cell21 = root.findViewById<View>(R.id.cell21) as EditText
          cell27 = root.findViewById<View>(R.id.cell27) as EditText
          cell33 = root.findViewById<View>(R.id.cell33) as EditText
    }
    fun greatMean(){
        validateFieldsANOVA()

        var result =0.0
        var nrItems=0
        if(cell0.isVisible  ){
            result += cell0.getText().toString().toDouble()
            nrItems++
        }
        if(cell1.isVisible  ){
            result += cell1.getText().toString().toDouble()
            nrItems++
        }
        if(cell2.isVisible ){
            result += cell2.getText().toString().toDouble()
            nrItems++
        }
        if(cell3.isVisible ){
            result += cell3.getText().toString().toDouble()
            nrItems++
        }
        if(cell4.isVisible  ){
            result += cell4.getText().toString().toDouble()
            nrItems++
        }
        if(cell5.isVisible ){
            result += cell5.getText().toString().toDouble()
            nrItems++
        }
        if(cell6.isVisible  ){
            result += cell6.getText().toString().toDouble()
            nrItems++
        }
        if(cell7.isVisible ){
            result += cell7.getText().toString().toDouble()
            nrItems++
        }
        if(cell8.isVisible  ){
            result += cell8.getText().toString().toDouble()
            nrItems++
        }
        if(cell9.isVisible ){
            result += cell9.getText().toString().toDouble()
            nrItems++
        }
        if(cell10.isVisible  ){
            result += cell10.getText().toString().toDouble()
            nrItems++
        }
        if(cell11.isVisible  ){
            result += cell11.getText().toString().toDouble()
            nrItems++
        }
        if(cell12.isVisible ){
            result += cell12.getText().toString().toDouble()
            nrItems++
        }
        if(cell13.isVisible  ){
            result += cell13.getText().toString().toDouble()
            nrItems++
        }
        if(cell14.isVisible){
            result += cell14.getText().toString().toDouble()
            nrItems++
        }
        if(cell15.isVisible){
            result += cell15.getText().toString().toDouble()
            nrItems++
        }
        if(cell16.isVisible){
            result += cell16.getText().toString().toDouble()
            nrItems++
        }
        if(cell17.isVisible){
            result += cell17.getText().toString().toDouble()
            nrItems++
        }
        if(cell18.isVisible){
            result += cell18.getText().toString().toDouble()
            nrItems++
        }
        if(cell19.isVisible ){
            result += cell19.getText().toString().toDouble()
            nrItems++
        }
        if(cell20.isVisible){
            result += cell20.getText().toString().toDouble()
            nrItems++
        }
        if(cell21.isVisible){
            result += cell21.getText().toString().toDouble()
            nrItems++
        }
        if(cell22.isVisible){
            result += cell22.getText().toString().toDouble()
            nrItems++
        }
        if(cell23.isVisible){
            result += cell23.getText().toString().toDouble()
            nrItems++
        }
        if(cell24.isVisible){
            result += cell24.getText().toString().toDouble()
            nrItems++
        }
        if(cell25.isVisible ){
            result += cell25.getText().toString().toDouble()
            nrItems++
        }
        if(cell26.isVisible){
            result += cell26.getText().toString().toDouble()
            nrItems++
        }
        if(cell27.isVisible){
            result += cell27.getText().toString().toDouble()
            nrItems++
        }
        if(cell28.isVisible ){
            result += cell28.getText().toString().toDouble()
            nrItems++
        }
        if(cell29.isVisible ){
            result += cell29.getText().toString().toDouble()
            nrItems++
        }
        if(cell30.isVisible ){
            result += cell30.getText().toString().toDouble()
            nrItems++
        }
        if(cell31.isVisible){
            result += cell31.getText().toString().toDouble()
            nrItems++
        }
        if(cell32.isVisible){
            result += cell32.getText().toString().toDouble()
            nrItems++
        }
        if(cell33.isVisible){
            result += cell33.getText().toString().toDouble()
            nrItems++
        }
        if(cell34.isVisible ){
            result += cell34.getText().toString().toDouble()
            nrItems++
        }
        if(cell35.isVisible ){
            result += cell35.getText().toString().toDouble()
            nrItems++
        }
        _greateMean.value = "%.2f".format( result/nrItems)

    }
    private fun validateFieldsANOVA(){
        if(cell0.isVisible && cell0.text.length ==0){
            cell0.setText("0")
        }
        if(cell1.isVisible && cell1.text.length ==0){
            cell1.setText("0")
        }
        if(cell2.isVisible && cell2.text.length ==0){
            cell2.setText("0")
        }
        if(cell3.isVisible && cell3.text.length ==0){
            cell3.setText("0")
        }
        if(cell4.isVisible && cell4.text.length ==0){
            cell4.setText("0")
        }
        if(cell5.isVisible && cell5.text.length ==0){
            cell5.setText("0")
        }
        if(cell6.isVisible && cell6.text.length ==0){
            cell6.setText("0")
        }
        if(cell7.isVisible && cell7.text.length ==0){
            cell7.setText("0")
        }
        if(cell8.isVisible && cell8.text.length ==0){
            cell8.setText("0")
        }
        if(cell9.isVisible && cell9.text.length ==0){
            cell9.setText("0")
        }
        if(cell10.isVisible && cell10.text.length ==0){
            cell10.setText("0")
        }
        if(cell11.isVisible && cell11.text.length ==0){
            cell11.setText("0")
        }
        if(cell12.isVisible && cell12.text.length ==0){
            cell12.setText("0")
        }
        if(cell13.isVisible && cell13.text.length ==0){
            cell13.setText("0")
        }
        if(cell14.isVisible && cell14.text.length ==0){
            cell14.setText("0")
        }
        if(cell15.isVisible && cell15.text.length ==0){
            cell15.setText("0")
        }
        if(cell16.isVisible && cell16.text.length ==0){
            cell16.setText("0")
        }
        if(cell17.isVisible && cell17.text.length ==0){
            cell17.setText("0")
        }
        if(cell18.isVisible && cell18.text.length ==0){
            cell18.setText("0")
        }
        if(cell19.isVisible && cell19.text.length ==0){
            cell19.setText("0")
        }
        if(cell20.isVisible && cell20.text.length ==0){
            cell20.setText("0")
        }
        if(cell21.isVisible && cell21.text.length ==0){
            cell21.setText("0")
        }
        if(cell22.isVisible && cell22.text.length ==0){
            cell22.setText("0")
        }
        if(cell23.isVisible && cell23.text.length ==0){
            cell23.setText("0")
        }
        if(cell24.isVisible && cell24.text.length ==0){
            cell24.setText("0")
        }
        if(cell25.isVisible && cell25.text.length ==0){
            cell25.setText("0")
        }
        if(cell26.isVisible && cell26.text.length ==0){
            cell26.setText("0")
        }
        if(cell27.isVisible && cell27.text.length ==0){
            cell27.setText("0")
        }
        if(cell28.isVisible && cell28.text.length ==0){
            cell28.setText("0")
        }
        if(cell29.isVisible && cell29.text.length ==0){
            cell29.setText("0")
        }
        if(cell30.isVisible && cell30.text.length ==0){
            cell30.setText("0")
        }
        if(cell31.isVisible && cell31.text.length ==0){
            cell31.setText("0")
        }
        if(cell32.isVisible && cell32.text.length ==0){
            cell32.setText("0")
        }
        if(cell33.isVisible && cell33.text.length ==0){
            cell33.setText("0")
        }
        if(cell34.isVisible && cell34.text.length ==0){
            cell34.setText("0")
        }
        if(cell35.isVisible && cell35.text.length ==0){
            cell35.setText("0")
        }

    }
    fun formatCol1(r: Int, root: View) {
        var str =""
        if(r==1){
            cell0.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==2){
            cell6.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==3){

            cell12.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==4){

            cell18.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==5){

            cell24.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==6){

            cell30.setVisibility(View.VISIBLE)
            str="S"
        }
        if(str=="S"){
            val lblG1  = root.findViewById<View>(R.id.lblG1) as TextView
            lblG1.setVisibility(View.VISIBLE)
        }
    }
    fun formatCol2(r: Int, root: View) {
        var str =""
        if(r==1){

            cell1.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==2){

            cell7.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==3){

            cell13.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==4){

            cell19.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==5){

            cell25.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==6){

            cell31.setVisibility(View.VISIBLE)
            str="S"
        }
        if(str=="S"){
            val lblG2 = root.findViewById<View>(R.id.lblG2) as TextView
            lblG2.setVisibility(View.VISIBLE)
        }
    }
    fun formatCol3(r: Int, root: View) {
        var str =""
        if(r==1){

            cell2.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==2){

            cell8.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==3){

            cell14.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==4){

            cell20.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==5){

            cell26.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==6){

            cell32.setVisibility(View.VISIBLE)
            str="S"
        }
        if(str=="S"){
            val lblG3 = root.findViewById<View>(R.id.lblG3) as TextView
            lblG3.setVisibility(View.VISIBLE)
        }
    }
    fun formatCol4(r: Int, root: View) {
        var str =""
        if(r==1){

            cell3.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==2){

            cell9.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==3){

            cell15.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==4){

            cell21.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==5){

            cell27.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==6){

            cell33.setVisibility(View.VISIBLE)
            str="S"
        }
        if(str=="S"){
            val lblG4 = root.findViewById<View>(R.id.lblG4) as TextView
            lblG4.setVisibility(View.VISIBLE)
        }
    }
    fun formatCol5(r: Int, root: View) {
        var str =""
        if(r==1){

            cell4.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==2){

            cell10.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==3){

            cell16.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==4){

            cell22.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==5){

            cell28.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==6){

            cell34.setVisibility(View.VISIBLE)
            str="S"
        }
        if(str=="S"){
            val lblG5 = root.findViewById<View>(R.id.lblG5) as TextView
            lblG5.setVisibility(View.VISIBLE)
        }
    }
    fun formatCol6(r: Int, root: View) {
        var str =""
        if(r==1){

            cell5.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==2){

            cell11.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==3){

            cell17.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==4){

            cell23.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==5){

            cell29.setVisibility(View.VISIBLE)
            str="S"
        }
        if(r==6){

            cell35.setVisibility(View.VISIBLE)
            str="S"
        }
        if(str=="S"){
            val lblG6 = root.findViewById<View>(R.id.lblG6) as TextView
            lblG6.setVisibility(View.VISIBLE)
        }
    }

    fun groupMean() {

        var group1 =0.0
        var group1Items=0

        var group2 =0.0
        var group2Items=0

        var group3 =0.0
        var group3Items=0

        var group4 =0.0
        var group4Items=0

        var group5 =0.0
        var group5Items=0

        var group6 =0.0
        var group6Items=0


        if(cell0.isVisible  ){
            group1 += cell0.getText().toString().toDouble()
            group1Items++
        }
        if(cell6.isVisible  ){
            group1 += cell6.getText().toString().toDouble()
            group1Items++
        }
        if(cell12.isVisible  ){
            group1 += cell12.getText().toString().toDouble()
            group1Items++
        }
        if(cell18.isVisible  ){
            group1 += cell18.getText().toString().toDouble()
            group1Items++
        }
        if(cell24.isVisible  ){
            group1 += cell24.getText().toString().toDouble()
            group1Items++
        }
        if(cell30.isVisible  ){
            group1 += cell24.getText().toString().toDouble()
            group1Items++
        }


        if(cell1.isVisible  ){
            group2 += cell1.getText().toString().toDouble()
            group2Items++
        }
        if(cell7.isVisible  ){
            group2 += cell7.getText().toString().toDouble()
            group2Items++
        }
        if(cell13.isVisible  ){
            group2 += cell13.getText().toString().toDouble()
            group2Items++
        }
        if(cell19.isVisible  ){
            group2 += cell19.getText().toString().toDouble()
            group2Items++
        }
        if(cell25.isVisible  ){
            group2 += cell25.getText().toString().toDouble()
            group2Items++
        }
        if(cell31.isVisible  ){
            group2 += cell31.getText().toString().toDouble()
            group2Items++
        }



        if(cell2.isVisible ){
            group3 += cell2.getText().toString().toDouble()
            group3Items++
        }
        if(cell8.isVisible ){
            group3 += cell8.getText().toString().toDouble()
            group3Items++
        }
        if(cell14.isVisible ){
            group3 += cell14.getText().toString().toDouble()
            group3Items++
        }
        if(cell20.isVisible ){
            group3 += cell20.getText().toString().toDouble()
            group3Items++
        }
        if(cell26.isVisible ){
            group3 += cell26.getText().toString().toDouble()
            group3Items++
        }
        if(cell32.isVisible ){
            group3 += cell32.getText().toString().toDouble()
            group3Items++
        }


        if(cell3.isVisible ){
            group4 += cell3.getText().toString().toDouble()
            group4Items++
        }
        if(cell9.isVisible ){
            group4 += cell9.getText().toString().toDouble()
            group4Items++
        }
        if(cell15.isVisible ){
            group4 += cell15.getText().toString().toDouble()
            group4Items++
        }
        if(cell21.isVisible ){
            group4 += cell21.getText().toString().toDouble()
            group4Items++
        }
        if(cell27.isVisible ){
            group4 += cell27.getText().toString().toDouble()
            group4Items++
        }
        if(cell33.isVisible ){
            group4 += cell33.getText().toString().toDouble()
            group4Items++
        }


        if(cell4.isVisible  ){
            group5 += cell4.getText().toString().toDouble()
            group5Items++
        }
        if(cell10.isVisible  ){
            group5 += cell10.getText().toString().toDouble()
            group5Items++
        }
        if(cell16.isVisible  ){
            group5 += cell16.getText().toString().toDouble()
            group5Items++
        }
        if(cell22.isVisible  ){
            group5 += cell22.getText().toString().toDouble()
            group5Items++
        }
        if(cell28.isVisible  ){
            group5 += cell28.getText().toString().toDouble()
            group5Items++
        }
        if(cell34.isVisible  ){
            group5 += cell34.getText().toString().toDouble()
            group5Items++
        }




        if(cell11.isVisible  ){
            group6 += cell11.getText().toString().toDouble()
            group6Items++
        }

        if(cell17.isVisible){
            group6 += cell17.getText().toString().toDouble()
            group6Items++
        }

        if(cell23.isVisible){
            group6 += cell23.getText().toString().toDouble()
            group6Items++
        }

        if(cell29.isVisible ){
            group6 += cell29.getText().toString().toDouble()
            group6Items++
        }

        if(cell35.isVisible ){
            group6 += cell35.getText().toString().toDouble()
            group6Items++
        }
        _groupMean.value = "(%.2f".format( group1/group1Items)+"), "
        if(group2 > 0){
            _groupMean.value += "(%.2f".format( group2/group2Items)+"), "
        }
        if(group3 > 0){
            _groupMean.value += "(%.2f".format( group3/group3Items)+"), "
        }
        if(group4 > 0){
            _groupMean.value += "(%.2f".format( group4/group4Items)+"), "
        }
        if(group5 > 0){
            _groupMean.value += "(%.2f".format( group5/group5Items)+"), "
        }
        if(group6 > 0){
            _groupMean.value += "(%.2f".format( group6/group6Items)+"), "
        }
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text
}