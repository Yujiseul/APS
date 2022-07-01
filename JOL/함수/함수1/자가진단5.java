10 이하의 두 정수가 주어진다.

이를 입력 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여 

다음과 같이 출력하는 프로그램을 작성하시오.
  
  
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		func(a, b);

		

	}
	
	static void func(int a, int b) {
		
		long answer = (long)Math.pow(a, b);
		
		System.out.println(answer);
	}

}
