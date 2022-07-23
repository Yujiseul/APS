100 이하의 자연수 N을 입력받아 재귀함수를 이용하여 1부터 N까지의 합을 구하는 프로그램을 작성하시오.
  
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		func(n, 0);
		
	
	}
	
	static void func(int n, int s) {
		
		if(n == 0) {
			System.out.println(s);
			return;
		}
		
		s+=n;
		
		func(--n, s);
	}
	
	
}
