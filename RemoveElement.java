package Array;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		int res = 0;
		for(int i:nums) {
			if(i != val) {
				nums[res] = i;
				res++;
			}
		}
		return res;
    }
	
	public static void main(String args[]) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int n = removeElement(nums, val);
		for(int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}
