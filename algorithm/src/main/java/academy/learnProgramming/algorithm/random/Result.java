package academy.learnProgramming.algorithm.random;

import java.util.HashMap;
import java.util.HashSet;

public class Result {
	
	public static int shortestSubstring(String s) {
	    // Write your code here
	    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	    for(int i=0;i<s.length();i++){
	        if(map.get(s.charAt(i))==null){
	            map.put(s.charAt(i),0);
	        }

	    }

	    int distinctCharacter= map.keySet().size();
	    HashSet<Character> charSet = new HashSet<Character>();
	    charSet.add(s.charAt(0));
	    map.put(s.charAt(0),map.get(s.charAt(0))+1);
	    int start=0;
	    int end=1;
	    int result = Integer.MAX_VALUE;
	    
	    while(!(end==s.length() && (charSet.size()<distinctCharacter))){
	        if(charSet.size()==distinctCharacter){
	        	if(end==s.length())
	        		result=Math.min(result, end-start);
	        	else
	        		result=Math.min(result, end-start+1);
	            Character toRemove= s.charAt(start);
	            start++;
	           map.put(toRemove,map.get(toRemove)-1);
	            if(map.get(toRemove)==0){
	                charSet.remove(toRemove);
	            }
	        }else{
	            Character toAdd= s.charAt(end);
	            charSet.add(toAdd);
	            end++;
	            map.put(toAdd,map.get(toAdd)+1);
	        }
	    }
	    

	    return result;

	    }

}
