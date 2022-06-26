반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 반지름의 길이를 입력받아 함수를 호출하여 넓이를 출력하는 프로그램을 작성하시오.
단, 원주율(π)은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다. 
원의 넓이 = 반지름(r) * 반지름(r)​ * 원주율(π)​이다.


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idx = sc.nextInt();
		
	double answer = func(idx);
	
	System.out.printf("%.2f",answer);
		
	}
	
	public static double func(int idx) {
		
		double size = idx * idx * 3.14;
		
		return size;
	}

}
