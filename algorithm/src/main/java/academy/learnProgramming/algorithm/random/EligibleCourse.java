package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EligibleCourse {
	
public int solve(int A, List<Integer> B, List<Integer> C) {
        
        ArrayList<Integer>visitedNodes = new ArrayList<Integer>();
        HashSet<Integer> courses = new HashSet<Integer>();
        
        for(int i =0;i<C.size();i++){
            visitedNodes.add(0);
        }
        
        for(int i=0;i<C.size();i++){
            if(visitedNodes.get(i)==1)
                continue;
                courses.clear();
                courses.add(C.get(i));
                if(repeatStep(A,B,C,i,courses,visitedNodes)==0)
                    return 0;
            
        }
        
        return 1;
    }
    
    public int repeatStep(int A,List<Integer> B, List<Integer> C,int i,HashSet<Integer> courses,ArrayList<Integer>visitedNodes){
        
        visitedNodes.set(i,1);
        if(C.get(i)<1 || C.get(i)>A ||B.get(i)<1 || B.get(i)>A ||B.get(i) == C.get(i))
                return 0;
                
            if(courses.contains(B.get(i)))
                return 0;
             courses.add(B.get(i));
             
             
            for(int j =0;j<C.size();j++){
                if(B.get(i) == C.get(j)){
                    if(visitedNodes.get(j) == 1)
                        return 1;
                        
                return repeatStep(A,B,C,j,courses,visitedNodes);
                }
            }
            
            return 1;
    }

}
