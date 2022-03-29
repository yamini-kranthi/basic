
public class Operators {
int a=10;
int b=40;
static int c=50;
	public static void main(String[] args) {
		Operators obj=new Operators();
	
		obj.display();

	}
    void display() {
    	System.out.println("sum of a and b is:" +(a+(b+c)));
    	System.out.println("subtraction of c and b is:"+(c-b));
    	System.out.println("multiplication of a and band c is:"+a*b*c);
    	System.out.println("division of a and b is: "+ a/b);
    }
}
