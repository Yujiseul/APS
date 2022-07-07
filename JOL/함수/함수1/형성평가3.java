자연수를 입력받아 아래와 같은 사각형을 출력하는 프로그램을 작성하시오.

주어지는 수는 100이하의 자연수이다.

(함수를 작성하시오.)




import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		func(num);
		
		
	}
	
	static void func(int n) {
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			arr[0][i] = i+1;
			arr[i][0] = i+1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<n; j++) {
				
				arr[i][j] = arr[0][j] * arr[i][0];
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
