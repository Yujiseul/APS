정수 n을 입력받아 2n의 값을 출력하는 프로그램을 작성하시오. (1 ≤ n ≤ 20)
  
  
  import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		func(num);
	}
	
	static void func(int n) {
		
		int answer = (int)Math.pow(2, n);
		
		System.out.println(answer);
	}
	

}
