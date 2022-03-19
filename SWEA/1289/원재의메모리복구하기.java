import java.util.Scanner;

public class problem_1289_원재의메모리복구하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			// 비트 입력받기

			char[] bit = sc.next().toCharArray();

			// 초기값 배열

			char[] origin = new char[bit.length];

			// ***주의*** char 는 초기값이 0이 아니므로 셋팅을 해줘야함
			for (int i = 0; i < origin.length; i++) {
				origin[i] = '0';
			}

			// 카운트

			int cnt = 0;

			// 비트 앞자리 부터 검사

			for (int i = 0; i < bit.length; i++) {

				if (bit[i] != origin[i]) {

					for (int j = i; j < bit.length; j++) {

						origin[j] = bit[i];
					}

					++cnt;
				}
			}

			System.out.println("#" + tc + " " + cnt);

		} // test case end
	}

}
