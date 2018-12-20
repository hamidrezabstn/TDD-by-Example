package com.bistooni.tdd.money

open class Money(protected val amount: Long) {


    override fun equals(other: Any?): Boolean {
        return amount == (other as Money).amount
    }

}