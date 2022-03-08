import java.util.Scanner;

public class bj_11720_숫자의합 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;

		// *주의* 입력이 공백인지 아닌지를 확인하고, 공백이 없다면 스트링으로 받아서 처리하기
		char[] num = sc.next().toCharArray();

		for (int i = 0; i < n; i++) {

			// *주의* char니까 int로 계산을 할 때는 변환을 해줘야함
			sum += num[i]-'0';

		}

		System.out.println(sum);
	}

}
