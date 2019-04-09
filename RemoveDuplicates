// Replace the element instead of removing them.
package Array;

import java.util.Arrays;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		int res = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[i - 1]) {
				nums[res] = nums[i];
				res++;
			}
		}
		return res;
    }
	
	public static void main(String args[]) {
		int[] nums = {0,1,0,2,1,1,2,3,3,4};
		int n = removeDuplicates(nums);
		for(int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}
