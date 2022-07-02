정수의 연산식을 입력받아 연산을 위한 함수를 호출하여

4칙연산(+ - * /)의 연산결과를 출력하는 프로그램을 작성하시오.

('/'의 경우는 정수 부분만 출력하고 4칙연산 이외의 연산 결과는 0으로 한다.)
( if_else 문으로 작성하세요.)
  
  
 import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		String cal = sc.next();
		
		int b = sc.nextInt();
		
		int answer = func(a, cal, b);
		
		System.out.println(a+" "+cal+" "+b+" "+"="+" "+answer);

	}
	
	static int func(int a, String cal, int b) {
		
		int result = 0;
		
		if(cal.equals("+")) {
			result = a+b;
			return result;
		}else if(cal.equals("-")) {
			result = a-b;
			return result;
		}else if(cal.equals("/")) {
			result = a/b;
			return result;
		}else if(cal.equals("*")) {
			result = a*b;
			return result;
		}
		return result;
	}

}
