서로 다른 두 개의 정수가 주어진다.

두 정수를 입력받아 큰 수는 2로 나눈 몫을 저장하고 작은 수는 2를 곱하여 저장한 후 출력하는 프로그램을 작성하시오.

(참조에 의한 호출을 이용한 함수를 작성하여 값을 수정하고 출력은 메인함수에서 한다.)



import java.util.Scanner;

public class Test {
	
	static int big, small;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		func(a, b);
		
		if(a>b) {
			System.out.println(big+" "+small);
		}else {
			
			System.out.println(small+" "+big);
		}
		
	}
	
	static void func(int a, int b) {
		
		big = Math.max(a, b);
		small = Math.min(a, b);
		
		big /= 2;
		small *= 2;
		
	}

}
