자연수 N을 입력받아 재귀함수를 이용하여 N부터 1까지 차례대로 출력하는 프로그램을 작성하시오. 
N은 50이하의 자연수이다.
  
  
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		func(n);
		
	
	}
	
	static void func(int n) {
		
		if(n == 0)
			return;
		
		
		System.out.print(n+" ");
		
		func(--n);
	}
	
	
}
