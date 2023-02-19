package TestingJavaCourse;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat(){
        String result = StringUtil.repeat("hello", 3);
        //System.out.println(result);
        if (result.equals("hellohellohello")){
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("hello", 1);
        //System.out.println(result2);
        Assert.assertEquals(result2, "hello");

    }

    /*private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }*/
}