import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.print("reverse of the given number is:");
		isPalindrome(n);
		sc.close();
	}

	public static void isPalindrome(int number) {
		int r = 0;
		int temp=number;
		int reverse=0;
		while (number> 0) {                    //  123
			r = number % 10;
			System.out.print(r);
			reverse=(reverse*10)+r;
			number = number / 10;
		}
		if(temp==reverse) {
			System.out.println(" \n"+"palindrome");
		}
		else {
			System.out.println("\n"+"not a palindrome");
		}
		}
}


