package com.bistooni.tdd.money

class Dollar(amount: Long) : Money(amount) {

    override fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }



}
