세 개의 수를 입력받아 가장 큰 값을 출력하는 함수를 작성해보자.


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int answer = func(a, b, c);
		
		System.out.println(answer);

	}
	
	static int func(int a, int b, int c) {
		
		int  step1 = Math.max(a, b);
		int max = Math.max(step1, c);
		
		return max;
	}

}
