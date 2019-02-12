package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {


    @Test
    public void testAnyNumberNotDivisibleByThreeAndFive_shouldReturnNumber() {
        int num = getNumber();
        assertEquals(String.valueOf(num), (new FizzBuzz()).play(num));
    }

    @Test
    public void testNumberDivisibleByThreeNotFive_shouldReturnFizz() {
        int num = getNumber() * 3;
        assertEquals("Fizz", new FizzBuzz().play(num));
    }

    @Test
    public void testNumberDivisibleByFiveNotThree_shouldReturnBuzz() {
        int num = getNumber() * 5;
        assertEquals("Buzz", new FizzBuzz().play(num));
    }

    @Test
    public void testNumberDivisibleByFiveAndThree_shouldReturnFizzBuzz() {
        int num = getNumber() * 15;
        assertEquals("FizzBuzz", new FizzBuzz().play(num));
    }

    private int getNumber() {
        int num = (int) (Math.random() * 100);
        while(num%3==0 || num%5==0) {
            num+=1;
        }
        return num;
    }
}
