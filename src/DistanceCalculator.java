
public class DistanceCalculator {

	private DistanceCalculator() {
		
	}//end empty argument constructor
	
	public static double calculateDistance(int x, int y, int a, int b) {
		double distance = Math.sqrt(Math.pow(a-x, 2) + Math.pow (b-y, 2));
		return distance;
		
	}//end calculateDistance
	
}//end class