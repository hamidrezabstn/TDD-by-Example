package com.bistooni.tdd.money

class Sum(val augend: Expression,val addend: Expression): Expression {
    override fun plus(money: Expression): Expression {
        return Sum(this,money)
    }

    override fun reduce(bank: Bank, to: String): Money {
        return Money((augend.reduce(bank,to).amount+ addend.reduce(bank,to).amount),to)
    }

    override fun times(multiplier: Int): Expression = Sum(augend.times(multiplier), addend.times(multiplier))
}
