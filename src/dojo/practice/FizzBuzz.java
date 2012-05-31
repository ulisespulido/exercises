package dojo.practice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz() {
        List<String> fizzBuzzArray = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {

                fizzBuzzArray.add("FizzBuzz");
            }
            else if (i % 3 == 0) {

                fizzBuzzArray.add("Fizz");
            }
            else if (i % 5 == 0) {
                fizzBuzzArray.add("Buzz");
            }
            else {

                fizzBuzzArray.add(String.valueOf(i));
            }
        }
        return fizzBuzzArray;
    }
}
