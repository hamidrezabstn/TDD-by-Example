package com.bistooni.tdd.money

class Dollar(var amount: Long) {

    fun times(multiplier: Int) {
        amount *= multiplier
    }

}
