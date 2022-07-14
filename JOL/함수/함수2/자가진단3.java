두 개의 정수를 입력받아 절대값이 더 큰 수를 출력하고 두 개의 실수를 입력받아 절대값이 작은 수를 출력하는 프로그램을 작성하시오.
실수는 소수점 이하 2자리까지 출력한다.




import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		func(num1, num2, n1, n2);
		
	}
	
	static void func(int a, int b, double c, double d) {
		
		if(Math.abs(a)<Math.abs(b)) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}
		
		if(Math.abs(c)>Math.abs(d)) {
			System.out.printf("%.2f",d);
		}else {
			System.out.printf("%.2f",c);
		}
		
	}
	
}
