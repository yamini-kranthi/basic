import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int a=sc.nextInt();
     Fact(a);
     sc.close();
     
	}
   public static void Fact(int num) {
	   int f=1;
	   
	   for(int i=0;i<num;i++) {
		   f=f*(num-i);
	   }
	   System.out.println(f);
   System.out.println("****");
}
}
