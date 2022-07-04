10 이하의 두 개의 양의 정수를 입력받아서 작은 수부터 큰 수까지의 구구단을 차례대로 출력하는 프로그램을 구조화하여 작성하시오.
  
  import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		func(min, max);
		
		
	}
	
	static void func(int a, int b) {
		
		if(a > b) {
			return;
		}
		
		System.out.println("== "+a+"dan ==");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %2d\n",a,i,(a*i));
		}
		System.out.println();
		
		func(a+1, b);
		
	}

}
