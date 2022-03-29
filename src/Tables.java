import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
      int b=sc.nextInt();
      table(b);
         sc.close();
      
	}

	public static void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(num+"*" + i +"="+ num*i);
		}
	}
}
