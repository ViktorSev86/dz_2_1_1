package ru.netology

import calculatePrice
import junit.framework.Assert.assertEquals
import org.junit.Test

class Dz_2_1_1KtTest {

    @Test
    fun calculatePriceMirSutLim() {

        // arrange
        val typ = "Мир"
        val lastTran = 3000_00
        val lastSutTran = 1000000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMirMonth() {

        // arrange
        val typ = "Мир"
        val lastTran = 600000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMir() {

        // arrange
        val typ = "Мир"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 10000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(7500, result)
    }

    @Test
    fun calculatePriceMirMin() {

        // arrange
        val typ = "Мир"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(35, result)
    }

    @Test
    fun calculatePriceMaestroSutLim() {

        // arrange
        val typ = "Maestro"
        val lastTran = 3000_00
        val lastSutTran = 1000000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMaestroMonth() {

        // arrange
        val typ = "Maestro"
        val lastTran = 600000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }


    @Test
    fun calculatePriceMaestroZero() {

        // arrange
        val typ = "Maestro"
        val lastTran = 3000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(0, result)
    }

    @Test
    fun calculatePriceMaestro() {

        // arrange
        val typ = "Maestro"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(2600, result)
    }

    @Test
    fun calculatePriceMasterCardSutLim() {

        // arrange
        val typ = "MasterCard"
        val lastTran = 3000_00
        val lastSutTran = 1000000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceMasterCardMonth() {

        // arrange
        val typ = "MasterCard"
        val lastTran = 600000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }


    @Test
    fun calculatePriceMasterCardZero() {

        // arrange
        val typ = "MasterCard"
        val lastTran = 3000_00
        val lastSutTran = 1000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(0, result)
    }

    @Test
    fun calculatePriceMasterCard() {

        // arrange
        val typ = "MasterCard"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(2600, result)
    }


    @Test
    fun calculatePriceVkLim() {

        // arrange
        val typ = "Vk Pay"
        val lastTran = 30000_00
        val lastSutTran = 100000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(-1, result)
    }

    @Test
    fun calculatePriceVkZero() {

        // arrange
        val typ = "Vk Pay"
        val lastTran = 30000_00
        val lastSutTran = 8000_00
        val newTran: Int = 1000_00

        // oct
        val result = calculatePrice(type = typ, lastTranz = lastTran, lastSutTranz = lastSutTran, tranz = newTran)

        // assert
        assertEquals(0, result)
    }
}