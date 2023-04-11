package com.platzi.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {


    @Test
    public void weakWhenHasLessThan8Letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("123ee@"));
    }

    @Test
    public void weakWhenHasOnlyLetters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234567"));
    }

    @Test
    public void strongWhenHasLettersNumbersAndSymbols() {
        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd1234567@@"));
    }

}