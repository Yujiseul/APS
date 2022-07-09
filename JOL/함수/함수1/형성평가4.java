두 개의 음이 아닌 정수를 입력받아 큰 수의 제곱에서 작은 수의 제곱을 뺀 결과값을 

출력하는 프로그램을 작성하시오.

(두 정수를 전달받아 제곱의 차를 리턴하는 함수를 이용할 것)
  
  
  import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int answer = func(num1, num2);
		
		System.out.println(answer);
		
		
	}
	
	static int func(int num1, int num2) {
		
		int answer = Math.abs(num1*num1-num2*num2);
		
		return answer;
		
	}

}
