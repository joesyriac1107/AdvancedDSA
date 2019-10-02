package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonElements {
	 public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
	        int aIndex=0;
	        int bIndex=0;
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        while(aIndex<a.size()&& bIndex<b.size()){
	            if(a.get(aIndex)==b.get(bIndex)){
	                result.add(a.get(aIndex));
	                aIndex++;
	                bIndex++;
	                continue;
	            }else if(a.get(aIndex)<b.get(bIndex)){
	                aIndex++;
	                continue;
	            }else{
	                bIndex++;
	            }
	        }
	        return result;
	    }

}
