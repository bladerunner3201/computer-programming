
import java.util.Scanner;
import java.util.Arrays;

public class test4 {
	public static void main(String [] args) {
		int a, b, c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter three integers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		int[] arr1 = {a, b, c};
		Arrays.sort(arr1);
		for(double i : arr1) {
		System.out.println(i);
		}
	}
}
