package com.bistooni.tdd.money

import org.junit.Assert
import org.junit.Test


class MoneySpec {

    @Test
    fun testMulti(){
        val five = Dollar(5)

        var product: Dollar = five.times(2)
        Assert.assertEquals(10,product.amount)

        product = five.times(3)
        Assert.assertEquals(15,product.amount)
    }

}