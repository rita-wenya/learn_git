package array;

import java.util.ArrayList;
import java.util.List;

import ArrayList.FizzBuzz;
//448
/*Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
让编号为i的数取反，最后数为正数的数
*/
public class findDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int temp = Math.abs(nums[i]) - 1;
			if (nums[temp] > 0) {
				nums[temp] = -nums[temp];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDisappearedNumbers fn=new findDisappearedNumbers();
		int a[]={5,6,1,4,7,2,5};
		List<Integer> test=new ArrayList<Integer>();
		test=fn.findDisappearedNumbers(a);
		System.out.println(test);
	}

}
