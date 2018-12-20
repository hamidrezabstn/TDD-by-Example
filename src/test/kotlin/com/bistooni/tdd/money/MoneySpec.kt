package com.bistooni.tdd.money

import org.junit.Assert.*
import org.junit.Test


class MoneySpec {

    @Test
    fun testMulti(){
        val five: Money = Money.dollar(5)

        assertEquals(Money.dollar(10),five.times(2))
        assertEquals(Money.dollar(15),five.times(3))
    }

    @Test
    fun testEquality(){
        assertTrue(Money.dollar(5) == Money.dollar(5))
        assertFalse(Money.dollar(5) == Money.dollar(6))
        assertFalse(Money.franc(5).equals( Money.dollar(5)))
    }

    @Test
    fun testFrancMulti(){
        val five = Money.franc(5)

        assertEquals(Money.franc(10),five.times(2))
        assertEquals(Money.franc(15),five.times(3))
    }

    @Test
    fun testCurrency(){
        assertEquals("USD",Money.dollar(1).currency())
        assertEquals("CHD",Money.franc(1).currency())
    }

    @Test
    fun testDiffrentClassEquality() {
        assertTrue(Money(1,"CHD") == (Money.franc(1)))

    }

}