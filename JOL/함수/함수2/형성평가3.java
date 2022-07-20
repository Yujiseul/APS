5개의 정수를 입력받아 각 정수의 절대값의 합을 출력하는 프로그램을 작성하시오.
  
  import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		func(arr);
	}
	
	static void func(int[] arr) {
		
		
		int answer = 0;
		
		for(int i=0; i<arr.length; i++) {
			answer+=Math.abs(arr[i]);
		}
		
		System.out.println(answer);
	}
	

}
