package com.bistooni.tdd.money

interface Expression {

    fun reduce(bank: Bank, to: String): Money
    fun plus(money: Expression): Expression?

}
