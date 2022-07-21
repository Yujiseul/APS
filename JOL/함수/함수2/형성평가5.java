세 개의 실수를 입력받아 합계와 평균을 구하여 평균을 반올림한 정수를 출력하고, 다음은 입력받은 수를 각각 먼저 반올림한 후 합계와 평균을 구하여 평균을 반올림한 한 결과를 출력하는 프로그램을 작성하시오.


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		func(num1, num2, num3);
	}
	
	static void func(double n, double m, double k) {
		
		double sum = n+m+k;
		double avg = sum/3;
		System.out.println((int)Math.round(avg));
		double sum2 = Math.round(n)+Math.round(m)+Math.round(k);
		double avg2 = sum2/3;
		System.out.println((int)Math.round(avg2));
		
		
	}
	
	

}
