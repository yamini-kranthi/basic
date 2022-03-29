import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("reverse of a given number is:");
		reverseNumber(n);
		sc.close();
	}

	public static void reverseNumber(int number) {
		int reminder=0;
		while (number > 0) {
			reminder = number % 10;
			System.out.print(reminder);
			number = number / 10;
		}
	}
}
