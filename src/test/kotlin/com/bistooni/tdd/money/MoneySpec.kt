package com.bistooni.tdd.money

import org.junit.Assert
import org.junit.Test


class MoneySpec {

    @Test
    fun testMulti(){
        val dollar = Dollar(5)
        dollar.times(2)
        Assert.assertEquals(10,dollar.amount)
    }

}