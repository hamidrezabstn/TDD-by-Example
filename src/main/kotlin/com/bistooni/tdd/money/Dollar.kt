package com.bistooni.tdd.money

class Dollar(val amount: Long) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

}
