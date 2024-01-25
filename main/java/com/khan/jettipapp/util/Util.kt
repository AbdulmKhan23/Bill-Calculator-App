package com.khan.jettipapp.util

fun Calculate(totalBill:Double, tipPercentageAmt: Int): Double {
    return if(totalBill>1 && totalBill.toString().isNotEmpty())
    {
        (totalBill*tipPercentageAmt)/100
    }
    else{
        0.0
    }

}

fun  calculateTotalPerPerson(totalBill: Double,
                             splitBy:Int,
                             tipPercentageAmt: Int): Double {
    val bill= Calculate(totalBill=totalBill,
        tipPercentageAmt=tipPercentageAmt)+totalBill
    return (bill/splitBy)

}