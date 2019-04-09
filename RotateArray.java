// For example, we have nums = {1,2,3,4,5,6,7},
// If k = 3, we can firstly reverse nums into {7,6,5,4,3,2,1},
// Then reverse the first k numbers into {5,6,7,4,3,2,1},
// Finally reverse other numbers into {5,6,7,1,2,3,4}.
package Array;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		int r = k % len;
		reverse(0, len - 1, nums);
		reverse(0, r - 1, nums);
		reverse(r, len - 1, nums);
		for(int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
    }
	
	public static void reverse(int start, int end, int[] nums) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 2;
		rotate(nums, k);
	}
}
