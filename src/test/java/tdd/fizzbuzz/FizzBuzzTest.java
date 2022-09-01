package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_number_1()
    {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "1";


        String actual = fizzbuzz.countOff(1);

        assertEquals(expected, actual);

    }


}
