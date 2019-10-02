package academy.learnProgramming.algorithm.random;

import java.util.HashMap;
import java.util.Map;

public class MultiplicationString {
    public String multiply(String A, String B) {
        String result=null;
        Map<Pair,Pair> additionMap = addMap();
        Map<Pair,Pair> multiplicationMap = multiplyMap();

        for(int i =0 ;i<A.length();i++){
            StringBuffer sbr = new StringBuffer();
            String carry = "0";
             for(int k=0;k<i;k++){
                        sbr.append(0);
                    }
            for(int j=0;j<B.length();j++){
                Pair multi = multiplicationMap.get(new Pair(String.valueOf(A.charAt(A.length()-i-1)),String.valueOf(B.charAt(B.length()-j-1))));
                Pair value = additionMap.get(new Pair(multi.value,carry));
                carry = additionMap.get(new Pair(value.carry,multi.carry)).value;
                sbr.append(value.value);
            }
            String interCarry ="0";
            sbr.append(carry);
            if(result != null){
                String interResult = sbr.toString();
                sbr = new StringBuffer();
                
                for(int k =0;k<result.length();k++){
                Pair add1 = additionMap.get(new Pair(String.valueOf(result.charAt(k)),String.valueOf(interResult.charAt(k))));
                Pair add2 =	additionMap.get(new Pair(add1.value, interCarry));
                interCarry = additionMap.get(new Pair(add1.carry,add2.carry)).value;
                sbr.append(add2.value);
                }
                
            }
            sbr.append(interCarry);
            result=sbr.toString();
        }
        //19980
        //01998
        
        StringBuffer sbr = new StringBuffer(result);
        sbr.reverse();
        int i=0;
        
        while(i<sbr.length()-1 && sbr.charAt(i)=='0')
            i++;
        sbr.delete(0,i);
        return sbr.toString();
    }
    
    public Map<Pair,Pair> multiplyMap(){
        Map<Pair,Pair> map = new HashMap<Pair,Pair>();
        int result=0;
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                result = i*j;
                map.put(new Pair(String.valueOf(i),String.valueOf(j)),
                new Pair(String.valueOf(result%10),String.valueOf(result/10)));
            }
        }
        return map;
    }
    
    public Map<Pair,Pair> addMap(){
        Map<Pair,Pair> map = new HashMap<Pair,Pair>();
        int result=0;
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                result = i+j;
                map.put(new Pair(String.valueOf(i),String.valueOf(j)),
                new Pair(String.valueOf(result%10),String.valueOf(result/10)));
            }
        }
        return map;
    }
    
    
    class Pair{
        String value;
        String carry;
        
        Pair(String value, String carry){
            this.value=value;
            this.carry=carry;
        }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getEnclosingInstance().hashCode();
		result = prime * result + ((carry == null) ? 0 : carry.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
			return false;
		if (carry == null) {
			if (other.carry != null)
				return false;
		} else if (!carry.equals(other.carry))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	private MultiplicationString getEnclosingInstance() {
		return MultiplicationString.this;
	}
    }
}
