package com.bistooni.tdd.money

class Franc(private val amount: Long) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return amount == (other as Franc).amount
    }

}
