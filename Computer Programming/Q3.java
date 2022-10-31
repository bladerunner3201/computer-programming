import java.lang.Math;
import java.util.Scanner;

public class Test {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ax^2+bx+c=0 의 a,b,c를 입력하시오");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int Q= (b*b) - (4*a*c); 
	sc.close();
		if(Q>0)	{
			double x1 = -b/(2*a) + Q*0.5/(2*a);
			double x2 = -b/(2*a) - Math.sqrt(Q)/(2*a);
			System.out.printf("실근이 두개이다. " + x1 + x2);	
		}
		else if(Q==0){
			double x1 = -b/(2*a) + Math.sqrt(Q)/(2*a);
			System.out.println("실근이 한개이다. " + x1);	
		}
		else{
			System.out.println("실근이 없다. ");
		}
	}
}