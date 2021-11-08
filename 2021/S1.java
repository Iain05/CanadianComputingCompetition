import java.util.Scanner;
class Main {
  	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		double totalArea = 0;
		int numOfFences = input.nextInt();
		int[] height = new int[numOfFences+1];
		int[] width = new int[numOfFences];

		for (int i = 0; i < height.length; i++) {
			height[i] = input.nextInt();
		}
		for (int i = 0; i < width.length; i++) {
			width[i] = input.nextInt();
		}
		for (int i = 0; i < numOfFences; i++) {
			double left = (double)height[i];
			double right = (double)height[i+1];
			double bottom = (double)width[i];
			totalArea += getArea(left, right, bottom);
		}
		System.out.println(totalArea);
  	}

	public static double getArea(double left, double right, double bottom) {
		double area;
		double triangle = ((Math.abs(left-right))*bottom)/2;
		if (left >= right) {
			area = (left * bottom) - triangle;
		} else {
			area = (right * bottom) - triangle;
		}
		return area;
	}
}
