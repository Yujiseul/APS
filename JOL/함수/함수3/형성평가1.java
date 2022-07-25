자연수 N을 입력받아 1부터 N까지 출력을 하되 n-1번째 값은 n번째 값을 2로 나눈 몫이 되도록 하는 프로그램을 작성하시오.
  
  
  
import java.util.Scanner;

public class Main {

	
	static long sum = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		func(n);
		
	}
	
	static void func(int n) {
		

		if(n <= 1) {
			System.out.print(1+" ");
			return;
		}
		
		
		func(n/2);
		
		System.out.print(n+" ");
	}
	
	
}
