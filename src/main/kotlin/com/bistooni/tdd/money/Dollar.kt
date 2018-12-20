package com.bistooni.tdd.money

class Dollar(amount: Long, currency: String) : Money(amount,currency) {

    override fun times(multiplier: Int): Money {
        return Money.dollar(amount * multiplier)
    }



}
