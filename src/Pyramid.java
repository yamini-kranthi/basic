

public class Pyramid {
	int row,sp,str;
	int n = 5;
	public static void main(String[] args) {
	Pyramid obj = new Pyramid();
		obj.upperpyramid();
		obj.reversepyramid();
	}

	public  void upperpyramid() {
		for( row = 1; row <= n; row++) {
			for ( sp = 1; sp <=(n-row); sp++) {
				System.out.print(" ");
			}
			for (str = 1; str<=( 2*row - 1); str++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public void reversepyramid() {
	for( row=1;row<=n;row++) {
		for(sp=1;sp<=row-1;sp++) {
			System.out.print(" ");
		}
		for(int str=1;str<=((n*2)-(row*2)+1);str++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	}
}

