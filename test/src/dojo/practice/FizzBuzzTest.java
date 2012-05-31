package dojo.practice;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzzer;

    @Before
    public void setUp() throws Exception {
        fizzBuzzer = new FizzBuzz();
    }

    @Test
    public void shouldFizzWhenMultipleOfThree() {
        List<String> actual = fizzBuzzer.fizzBuzz();
        for (int i = 2; i < 100; i += 3) {
            if (!((i + 1) % 15 == 0)) {

                assertEquals("Fizz", actual.get(i));
            }
        }
    }

    @Test
    public void shouldBuzzWhenMultipleOfFive() {
        List<String> actual = fizzBuzzer.fizzBuzz();
        for (int i = 4; i < 100; i += 5) {
            if (!((i + 1) % 3 == 0)) {
                assertEquals("Buzz", actual.get(i));
            }
        }
    }

    @Test
    public void shouldFizzBuzzWhenMultipleOfThreeAndFive() {
        List<String> actual = fizzBuzzer.fizzBuzz();
        for (int i = 14; i < 100; i += 15) {
            assertEquals("FizzBuzz", actual.get(i));
        }
    }

}
