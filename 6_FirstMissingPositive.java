package Array;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
    	if(nums.length < 1) return 1;
    	int[] res = new int[nums.length + 1];
    	put(nums, res);
    	int i = 0;
    	while(res[i] != 0) {
    		i++;
    	}
    	return i + 1;
    }
    
    public static void put(int[] nums, int[] res) {
    	for(long i:nums) {
    		if((i - 1 >= 0) && (i <= nums.length)) {
    			res[(int) (i - 1)] = (int) i;
    		}
    	}
    }
    
    public static void main(String args[]) {
    	int[] nums = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
    	System.out.print(firstMissingPositive(nums));
    }
}
