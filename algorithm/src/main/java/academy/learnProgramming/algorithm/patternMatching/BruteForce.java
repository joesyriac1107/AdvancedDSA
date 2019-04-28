package academy.learnProgramming.algorithm.patternMatching;

import java.util.Arrays;

/**
 * Brute Force Algorithm
 *
 *  It will search for a pattern in an array, if pattern found
 *  it will return the index of array where the first letter of pattern was found.
 *  if no match is found it will return -1
 */
public class BruteForce {

    /**
     *  This method searches for pattern into array andreturn index of first char that matches
     *  If no match is found return -1;
     *
     * array=abcdef
     * pattern=def
     * result ->4
     *
     * @param arr
     * @param pattern
     * @return
     */

    public int firstMatch(char[] arr,char[] pattern){
        for(int a=0;a<=arr.length-pattern.length;a++){

            for(int p=0;p<pattern.length;p++){
                if(arr[a+p]!=pattern[p])
                    break;
                if(p==pattern.length-1)
                    return a;
            }
        }

        return -1;

    }

    /**
     * This method searches for pattern into an array and return array of the starting index of all matching patterns in the array
     * @param arr
     * @param pattern
     * @return
     */
    public int[] everyMatch(char[] arr,char[] pattern){
       int[] found = new int[arr.length];
        Arrays.fill(found,-1);
       int index =0 ;

        for(int a=0;a<=arr.length-pattern.length;a++){

            for(int p=0;p<pattern.length;p++){
                if(arr[a+p]!=pattern[p])
                    break;
                if(p==pattern.length-1)
                   found[index++]=a;
            }
        }

        return found;
    }
}
