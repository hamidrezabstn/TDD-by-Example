package com.bistooni.tdd.money

open class Money(protected val amount: Long, protected val currency: String) {


    fun currency(): String? {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        return when{
            currency == (other as Money).currency
                    && amount == (other).amount -> true
            else -> false
        }


    }

    companion object {
        fun dollar(amount: Long): Money{
            return Money(amount,"USD")
        }

        fun franc(amount: Long): Money{
            return Money(amount,"CHD")
        }
    }

    open fun times(multiplier: Int): Money? = Money(amount*multiplier,currency)


}