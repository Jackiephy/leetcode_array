// Replace the element instead of removing them.
package Array;

import java.util.Arrays;

public class RemoveDuplicatesII {
	public static int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		int res = 1;
		// create a counter to count the duplicate number.
		// cnt = 0 means the number appears for the first time,
		// cnt = 1 means the number appears for the second time.
		// The question needs us to keep the maximum duplicate number less than 2 times.
		// So we add the cnt judgement as cnt < 1.
		int cnt = 0;
		for(int i = 1; i < nums.length; i++) {
			if((cnt < 1) && (nums[i] == nums[i - 1])) {
				cnt++;
				nums[res] = nums[i];
				res++;
			} else if(nums[i] > nums[i - 1]) {
				cnt = 0;
				nums[res] = nums[i];
				res++;
			}
		}
		return res;
    }
	
	public static void main(String args[]) {
		int[] nums = {0,1,0,2,1,1,1,3,3};
		int n = removeDuplicates(nums);
		for(int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}
