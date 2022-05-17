import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnTrue_when_ListHasOneCharValues() {
        // given list with one char values
        val listOfChars = mutableListOf("aa", "b")
        // when we want to check if the list has one char values
        val result = getPercentageARep(listOfChars)
        // then we should get true
        assertEquals("-1.0", result)
    }
    @Test
    fun should_ReturnTrue_when_ListValuesHasAorB() {
        // given list with a and b values
        val listOfChars = mutableListOf("a","b", "c")
        // when we want to check if the list has a and b values
        val result = getPercentageARep(listOfChars)
        // then
        assertEquals("-1.0", result)
    }
    @Test
    fun should_ReturnTrue_when_ListValuesHasOnlyAorB() {
        // given list with a and b values
        val listOfChars = mutableListOf("a", "c")
        // when we want to check if the list has a and b values
        val result = getPercentageARep(listOfChars)
        // then
        assertEquals("-1.0", result)
    }

}