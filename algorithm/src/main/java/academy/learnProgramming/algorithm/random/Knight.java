package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Knight {
	public int knight(int A, int B, int C, int D, int E, int F) {
        int[][] visited  = new int[A][B];
        Stack<Pair> nodeStack = new Stack<Pair>();
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                visited[i][j]= -2;
            }
        }
        
        visited[E-1][F-1]=0;
        
        nodeStack.push(new Pair(C-1,D-1));
        visited[C-1][D-1]=-1;
        
        while(!nodeStack.isEmpty()){
            Pair current = nodeStack.peek();
            List<Pair> children =  generateChildren(current,A,B);
            int min =Integer.MAX_VALUE;
            for(Pair pair: children){
                if(visited[pair.row][pair.column]==-2){
                    visited[pair.row][pair.column]=-1;
                    nodeStack.push(pair);
                    continue;
                }
                
                if(visited[pair.row][pair.column]==-1){
                    continue;
                }
                
                if(min>visited[pair.row][pair.column]+1)
                    min=visited[pair.row][pair.column]+1;
  
            }
            
            if(min !=Integer.MAX_VALUE)
            	visited[current.row][current.column]=min;
            
            if(current == nodeStack.peek())
                nodeStack.pop();
        }
        
        return visited[C-1][D-1];
        
        
        
        
    }

    public List<Pair> generateChildren(Pair pair,int A,int B){
        List<Pair> pairList = new ArrayList<Pair>();
        for(int row = -2;row<=2;row++){
            if(Math.abs(row)==2){
                addPairToList(pairList,new Pair(pair.row+row,pair.column+1),A,B);
                addPairToList(pairList,new Pair(pair.row+row,pair.column-1),A,B);
            }else if(Math.abs(row)==1){
                addPairToList(pairList,new Pair(pair.row+row,pair.column+2),A,B);
                addPairToList(pairList,new Pair(pair.row+row,pair.column-2),A,B);
            }
        }
        
        return pairList;
    }
    
    public void addPairToList(List<Pair> list,Pair pair,int A,int B){
        if(pair.row<0 ||pair.row>=A||pair.column<0||pair.column>=B)
            return;
            
        list.add(pair);
    }
    public class Pair{
        int row;
        int column;
        public Pair(int row,int column){
            this.row=row;
            this.column=column;
        }
    }
    

}
