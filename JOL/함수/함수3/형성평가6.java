3자리로 이루어진 자연수 3개를 입력받아 그 수들의 곱을 구한 후 그 결과값의 각 자리 숫자들중 0을 제외한 모든 수들의 곱을 구하여 출력하는 프로그램을 재귀함수로 작성하시오.
  
  
  
import java.util.Scanner;

public class Main {
	
static int sum = 1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int num = n1*n2*n3;
		
		func(num);
		

	}
	
	static void func(int n) {
		
		if(n<1) {
			System.out.println(sum);
			return;
		}
		
		int num = n%10;
		
		if(num != 0) {
			sum *= num;
		}
		
		func(n/10);
	}
	
	
}
