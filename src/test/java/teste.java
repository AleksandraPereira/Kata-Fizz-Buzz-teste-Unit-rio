import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
}

