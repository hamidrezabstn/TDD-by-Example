package com.bistooni.tdd.money

class Franc(amount: Long, currency: String) : Money(amount,currency) {


    override fun times(multiplier: Int): Money? {
        return Money(amount*multiplier,currency)
    }



}
