package Array;

public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int res = 0;
		//If the car cannot drive in a circle return -1
		if(!isCircle(gas, cost)) res = -1;
		else {
			int sum = 0;
			for(int i = 0; i < gas.length; i++) {
				sum = sum + oilTank(gas, cost)[i];
				if(sum < 0) {
					res = i + 1;
					sum = 0;
				}
			}
		}
		return res;
    }
	
	//if sum < 0 the car can never drive in a circle
	//use function isCircle to judge if the car can drive in a circle
	public static boolean isCircle(int[] gas, int[] cost) {
		int sum = 0;
		boolean flag = false;
		for(int i = 0; i < gas.length; i++) {
			sum = sum + oilTank(gas, cost)[i];
		}
		if(sum >= 0) flag = true;
		return flag;
	}
	
	//gas - cost will be the oil left in the tank
	//use function oilTank to store the oil
	public static int[] oilTank(int[] gas, int[] cost) {
		int[] tank = new int[gas.length];
		for(int i = 0; i < gas.length; i++) {
			tank[i] = gas[i] - cost[i];
		}
		return tank;
	}
	
	public static void main(String args[]) {
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		System.out.print(canCompleteCircuit(gas, cost));
	}
}
