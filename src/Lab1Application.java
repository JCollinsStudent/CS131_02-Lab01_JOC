
public class Lab1Application {
	public static void main(String[] args) {
		//Rectangle class tests
		Rectangle rec = new Rectangle(2, 4);
		
		System.out.println("Rectangle test outputs:");
		
		int area = rec.calculateArea();
		System.out.println("Area = " + area);
		
		int perimeter = rec.calculatePerimeter();
		System.out.println("Perimeter = " + perimeter);
		
		int length = rec.getLength();
		int width = rec.getWidth();
		System.out.println("Length = " + length + "\nWidth = " + width);
		
		//DistanceCalculator class tests
		double distance = DistanceCalculator.calculateDistance(1, 1, 2, 2);
		System.out.println("\nDistanceCalculator test output:");
		System.out.println(distance);
		
		//BasicMath class tests
		int addExample = BasicMath.add(2, 3);
		int subExample = BasicMath.subtract(3, 2);
		int multExample = BasicMath.multiply(2, 3);
		double divExample = BasicMath.divide(2, 4);
		System.out.println("\nBasicMath test output:");
		System.out.println(addExample + " " + subExample + " " + multExample + " " + divExample);
		
		//DateManipulator class tests
		DateManipulator dm = new DateManipulator();
		System.out.println("\nDateManipulator test output:");
		boolean isLeapYear = dm.isLeapYear(2400);
		if (isLeapYear) {
			System.out.println("2400 is a leap year.");
		}
		else {
			System.out.println("2400 is not a leap year.");
		}
	}
}
