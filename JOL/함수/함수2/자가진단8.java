정수 두 개를 입력받고 계산식을 매크로 함수로 작성하여 두 수의 차를 제곱한 값과 합을 세제곱한 값을 각각 출력하는 프로그램을 작성하시오.

('^'는 연산자가 아니고 거듭제곱을 뜻하는 표시이므로 거듭제곱은 별도로 계산해야함)
  
  
  
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		func(num1, num2);

	}
	
	
	static void func(int a, int b) {
		
		
		System.out.printf("(%d - %d) ^ %d = %d\n",a,b,2,(a-b)*(a-b));
		System.out.printf("(%d + %d) ^ %d = %d",a,b,3,(a+b)*(a+b)*(a+b));
		
		
	}

}
