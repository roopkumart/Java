package javaInterviewPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumArray {
public static int[] findTwoSum(int nums[],int target) {
	HashMap<Integer,Integer> numMap=new HashMap<Integer,Integer>();
for(int i=0;i<nums.length;i++) {
	//i=0:2, extra =target-[0]:9-5=4
int extra =target-nums[i];//9-5=4
//true:I got that pair
if(numMap.containsKey(extra)){
	return new int[] { numMap.get(extra),i};//2,3
	
}
//store the current number and its index in the hashmap for the future lookups
numMap.put(nums[i],i);//2:0 11:1 5:2
}
return null;
}
	public static void main(String[] args) {
		int nums[]= {2,11,5,4};
		int target=9;
		int result[]=findTwoSum(nums, target);
		System.out.println(Arrays.toString(result));
		
	}

}
 