import java.util.Scanner;

public class swichdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		System.out.println("enter a number for option");
		int option = sc.nextInt();
		int c;
		switch (option) {
		case 1:
			 c = a + b;
			System.out.println(c);
			break;
		case 2:
			c = a * b;
			System.out.println(c);
			break;
		case 3:
			c = a / b;
			System.out.println(c);
			break;
		case 4:
			c = a % b;
			System.out.println(c);
			break;
		default:
			System.out.println("enter valid option");
		}
		sc.close();
}

}
