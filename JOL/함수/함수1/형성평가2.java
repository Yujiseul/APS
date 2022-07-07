1부터 전달받은 수까지의 합을 출력하는 함수를 작성하고 1000 이하의 자연수를 입력받아 작성한 함수로 전달하여 출력하는 프로그램을 작성하시오.
  
  import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int answer = func(num);
		
		System.out.println(answer);
	}
	
	static int func(int n) {
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		
		return sum;
		
	}

}
