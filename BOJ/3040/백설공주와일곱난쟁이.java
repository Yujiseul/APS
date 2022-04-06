import java.util.Arrays;
import java.util.Scanner;

public class bj_3040_백설공주와일곱난쟁이 {

	static int[] dwarf;
	static int[] sel;
	static int N = 9;
	static int R = 7;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		dwarf = new int[9];
		sel = new int[7];

		for (int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
		}

		combi(0, 0);

	}// main

	static void combi(int idx, int sidx) {

		if (sidx == R) {

			int sum = 0;

			for (int i = 0; i < 7; i++) {
				sum += sel[i];
			}

			if (sum == 100) {
				for (int i = 0; i < sel.length; i++) {
					System.out.println(sel[i]);
				}
			}

			return;
		}

		if (idx >= N) {
			return;
		}

		sel[sidx] = dwarf[idx];
		combi(idx + 1, sidx + 1);
		combi(idx + 1, sidx);

	}

}
