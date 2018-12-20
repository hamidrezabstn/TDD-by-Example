package com.bistooni.tdd.money

import org.junit.Assert.*
import org.junit.Test


class MoneySpec {

    @Test
    fun testMulti(){
        val five = Dollar(5)

        var product: Dollar = five.times(2)
        assertEquals(10,product.amount)

        product = five.times(3)
        assertEquals(15,product.amount)
    }

    @Test
    fun testEquality(){
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar(6))
    }

}