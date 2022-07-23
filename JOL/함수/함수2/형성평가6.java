자료의 개수 7을 매크로 상수로 정의하여 자료의 개수만큼 정수를 입력받아 입력받은 순서대로 앞에서부터 마지막까지 가면서 바로 뒤의 숫자와 비교하여 크면 교환한다. 

이러한 작업을 세 번만 반복한 후 그 결과를 하나의 행에 공백으로 구분하여 출력하는 프로그램을 작성하시오.
  
  
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i<7; i++) {
			arr[i] = sc.nextInt();
		}
		
		func(arr,0);
	}
	
	static void func(int[] arr, int n) {
		
		if(n==3) {
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			return;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
		}
		
		func(arr, ++n);
		
	}
	
	
	
	

}
