package com.bistooni.tdd.money

abstract class Money(protected val amount: Long) {


    override fun equals(other: Any?): Boolean {
        if(!this.javaClass.isInstance(other)){
            return false
        }
        return amount == (other as Money).amount
    }

    companion object {
        fun dollar(amount: Long): Money{
            return Dollar(amount)
        }

        fun franc(amount: Long): Money{
            return Franc(amount)
        }
    }

    abstract fun times(multiplier: Int): Money

}