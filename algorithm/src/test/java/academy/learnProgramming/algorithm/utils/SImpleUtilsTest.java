package academy.learnProgramming.algorithm.utils;

import org.junit.Assert;
import org.junit.Test;

public class SImpleUtilsTest {

    @Test
    public void stringToBooleanTrueTest(){
        SimpleUtils simpleUtils = new SimpleUtils();
        Assert.assertTrue( simpleUtils.stringToBoolean("Yes"));


    }

    @Test
    public void stringToBooleanFalseTest(){
        SimpleUtils simpleUtils = new SimpleUtils();
        Assert.assertFalse( simpleUtils.stringToBoolean("n"));

    }
}
