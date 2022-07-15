세 개의 실수를 입력받아,

가장 큰 수를 올림한 정수를 출력하고,

가장 작은 수를 내림한 정수를 출력한 후,

남은 수를 반올림한 정수를 출력하는 프로그램을 작성하시오.

입력되는 실수는 -1000이상 1000이하이다.
  
  
  
  import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextDouble();
		}
		
		func(arr);
		

	}
	
	
	static void func(double[] arr) {
		
		Arrays.sort(arr);
		
		System.out.print((int)Math.ceil(arr[2])+" ");
		System.out.print((int)Math.floor(arr[0])+" ");
		System.out.println((int)Math.round(arr[1]));
		
	}

}
