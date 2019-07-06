package academy.learnProgramming.algorithm.utils;

public class MinIndex {

	   public int findMin(int[] nums) {
	        
		   return recusriveFindMin(nums, 0, nums.length-1);
	    }
	   
	   public int recusriveFindMin(int[] nums, int startIndex, int endIndex) {
		   int mid = (startIndex+endIndex)/2;
		   
		   if(nums[mid-1]>nums[mid])
			   return nums[mid];
		   
		   if(nums[startIndex]>nums[mid]) {
			   return recusriveFindMin(nums, startIndex, mid-1);
		   }else {
			   return recusriveFindMin(nums, mid, endIndex);
		   }
	   }
}
