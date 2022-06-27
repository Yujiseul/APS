100 미만의 정수만 입력된다. 정수 n을 입력받아 n x n 크기의 숫자사각형을 출력하는 프로그램을 작성하시오.

이때 정수 n을 전달받아 숫자 정사각형을 출력하는 함수를 작성하고, 입력받은 정수 n을 함수로 전달하여 출력한다.
  
  



import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		func(n);		
		
	}
	
	static void func(int n) {
		
		int num = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(num+++" ");
			}
			System.out.println();
		}
	}

}
