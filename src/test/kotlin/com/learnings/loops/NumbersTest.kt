package com.learnings.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumbersTest {
    @Test
    internal fun shouldCalculateSumOfNaturalNumbersFromOneToTen() {
        val numbers = Numbers(1, 10)

        val naturalSum = numbers.naturalSum()

        assertEquals(55, naturalSum)
    }
}