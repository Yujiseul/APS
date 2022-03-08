
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = a * b * c;

		String num = String.valueOf(result);
		
//		String num = result+"";

		int[] arr = new int[10];

		for (int i = 0; i < num.length(); i++) {

			// char 일 때 항상 주의하기...
			arr[num.charAt(i)-'0']++;

		}

		for (int x : arr) {
			System.out.println(x);
		}
	}

}
