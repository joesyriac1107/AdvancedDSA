package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.List;

public class Islands {
	
    static ArrayList<ArrayList<Integer>> visited = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Pair> pairList = new ArrayList<Pair>();
   static boolean toErase = true;
    
   public void solve(ArrayList<List<Character>> a) {
       
       createEmptyArray(visited,a.size(),a.get(0).size());
       
         for(int i=0;i<a.size();i++){
           for(int j=0;j<a.get(0).size();j++){
              if(a.get(i).get(j) =='X' || visited.get(i).get(j) == 1)
                   continue;
                   
               
               
               addToPairList(i,j,a.size(),a.get(0).size(),a);
               for(int k=0;k<pairList.size();k++){
                  eligiblePairs(pairList.get(k),a.size(),a.get(0).size(),a); 
                   
               }
               
               if(toErase){
                   for(Pair A : pairList){
                       a.get(A.row).set(A.column,'X');
                   }
               }
               
               toErase=true;
               pairList.clear();
           }
       }
       
       
   }
   
   public void createEmptyArray(ArrayList<ArrayList<Integer>> visited,int row,int column){
       for(int i=0;i<row;i++){
           visited.add(new ArrayList<Integer>());
           for(int j=0;j<column;j++){
               visited.get(i).add(0);
           }
       }
   }
   
   public void eligiblePairs (Pair A,int maxRow,int maxColumn,ArrayList<List<Character>> a){
       
	   for(int rowTemp = A.row-1;rowTemp<=A.row+1;rowTemp++){
           addToPairList(rowTemp,A.column,maxRow,maxColumn,a);
          
       }
        for(int colTemp = A.column-1;colTemp<=A.column+1;colTemp++){
                addToPairList(A.row,colTemp,maxRow,maxColumn,a);       
                       
           }
       
       
   }
   
   public void addToPairList(int row,int column,int maxRow,int maxColumn,ArrayList<List<Character>> a){
       
	   
	   
           
       if(row<0||row>=maxRow||column<0||column>=maxColumn||visited.get(row).get(column)==1||a.get(row).get(column) =='X')
           return;
       if(row==0 || row==a.size()-1 ||column==0||column==a.get(0).size()-1)
           toErase = false;
       visited.get(row).set(column,1);
       pairList.add(new Pair(row,column));
       
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
