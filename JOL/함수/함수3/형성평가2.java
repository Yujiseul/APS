자연수 N을 입력받아 N이 홀수인 경우에는 1부터 N까지의 홀수를 짝수인 경우는 2부터 N까지의 짝수를 모두 출력하는 프로그램을 재귀함수로 작성하시오.



import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		func(n);
		
	}
	
	static void func(int n) {
		
		if(n<1) 
			return;
		
		
		func(n-2);

		System.out.print(n+" ");

	}
	
	
}
