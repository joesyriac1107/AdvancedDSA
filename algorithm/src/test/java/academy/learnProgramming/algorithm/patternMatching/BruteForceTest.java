package academy.learnProgramming.algorithm.patternMatching;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BruteForceTest {

//    @Before
//    public void setup(){
//
//    }
//
//    @Test
//    public void firstMatchTest(){
//        BruteForce bruteForce = new BruteForce();
//        String array="abcdef";
//        String pattern ="def";
//        Assert.assertEquals(3,bruteForce.firstMatch(array.toCharArray(),pattern.toCharArray()));
//
//    }
//
//    @Test
//    public void everyMatchTest(){
//        BruteForce bruteForce = new BruteForce();
//        String array="adefdef";
//        String pattern ="def";
//        int[] result=bruteForce.everyMatch(array.toCharArray(),pattern.toCharArray());
//        Assert.assertEquals(1,result[0]);
//        Assert.assertEquals(4,result[1]);
//
//    }
    BruteForce b = null;
    char[] array;

    @Before
    public void init() {
        b = new BruteForce();
        String s = new String("academy.learnprogramming");
        array = s.toCharArray();
    }

    @Test
    public void firstMatchTest() {
        Assert.assertEquals(0, b.firstMatch(array, new char[]{'a'}));
        Assert.assertEquals(16, b.firstMatch(array, new char[]{'g'}));
        Assert.assertEquals(22, b.firstMatch(array, new char[]{'n','g'}));
        Assert.assertEquals(6, b.firstMatch(array, new char[]{'y','.','l','e'}));
        Assert.assertEquals(-1, b.firstMatch(array, new char[]{'z','z'}));
    }

    @Test
    public void everyMatch() {
        int[] expect = new int[array.length];
        resetExpectArray(expect);
        expect[0] = 0;
        expect[1] = 2;
        expect[2] = 10;
        expect[3] = 18;
        System.out.println("expect" + Arrays.toString(expect));
        int[] found = b.everyMatch(array, new char[]{'a'});
        Assert.assertArrayEquals(expect, found);

        resetExpectArray(expect);
        expect[0] = 16;
        expect[1] = 23;
        System.out.println("expect" + Arrays.toString(expect));
        found = b.everyMatch(array, new char[]{'g'});
        Assert.assertArrayEquals(expect, found);

        resetExpectArray(expect);
        expect[0] = 7;
        System.out.println("expect" + Arrays.toString(expect));
        found = b.everyMatch(array, new char[]{'.'});
        Assert.assertArrayEquals(expect, found);

    }

    public void resetExpectArray(int[] expect) {
        Arrays.fill(expect,-1);
    }
}
