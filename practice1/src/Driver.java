import java.util.Scanner;

public class Driver {
	public static void sortNumbers (int num1, int num2, int num3) {
		
		// 7 3 5 
		if (num2 < num1 && num2 < num3) {
			int d = num1;
			num1 = num2;
			num2 = d;
			
		// 7 5 3
		} else if (num3 < num2 && num3 < num1) {
			int d = num1;
			num1 = num3;
			num3 = d;
			
		// 3 5 7
		} if (num3 < num2) {
			int d = num2;
			num2 = num3;
			num3 = d;			
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}
	
	public static void reverse(int number) {		
		while(number > 0) {
			System.out.println(number%10);
			number /= 10;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		// reverse(num);
		
		sortNumbers(num1, num2, num3);
	}
}
