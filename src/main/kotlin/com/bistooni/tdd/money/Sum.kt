package com.bistooni.tdd.money

class Sum(val augend: Money,val addend: Money): Expression {

    override fun reduce(bank: Bank, to: String): Money {
        return Money((augend.amount+ addend.amount)/bank.rate(augend.currency(),addend.currency()),to)
    }
}
