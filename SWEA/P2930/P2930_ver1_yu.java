package d3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class d3_2930_힙 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			StringBuilder sb = new StringBuilder();

			sb.append("#").append(tc);

			// 최대합을 하기위해 컬렉션 이용
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {

				int type = sc.nextInt();

				if (type == 1) { // 삽입

					pq.add(sc.nextInt());
				} else { // 삭제

					if (pq.isEmpty()) {
						sb.append(" ").append(-1);
						
					} else {

						sb.append(" ").append(pq.poll());
					}

				}

			}

//			sb.append("\n");
//			System.out.print(sb);
			
			System.out.println(sb.toString()); // 출력

		} // test case end
	}

}
