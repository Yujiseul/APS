10개의 정수를 입력받아 버블정렬로 내림차순 정렬을 하면서 하나의 단계가 끝날 때마다 그 정렬결과를 출력하는 프로그램을 작성하시오.
  
  
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		func(arr, 1);

	}
	
	static void func(int[] arr, int cnt) {
		
		
		for(int i=0; i<arr.length-1; i++) {
		
			if(arr[i]<arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		++cnt;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		if(cnt>=10) return;
		else {
			func(arr, cnt);
		}
	}
	
	

}
