원의 넓이를 입력받아 반지름의 길이를 소수 둘째자리까지 출력하는 프로그램을 작성하시오.

원의 넓이 = 반지름 * 반지름 * 3.14 식을 이용하시오.
  
  
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double answer = func(num);
		
		System.out.printf("%.2f",answer);
	}
	
	static double func(int a) {
		
		double answer = Math.sqrt(a/3.14);
		
		return answer;
	}
	
}
