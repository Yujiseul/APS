정수 N을 입력받고 다시 N개의 정수를 입력받아 내림차순으로 정렬하여 출력하는 프로그램을 작성하시오.
(1 ≤ N ≤ 15, 입력과 출력, 정렬은 모두 함수를 이용할 것)
  
  
  import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int[] arr = input();
		
		sort(arr);
		output(arr);

	}
	
	static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	
		return arr;
	}
	
	static int[] sort(int[] arr) {
		
		boolean flag = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				flag = false;
			}
		}
		
		if(!flag) 	{
			
			sort(arr);
		}
		return arr;
	}
	
	static void output(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
