package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeGraph {
	public int solve(ArrayList<Integer> A) {
		
		   
        TreeNode root = createTree(A);
        return maxDepthAndDistance(root).get(1);
    }
    
    public List<Integer> maxDepthAndDistance(TreeNode A){
        List<Integer> result = new ArrayList<Integer>();
        if(A.nodes.isEmpty()){
            result.add(0);
            result.add(0);
            return result;
        }
        
        int maxDepth= -1;
        int secondMaxDepth=-1;
        int maxDistance = -1;
        for(TreeNode node : A.nodes){
            List<Integer> temp =maxDepthAndDistance(node);
            if(maxDepth<temp.get(0)){
                secondMaxDepth = maxDepth;
                maxDepth=temp.get(0);
            }
            else if(secondMaxDepth<temp.get(0)){
                secondMaxDepth=temp.get(0);
            }
                
            if(maxDistance<temp.get(1))
                maxDistance=temp.get(1);
            
        }
        result.add(maxDepth+1);
        if(secondMaxDepth == -1){
            if(maxDepth+1 > maxDistance)
                result.add(maxDepth+1);
            else{
                result.add(maxDistance);
            }
        }else{
            if(maxDepth+secondMaxDepth+2 > maxDistance)
                result.add(secondMaxDepth+maxDepth+2);
            else
                result.add(maxDistance);
        }
         
        return result;
    }
    
    
    public TreeNode createTree(ArrayList<Integer>A){
        TreeNode root =null;
        HashMap<Integer,TreeNode> map = new HashMap<Integer,TreeNode>();
        for(int i=0;i<A.size();i++){
            if(map.get(A.get(i)) == null)
                map.put(A.get(i),new TreeNode(A.get(i)));
            
            if(map.get(i)==null) {
                map.put(i,new TreeNode(i));
            }
            map.get(A.get(i)).nodes.add(map.get(i));
            
        }
        
        return map.get(-1).nodes.get(0);
    }
    public class TreeNode{
        public int val;
        public List<TreeNode> nodes;
        public TreeNode(int val){
            this.val=val;
            this.nodes = new ArrayList<TreeNode>();
        }
    }

}
