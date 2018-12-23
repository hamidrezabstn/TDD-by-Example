package com.bistooni.tdd.money

class Bank {
    fun reduced(source: Expression, currency: String):Money {
        return source.reduce(currency)
    }

}
