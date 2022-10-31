import java.lang.Math;
import java.util.Scanner;

public class test3 {
	public static void main(String [] args) {
		double side1, side2, side3, s, x1, x2, x3, y1, y2, y3, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter (x1, y1), (x2, y2), (x3, y3)");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		sc.close();
		side1 = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
		side2 = Math.sqrt((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3));
		side3 = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
		s = (side1 + side2 + side3)/2;
		area =  Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
		System.out.print(area);
	}
}
