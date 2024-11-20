package sajin;

public class factorial {

	public static void main(String[] args) {
		int i,fact=1;
		int n=5;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
         System.out.println("factorial"+n+ "is:" +fact);
	}

}
