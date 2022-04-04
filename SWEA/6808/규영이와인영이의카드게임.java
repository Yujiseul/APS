package d3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class d3_6808_규영이와인영이의카드게임 {

	static List<Integer> kyu;
	static int[] inn;
	static int N;
	static int kwin;
	static int klose;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			kyu = new ArrayList<>();

			for (int i = 0; i < 9; i++) {

				kyu.add(sc.nextInt());
			} // 규영이 배열 생성 끝

			inn = new int[9];
			N = 9;
 
			int nidx = 0;

			for (int i = 1; i <= 18; i++) {

				if (!kyu.contains(i)) {
					inn[nidx] = i;
					nidx++;
				}
			} // 인영이 배열 생성 끝

			// 초기화
			kwin = 0;
			klose = 0;

			perm(0);

			System.out.println("#" + tc + " " + kwin + " " + klose);

		} // tc

	}// main

	static void swap(int a, int b) {

		int temp = inn[a];
		inn[a] = inn[b];
		inn[b] = temp;
	}// swap

	static void perm(int idx) {

		if (idx == N) {

			int ksum = 0;
			int isum = 0;

			for (int i = 0; i < 9; i++) {

				if (kyu.get(i) > inn[i])
					ksum += kyu.get(i) + inn[i];
				else {
					isum += kyu.get(i) + inn[i];
				}
			}

			if (ksum > isum)
				kwin++;
			else
				klose++;
			return;
		}

		for (int i = idx; i < N; i++) {

			swap(i, idx);
			perm(idx + 1);
			swap(i, idx);
		}

	}// perm

}
