package academy.learnProgramming.algorithm.euclid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclidTest {
    Euclid euclid;
    @Before
    public void setup(){
         euclid = new Euclid();
    }

    @Test
    public void gcdTest(){
        Assert.assertEquals(2,euclid.gcd(10,2));
        Assert.assertEquals(7,euclid.gcd(14,91));


    }

    @Test
    public void gcdTest2(){
        Assert.assertEquals(2,euclid.gcdNonRecursive(10,2));
        Assert.assertEquals(1,euclid.gcdNonRecursive(79,32));


    }
}
