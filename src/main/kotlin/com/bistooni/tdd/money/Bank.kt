package com.bistooni.tdd.money

import com.sun.javaws.exceptions.InvalidArgumentException
import java.util.*

class Bank {

    private val rates = Hashtable<Pair<String,String>,Int>()

    fun reduced(source: Expression, currency: String):Money {
        return source.reduce(this,currency)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates.put(Pair(from,to),rate)
    }

    fun rate(from: String, to: String): Int {
        if (from.equals(to))
            return 1
        if (rates.get(Pair(from,to)) != null)
            return rates.get(Pair(from,to))!!
        return 1 //need exception for invalid rates
    }

}
