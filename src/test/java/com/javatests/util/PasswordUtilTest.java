package com.javatests.util;

import org.junit.Test;

import static com.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
       assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weak_when_has_less_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("mipasswordassaqq"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abdcd1234"));
    }

    @Test
    public void medium_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abdcd123!"));
    }
}