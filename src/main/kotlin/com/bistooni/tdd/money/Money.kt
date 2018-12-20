package com.bistooni.tdd.money

abstract class Money(protected val amount: Long, protected val currency: String) {


    fun currency(): String? {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        if(!this.javaClass.isInstance(other)){
            return false
        }
        return amount == (other as Money).amount
    }

    companion object {
        fun dollar(amount: Long): Money{
            return Dollar(amount,"USD")
        }

        fun franc(amount: Long): Money{
            return Franc(amount,"CHD")
        }
    }

    abstract fun times(multiplier: Int): Money

}