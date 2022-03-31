import java.util.Scanner;

public class biggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		System.out.println("enter value of c");
		int c = sc.nextInt();
		System.out.println("enter value of d ");
		int d = sc.nextInt();
		if (a > b && a > c && a > d) {
			System.out.println("a is the greatest number:" + a);
		} else if (b > a && b > c && b > d) {
			System.out.println("b is the greatest number:" + b);
		} else if (c > a && c > b && c > d) {
			System.out.println("c is the greatest number:" + c);

		} else {
			System.out.println("d is the greatest number:" + d);
			System.out.println("this is for practice in git");
		}
		sc.close();
	}

}
