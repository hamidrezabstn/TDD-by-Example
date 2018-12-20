package com.bistooni.tdd.money

class Franc(amount: Long): Money(amount) {

    override fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }



}
