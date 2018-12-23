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

    @Test
    fun testSimpleAddition() {
        val five = Money.dollar(5)
        val sum : Expression = five.plus(Money.dollar(10))!!
        val bank = Bank()
        val result = bank.reduced(sum,"USD")
        assertEquals(result,Money.dollar(15))
    }

    @Test
    fun testPlusReturnsSum() {
        val five = Money.dollar(5)
        val result = five.plus(five)
        val sum : Sum = result as Sum
        assertEquals(five, result.augend)
        assertEquals(five, result.addend)
    }

    @Test
    fun testReduceSum(){
        val five = Money.dollar(5)
        val sum : Expression = five.plus(Money.dollar(8))!!
        val bank = Bank()
        val result = bank.reduced(sum,"USD")
        assertEquals(result,Money.dollar(13))
    }

    @Test
    fun testReduceMoney(){
        val bank = Bank()
        val result = bank.reduced(Money.dollar(1),"USD")
        assertEquals(Money.dollar(1),result)
    }

    @Test
    fun testDiffrentCurrencyConversion(){
        val bank = Bank()
        bank.addRate("CHD","USD",2)
        val result = bank.reduced(Money.franc(2),"USD")

        assertEquals(Money(1,"USD"),result)
    }

    @Test
    fun testMixAddition(){
        val fiveDollar : Expression = Money.dollar(5)
        val tenFrank : Expression = Money.franc(10)
        val bank = Bank()
        bank.addRate("CHD","USD",2)

        val result = bank.reduced(fiveDollar.plus(Money.franc(10))!!,"USD")

        assertEquals(Money.dollar(10),result)

    }
}