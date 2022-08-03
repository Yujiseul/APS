
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long sum = func(n);
		System.out.println(sum);
	}
	
	static long func(int n) {
		
		if(n==1) {
			
			
			System.out.println("1! = 1");
			return 1;
		}
		System.out.printf("%d! = %d * %d!\n",n,n,n-1);
		return n*func(n-1);
	}
	
	
	
	
}
