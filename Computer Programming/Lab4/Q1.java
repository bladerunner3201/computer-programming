import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number between 1 and 15: ");
    int numLines = s.nextInt();
    for (int row = 1; row <= numLines; row++){
        for (int col = 1; col <= numLines-row; col++){
            System.out.print(" \t");
        }
        for (int dig= 1; dig <= 2*row-1; dig++){
            System.out.print(row + "\t");
           
        }
              
    System.out.println();
    }
    }
}
