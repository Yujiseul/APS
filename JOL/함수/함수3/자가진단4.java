9자리 이하의 자연수를 입력받아 재귀함수를 이용하여 각 자리 숫자의 제곱의 합을 출력하는 프로그램을 작성하시오.


( main()함수에 변수 하나, 재귀함수에 매개변수 하나만을 사용할 수 있다.)
  
  
  
 import java.util.Scanner;

public class Main {

	
	static long sum = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		func(n);
	}
	
	static void func(int n) {
		
		if(n<=0) {
			System.out.println(sum);
			return;
		}
		
		int num = n%10;
		sum+=num*num;
		
		n /= 10;
		
		func(n);
		
	}
	
	
}
