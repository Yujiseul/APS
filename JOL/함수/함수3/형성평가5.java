100만 이하의 자연수 N을 입력받아 짝수이면 2로 홀수이면 3으로 나누는 작업을 반복하다가 그 값이 1이 되면 그때까지 나누었던 작업의 횟수를 출력하는 프로그램을 재귀함수로 작성하시오.
  
  
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		
		func(n,0);
		

	}
	
	static void func(int n, int cnt) {
		
		if(n == 1) {
			System.out.println(cnt);
			return;
		}
		
		if(n % 2 == 0) {
			func(n/2, ++cnt);
		}else {
			func(n/3, ++cnt);
		}
		
	}
	
	
}
