
public class star3 {

	public static void main(String[] args) {
      int i,j,k,n=4,m=1;
      for(i=1;i<=5;i++) {
    	  for(j=1;j<=n-i+1;j++) {
    		  System.out.print(" ");
    	  }
    	  for(k=1;k<=m;k++) {
    		  System.out.print("*");
    	  }
    	  System.out.println();
    	  m++;
      }
	}

}
