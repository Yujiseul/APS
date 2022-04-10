package d4;

import java.util.Scanner;

public class d4_1486_장훈이의높은선반 {

	static int N, B, ans;
	static int[] clerk;
	static boolean[] sel;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt(); // 점원수

			B = sc.nextInt(); // 선반 높이

			clerk = new int[N];

			sel = new boolean[N];

			for (int i = 0; i < N; i++) {

				clerk[i] = sc.nextInt();
			}
			// 입력 끝

			ans = Integer.MAX_VALUE;

			hight(0);

			System.out.println("#" + tc + " " + ans);

		} // tc

	}// main

	static void hight(int idx) {

		if (idx >= N) {
			int sum = 0;

			for (int i = 0; i < N; i++) {
				if (sel[i]) {
					sum += clerk[i];

				}
			}

			if (sum >= B) {
				sum -= B;

				ans = Math.min(ans, sum);
			}

			return;
		}

		sel[idx] = true;
		hight(idx + 1);
		sel[idx] = false;
		hight(idx + 1);
	}
}
