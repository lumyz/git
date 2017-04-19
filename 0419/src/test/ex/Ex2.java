package test.ex;

public class Ex2 {

	public static void main(String[] args) {

		double recWidth = 20.25, recHeight = 10.12,recArea , cirRadius = 9.82,  cirArea, triWidth = 20, triHeight = 10, triArea, wholeArea, wholeWidth = 100, wholeHeight = 35;
		
		double area;

		recArea = rectangular(recWidth, recHeight);
		
		triArea = triangle(triWidth, triHeight);
		
		cirArea = circle(cirRadius);
		
		wholeArea = rectangular(wholeWidth, wholeHeight);
		
		area = result(recArea, triArea, cirArea, wholeArea);

		System.out.println(area);
	}

	private static double result(double recArea, double triArea, double cirArea, double wholeArea) {

		double result;
		
		result = wholeArea - (recArea + triArea + cirArea);
		
		return result;
	}

	private static double circle(double radius) {
		
		double area, pi = 3.1415;
		
		area = radius * radius * pi;
		
		return area;
	}

	private static double triangle(double width, double height) {
		
		double area;
		
		area = width * height / 2;
		
		return area;
	}

	private static double rectangular(double width, double height) {
				
		double area;
		
		area = width * height;
		
		return area;
		
	}

}
