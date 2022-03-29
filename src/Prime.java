import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
//		if (n == 0 || n == 1) {
//			System.out.println("not a prime number");
//		}
		int i = 2;
		while (i < n)

		{

			if (n % i == 0) {
				System.out.println("not a prime number");
				break;

			} else {
				System.out.println("prime number");
				break;

			}

		}
		sc.close();
	}
}
