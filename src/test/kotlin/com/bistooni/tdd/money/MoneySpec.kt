package com.bistooni.tdd.money

import org.junit.Assert.*
import org.junit.Test


class MoneySpec {

    @Test
    fun testMulti(){
        val five = Dollar(5)

        assertEquals(Dollar(10),five.times(2))
        assertEquals(Dollar(15),five.times(3))
    }

    @Test
    fun testEquality(){
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar(6))
        assertTrue(Franc(5) == Franc(5))
        assertFalse(Franc(5) == Franc(6))
        assertFalse(Franc(5).equals( Dollar(5)))
    }

    @Test
    fun testFrancMulti(){
        val five = Franc(5)

        assertEquals(Franc(10),five.times(2))
        assertEquals(Franc(15),five.times(3))
    }

}