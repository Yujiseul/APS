20 이하의 자연수 N을 입력받아 재귀함수를 이용해서 문자열 “recursive”를 N번 출력하는 프로그램을 작성하시오.
  
  
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		func(n);
		
	
	}
	
	static void func(int n) {
		
		if(n == 0)
			return;
		
		
		System.out.println("recursive");
		
		func(--n);
	}
	
	
}
