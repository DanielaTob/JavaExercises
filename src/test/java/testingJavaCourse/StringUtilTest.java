package testingJavaCourse;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        String result = StringUtil.repeat("hello", 3);
        //System.out.println(result);
        if (result.equals("hellohellohello")){
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("hello", 1);
        //System.out.println(result2);
        Assert.assertEquals(result2, "hello");

        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
       StringUtil.repeat("hola", -1);
    }



    /*private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }*/

    // Test class

    @Test public void test_not_Empty_String() {
        assertFalse(StringUtil.isEmpty("daniela"));
    }

    @Test public void test_Empty_String() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test public void test_Null_String() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test public void test_Spaces_String() {
        assertTrue(StringUtil.isEmpty("    "));
    }



}