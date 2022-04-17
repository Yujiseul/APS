package d6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class d6_1267_작업순서 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {  
			
			int V = sc.nextInt(); // 정점 수 (1부터)
			int E = sc.nextInt(); // 간선의 총 수

			int[] input = new int[V + 1]; // 진입차수 저장
			
			List<Integer>[] connect = new ArrayList[V + 1];

			for (int i = 0; i < V + 1; i++) {
				connect[i] = new ArrayList<>();
			}

			for (int i = 0; i < E; i++) {

				int st = sc.nextInt(); // 시작점
				int ed = sc.nextInt(); // 끝점

				input[ed]++; // 진입차수 늘려주기

				connect[st].add(ed); // 간선 저장
			} // 간선 입력

			Queue<Integer> order = new LinkedList<>();

			for (int i = 1; i < input.length; i++) {
				if (input[i] == 0) {
					order.add(i);
				}
			} // 진입차수가 0이면 큐에 넣음

			List<Integer> ans = new ArrayList<>(); // 정답 넣을 리스트배열

			while (!order.isEmpty()) {

				int poll = order.poll();

				ans.add(poll);

				for (int n = 0; n < connect[poll].size(); n++) {

					// 해당 노드에서 나가는 간선의 진입차수 -1
					--input[connect[poll].get(n)];

					// 새롭게 진입차수가 0이 된 노드 큐에 삽입
					if (input[connect[poll].get(n)] == 0) {
						order.add(connect[poll].get(n));
					}
				}
			} // 위상정렬

			// 출력
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc);

			for (int i = 0; i < ans.size(); i++) {
				sb.append(" ").append(ans.get(i));
			}

			System.out.println(sb.toString());

		} // tc

	}
}
