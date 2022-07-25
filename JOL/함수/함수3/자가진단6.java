첫 번째 수는 1이고 N번째 수는 (N/2)번째 수(파이썬인경우 N//2번째)와 (N-1)번째 수의 합으로 구성된 수열이 있다.

50 이하의 자연수 N을 입력받아 재귀호출을 이용하여 이 수열에서 N번째 수를 출력하는 프로그램을 작성하시오.

(1 2 3 5 7 10 13 18 …)
                             
                             
                             
                             
import java.util.Scanner;

public class Main {

	
	static long sum = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = func(n);
		
		System.out.println(answer);
	}
	
	static int func(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 2;
		}
		
		return func(n-1)+func(n/2);
		
	}
	
	
}
