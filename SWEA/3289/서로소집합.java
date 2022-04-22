package d4;

import java.util.Scanner;

public class d4_3289_서로소집합 {

	static int arr[];
	static int n;
	static int m;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();

			sb.append("#").append(tc).append(" ");

			n = sc.nextInt();

			m = sc.nextInt();

			arr = new int[n + 1];

			make_set();

			for (int i = 0; i < m; i++) {

				int num = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();

				if (num == 1) {

					int A = find_set(a);
					int B = find_set(b);

					if (A == B) {
						sb.append(1);
					} else {
						sb.append(0);
					}

				} else {
					union(a, b);
				}
			}

			System.out.println(sb.toString());

		} // tc
	}

	private static boolean union(int a, int b) {

		int A = find_set(a);
		int B = find_set(b);

		if (A == B) {
			return false;
		}

		arr[B] = A;
		return true;
	}

	private static int find_set(int a) {

		if (a == arr[a])
			return a;
		
		return arr[a] = find_set(arr[a]);
	}

	private static void make_set() {
		for (int i = 0; i < n + 1; i++) {
			arr[i] = i;
		}
	}

}
