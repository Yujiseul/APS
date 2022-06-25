import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idx = sc.nextInt();
		
	func(idx);
		
	}
	
	public static void func(int idx) {
		
		if(idx == 0) {
			return;
		}
		
		System.out.println("~!@#$^&*()_+|");
		
		func(idx-1);
	}

}
