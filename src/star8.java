
public class star8 {

	public static void main(String[] args) {
int n=5;
for(int row=1;row<=n;row++) {
	for(int sp=1;sp<=row-1;sp++) {
		System.out.print(" ");
	}
	for(int str=1;str<=2*row-1;str++) {
		System.out.print(" *");
	}
	System.out.println();
}
	}

}
