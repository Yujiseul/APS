두 개의 실수를 입력받아 각각의 제곱근을 구하고 두 제곱근 사이에 존재하는 정수의 개수를 출력하는 프로그램을 작성하시오.

단, 입력받는 두 실수는 양수이며 두 제곱근 사이라는 말은 두 제곱근을 포함한다.


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		func(num1, num2);
	}
	
	static void func(double n1, double n2) {
		
		int cnt = 0;
		
		double big = Math.max(Math.sqrt(n1), Math.sqrt(n2));
		double small = Math.min(Math.sqrt(n1), Math.sqrt(n2));
		
		if(big>=(int)big) cnt++;
		
		if(small==(int)small) cnt++;
		
		int dist = (int)big-(int)small-1+cnt;
		
		System.out.println(dist);
	}
	

}
