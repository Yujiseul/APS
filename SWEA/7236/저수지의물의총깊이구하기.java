package d3;

import java.util.Scanner;

public class d3_7236_저수지의물의총깊이구하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			// 저수지 크기
			int N = sc.nextInt();

			// 저수지 배열만들고 입력받기

			char[][] dam = new char[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					dam[i][j] = sc.next().charAt(0);
				}
			}

			// 강의 max 깊이
			int depthmax = 0;
			int depth;

			// W인 값의 인덱스를 찾고 델타를 이용해 탐색

			// 델타(상, 우상, 우, 우하, 하, 좌하, 좌, 좌상)
			int[] dr = { -1, -1, 0, +1, +1, +1, 0, -1 };
			int[] dc = { 0, +1, +1, +1, 0, -1, -1, -1 };

			for (int i = 0; i < N; i++) {

				for (int j = 0; j < N; j++) {

					// G 개수
					int Gcnt = 0;

					// 가장자리에 있는 W를 제외시켜줘야함
					if (dam[i][j] == 'W' && i > 0 && j > 0 && i != (N - 1) && j != (N - 1)) {

						// 8방 탐색
						for (int k = 0; k < 8; k++) {

							int nr = i + dr[k];
							int nc = j + dc[k];

							if (nr >= 0 && nr < N && nc >= 0 && nc < N && dam[nr][nc] == 'G') {
								Gcnt++;
							}
						}

						// 예외(다 G일때)
						if (Gcnt == 8) {
							depth = 1;

							// 예외 아닐때
						} else {
							depth = 8 - Gcnt;
						}

						// 최대깊이 구하기
						if (depthmax < depth) {
							depthmax = depth;
						}

					} // if end

				} // for (j) end

			} // for(i) end

			// 출력
			System.out.println("#" + tc + " " + depthmax);

		} // testcase end
	}

}
