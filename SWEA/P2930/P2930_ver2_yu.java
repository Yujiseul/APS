
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			StringBuilder sb = new StringBuilder();

			sb.append("#").append(tc);

			// 배열로 풀어보자

			int[] tree = new int[100001];

			int size = 0;

			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {

				int type = sc.nextInt();

				if (type == 1) {

					tree[++size] = sc.nextInt();

					int idx = size;
					while (idx > 1) {
						if (tree[idx / 2] < tree[idx]) {

							int temp = tree[idx];
							tree[idx] = tree[idx / 2];
							tree[idx / 2] = temp;

							idx /= 2;
						}else {
							break;
						}
					}
				}

				if (type == 2) {

					if (tree[1] != 0) {
						sb.append(" ").append(tree[1]);
						tree[1] = tree[size];
						tree[size] = 0;
						size--;

						// 다시 정렬
						int j=1;
						
						while (j*2+1 <=size) {
							
							
							int idx = tree[j * 2] > tree[j * 2 + 1] ? j * 2 : j * 2 + 1;

							if (tree[j] < tree[idx]) {

								int temp = tree[j];
								tree[j] = tree[idx];
								tree[idx] = temp;
								
								j = idx;
							}else {
								break;
							}
							
							
						}// while end
					} else {
						sb.append(" ").append(-1);
					}
				}

			}
			System.out.println(sb.toString());

		} // test case end

	}

}
