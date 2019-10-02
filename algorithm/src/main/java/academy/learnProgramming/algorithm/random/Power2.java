package academy.learnProgramming.algorithm.random;

import java.util.HashMap;
import java.util.Map;

public class Power2 {
	public int power(String A) {
		Map<String,Pair> map = setMap();

		return powerMap(A,map);
	}

	public int powerMap(String A, Map<String,Pair> map){
		
		if(A.length()==1){
			if(A.charAt(0) =='2' || A.charAt(0) =='4' || A.charAt(0) =='8')
				return 1;
			else
				return 0;

		} else{
			StringBuffer sbr = new StringBuffer();
			String remainder = "0";
			for(int i = 0 ;i<A.length();i++){

				String temp;
				if(!remainder.equals("0")){
					temp = remainder + String.valueOf(A.charAt(i));
				}else{
					temp=String.valueOf(A.charAt(i));
				}
				if(!(sbr.length()==0 && map.get(temp).quotient.equals("0")))
					sbr.append(map.get(temp).quotient);
				
				remainder= map.get(temp).remainder;

			}
			
			if(remainder.equals("1"))
				return 0;

			return power(sbr.toString());
		}
		
//		147573952589676412928
//		 73786976294838206464
			
		

	}


	public Map<String,Pair> setMap(){
		Map<String,Pair> map = new HashMap<String,Pair>();

		for(int i=0;i<20;i++){
			map.put(String.valueOf(i),new Pair(String.valueOf(i/2),String.valueOf(i%2)));
		}

		return map;
	}

	class Pair{
		String quotient;
		String remainder;
		Pair(String quotient,String remainder){
			this.quotient=quotient;
			this.remainder=remainder;
		}
	}
}

