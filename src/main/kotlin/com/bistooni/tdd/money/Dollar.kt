package com.bistooni.tdd.money

class Dollar(private val amount: Long) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return amount == (other as Dollar).amount
    }

}
