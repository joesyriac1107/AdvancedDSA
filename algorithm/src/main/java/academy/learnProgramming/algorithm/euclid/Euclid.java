package academy.learnProgramming.algorithm.euclid;

/**
 * Euclid Algorithm<BR>
 *     It calculates the GCD(A,B) -Greatesr Common Divisor between two numbers A and B
 */
public class Euclid {

    /**
     * Implementation using recurssion<BR>
     *     22/6=3 remainder 4
     *     6/4=1 remainder 2
     *     4/2=2 remainder 0
     * @param number
     * @param divisor
     * @return
     */

    public int gcd(int number, int divisor){
        int remaining=(number%divisor);
        if(remaining==0)
            return divisor;
        else
         return gcd(divisor,remaining);


    }

    /**
     * Implementation without recurssion<BR>
     *     22/6=3 remainder 4
     *     6/4=1 remainder 2
     *     4/2=2 remainder 0
     *
     *     returns the divisor which gave the remainder 0;
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcdNonRecursive(int number,int divisor){
        while(number%divisor!=0){
            int temp=number%divisor;
            number=divisor;
            divisor=temp;
        }

        return divisor;
    }
}
