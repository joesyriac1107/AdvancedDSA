package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSum {

	public int threeSumClosest(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		

		int result = Integer.MAX_VALUE;

		for(int i=0;i<A.size();i++){
			int fixed = A.get(i);
			int start =i+1;
			int end = A.size()-1;
			int temp=0;

			while(start<end){
				temp=A.get(start)+A.get(end);
				if(result == Integer.MAX_VALUE || (Math.abs(temp + fixed - B)<Math.abs(result - B)))
					result=temp + fixed;

				if((temp) < (B-fixed)){
					start++;
				}else{
					end--;
				}
			}


		}
		return result;
	}
	
	public int removeDuplicates(ArrayList<Integer> a) {
        int prev=a.get(0);
        int index=1;
        int current =1;
        
        while(current < a.size()){
            if(!a.get(current).equals(prev)){
                prev=a.get(current);
                a.set(index,a.get(current));
                index++;
                current++;
            }else
                current++;
        }
//        System.out.println("index" + index);
        while(index<a.size()){
//             System.out.println("index" + index);
//             System.out.println("a.size()" + a.size());
                a.remove(index);
                
        }
            return a.size();
    }
}


//Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3)