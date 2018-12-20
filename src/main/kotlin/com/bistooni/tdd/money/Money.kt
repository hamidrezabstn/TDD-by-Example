package com.bistooni.tdd.money

open class Money(protected val amount: Long) {


    override fun equals(other: Any?): Boolean {
        if(!this.javaClass.isInstance(other)){
            return false
        }
        return amount == (other as Money).amount
    }

}