package com.bistooni.tdd.money

open class Money(val amount: Long, protected val currency: String)
    :Expression{
    override fun reduce(bank: Bank, to: String): Money {
        return Money(amount/bank.rate(currency,to),to)
    }


    fun currency(): String {
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

    override fun plus(money: Expression): Expression {
        return Sum(this,money)
    }

    override fun times(multiplier: Int): Expression = Money(amount*multiplier,currency)




}