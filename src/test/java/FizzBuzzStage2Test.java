package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzStage2Test {
    @Test
    public void testFizzBuzz() {
        assertEquals("1", FizzBuzzStage2.fizzBuzz(1));
        assertEquals("2", FizzBuzzStage2.fizzBuzz(2));
        assertEquals("Fizz", FizzBuzzStage2.fizzBuzz(3));
        assertEquals("4", FizzBuzzStage2.fizzBuzz(4));
        assertEquals("BuzzBuzz", FizzBuzzStage2.fizzBuzz(5));
        assertEquals("Fizz", FizzBuzzStage2.fizzBuzz(6));
        assertEquals("7", FizzBuzzStage2.fizzBuzz(7));
        assertEquals("8", FizzBuzzStage2.fizzBuzz(8));
        assertEquals("Fizz", FizzBuzzStage2.fizzBuzz(9));
        assertEquals("Buzz", FizzBuzzStage2.fizzBuzz(10));
        assertEquals("11", FizzBuzzStage2.fizzBuzz(11));
        assertEquals("Fizz", FizzBuzzStage2.fizzBuzz(12));
        assertEquals("Fizz", FizzBuzzStage2.fizzBuzz(13));
        assertEquals("14", FizzBuzzStage2.fizzBuzz(14));
        assertEquals("FizzBuzzBuzz", FizzBuzzStage2.fizzBuzz(15));
    }
}
