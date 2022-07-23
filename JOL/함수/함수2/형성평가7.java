원주율을 3.141592로 매크로 상수로 정의하고 원의 넓이를 구하는 매크로 함수를 작성하여 반지름을 입력받아 원의 넓이를 출력하는 프로그램을 작성하시오. (소수 넷째자리에서 반올림)
  
  
  
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static double pi = 3.141592;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double r = sc.nextDouble();
		
		func(r);
	}
	
	static void func(double r) {
		
		
		double area = r * r * pi;
		System.out.printf("radius : area = %.3f",area);
	}
	
	
}
