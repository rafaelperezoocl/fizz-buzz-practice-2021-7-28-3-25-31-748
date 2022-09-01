package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        if(order % 3 == 0)
        {
            return "Fizz";

        }
        else if (order % 5 == 0)
        {
            return "Buzz";
        }

        return String.valueOf(order);
    }
}