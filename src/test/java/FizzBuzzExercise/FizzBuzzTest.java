package FizzBuzzExercise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = FizzBuzz.FizzBuzzGame( 1);
        Assert.assertEquals(result, "1");


        String result2 = FizzBuzz.FizzBuzzGame( 3);
        if (result.equals("Fizz")){
            System.out.println("Test Passed");
        }

        String result3 = FizzBuzz.FizzBuzzGame( 3);
        Assert.assertEquals(result3, "Fizz");

    }

    /*private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }*/


}

