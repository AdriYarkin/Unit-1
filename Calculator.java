import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("What number would you like to double: ");
      int num = scan.nextInt();
      System.out.println(num + " times two is " + multiplyBy2(num));
	}

    public static int multiplyBy2(int n){
      return n * 2;
    }
}
