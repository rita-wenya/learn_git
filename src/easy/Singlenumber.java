package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//136 Given an array of integers, every element appears twice except for one. Find that single one.
public class Singlenumber {
	 public static int singleNumber(int[] nums) {
		 int number = 0;
		 Set<Integer> set=new HashSet();
		 for(int i=0;i<nums.length;i++){
			 if(set.contains(nums[i])){
				 set.remove(nums[i]);
			 }else{
				 set.add(nums[i]);
			 }
		 }
		 Iterator iter = set.iterator();
		 while(iter.hasNext()){
			 number = (int) iter.next();
		 }
		return number;      
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,2};
		System.out.println(singleNumber(nums));

	}
//	异或：得出一个数和0异或还是自己，如果相同的数字是成对出现的(位置不一定相邻)，遍历数组，并且两两异或，结果一定为0.
//	如果出现过其中一对有缺失数字，即只出现了一个，则遍历异或结果为缺失的数字
//	public int singleNumber(int[] nums) {
//	    int result = 0;
//	    for(int i : nums) {
//	        result ^= i;
//	    }
//	    return result;
//	}
	
}
