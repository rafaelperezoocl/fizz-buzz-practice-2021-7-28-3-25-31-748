package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_number_1() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "1";

        //when
        String actual = fizzbuzz.countOff(1);

        //then
        assertEquals(expected, actual);

    }


    @Test
    void should_return_fizz_when_count_off_given_number_3()
    {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";

        //when
        String actual = fizzbuzz.countOff(3);

        //then
        assertEquals(expected, actual);

    }


    @Test
    void should_return_buzz_when_count_off_given_number_5()
    {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "5";

        //when
        String actual = fizzbuzz.countOff(3);

        //then
        assertEquals(expected, actual);

    }
}