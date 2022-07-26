첫 번째는 1, 두 번째는 2, 세 번째부터는 앞의 두 수의 곱을 100으로 나눈 나머지로 이루어진 수열이 있다.

100 이하의 자연수 N을 입력받아 재귀함수를 이용하여 N번째 값을 출력하는 프로그램을 작성하시오.
  
  
import java.util.Scanner;

public class Main {
	
	static int[] visited = new int[101];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		visited[1] = 1;
		visited[2] = 2;
		
		int answer = func(n);
		
		System.out.println(answer);
	}
	
	static int func(int n) {
		
		if(visited[n] == 0) {
			
			visited[n] = func(n-1)*func(n-2)%100;
		}
		
		return visited[n];
	}
	
	
}
  
  
  
  
### 시간 초과
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int answer = func(n);
		
		System.out.println(answer);
	}
	
	static int func(int n) {
		
		if(n == 1)
			return 1;
		
		if(n == 2)
			return 2;
		
		return func(n-1)*func(n-2)%100;

	}
	
	
}
