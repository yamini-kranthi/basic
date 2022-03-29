
public class palindrome2 {

	public static void main(String[] args) {
		int reminder=0;
int n=454;
int temp=n;
int reverse = 0;

while(n>0)	{
	reminder=n%10;
	reverse=reverse*10+reminder;
	System.out.print(reminder);
	n=n/10;
}
if(temp==reverse) {
	System.out.println("\n"+"plaindrome");
}
else {
	System.out.println("not a palindrome");
}
}
	}


