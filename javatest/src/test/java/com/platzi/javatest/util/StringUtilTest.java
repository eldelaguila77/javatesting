package com.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Test;
public class StringUtilTest {
    @Test
    public void testRepeat() {

        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));

    }
    @Test
    public void testRepeatMultiple() {

        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));

    }

    @Test
    public void testRepeatZeroTimes() {

        Assert.assertEquals("", StringUtil.repeat("hola", 0));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegativeTimes() {

        StringUtil.repeat("hola", -1);

    }

    @Test
    public void stringEmpty() {
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void stringIsNotEmpty() {
        Assert.assertFalse(StringUtil.isEmpty("holamundo"));
    }

    /*private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected: " + expected);
        }
    }*/
}