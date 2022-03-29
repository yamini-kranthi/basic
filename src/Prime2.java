import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int PrimeNumber=0;
		if (n == 0 || n == 1) {
			System.out.println("not a prime number");
		}
		while (i < n) {
			if (n % i == 0) {
				System.out.println("not a prime number");
			} else {
				System.out.println("prime numbers are:");
				i++;
				PrimeNumber=PrimeNumber+i;		
				System.out.println(PrimeNumber);

				}
		}

		sc.close();
	}
}
