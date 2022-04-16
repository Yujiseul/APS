import java.util.Scanner;

public class 모의_핀볼게임 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int[][] pinball = new int[N + 2][N + 2];

			int[][] wormhole = new int[5][4];

			int bhx = 0;
			int bhy = 0;

			int cnt = 0;
			int ans = 0;

			for (int i = 0; i < N + 2; i++) {
				for (int j = 0; j < N + 2; j++) {
					
					if (i == 0 || i == N + 1 || j == 0 || j == N + 1) {
						pinball[i][j] = 5;
						continue;
					}

					pinball[i][j] = sc.nextInt();

					if (pinball[i][j] >= 6) {
						int pidx = pinball[i][j] - 6;

						if (wormhole[pidx][0] == 0) {
							wormhole[pidx][0] = i;
							wormhole[pidx][1] = j;

						} else {
							wormhole[pidx][2] = i;
							wormhole[pidx][3] = j;
						}
					}
				}
			} // 2차원 핀볼, 웜홀배열, 블랙홀 좌표 저장

			for (int i = 0; i < N + 2; i++) {
				for (int j = 0; j < N + 2; j++) {

					if (pinball[i][j] != 0)
						continue;

					int r = i;
					int c = j;

					int[] dr = { -1, 1, 0, 0 }; // 상하좌우
					int[] dc = { 0, 0, -1, 1 }; // 상하좌우

					for (int d = 0; d < 4; d++) {
						cnt = 0;
						int k = d;


						int nr = r;
						int nc = c;
						
						while (true) {

							nr += dr[k];
							nc += dc[k];
							
							if (pinball[nr][nc] == -1 || (nr == r && nc == c))
								break;

							switch (pinball[nr][nc]) {
							case 0:
								break;

							case 6:
							case 7:
							case 8:
							case 9:
							case 10:
								int widx = pinball[nr][nc] - 6;

								if (wormhole[widx][0] == nr && wormhole[widx][1] == nc) {
									nr = wormhole[widx][2];
									nc = wormhole[widx][3];
								} else {
									nr = wormhole[widx][0];
									nc = wormhole[widx][1];
								}
								break;

							case 5:
								if (k == 0) { // 상
									k = 1;
								} else if (k == 1) { // 하

									k = 0;

								} else if (k == 2) { // 좌

									k = 3;

								} else { // 우
									k = 2;
								}

								cnt++;
								break;

							case 1:
								if (k == 0) { // 상
									k = 1;
								} else if (k == 1) {  // 하
									k = 3;
								} else if (k == 2) {  // 좌

									k = 0;
								} else {  //우
									k = 2;
								}

								cnt++;
								break;
							case 2:
								if (k == 0) {
									k = 3;
								} else if (k == 1) {
									k = 0;
								} else if (k == 2) {

									k = 1;
								} else {
									k = 2;
								}
								cnt++;
								break;
							case 3:
								if (k == 0) {
									k = 2;
								} else if (k == 1) {
									k = 0;
								} else if (k == 2) {

									k = 3;
								} else {
									k = 1;
								}
								cnt++;
								break;
							case 4:
								if (k == 0) {
									k = 1;
								} else if (k == 1) {
									k = 2;
								} else if (k == 2) {

									k = 3;
								} else {
									k = 0;
								}
								cnt++;
								break;
							}
							
						} // while

						if (ans < cnt) {
							ans = cnt;
						}

					}
				}
			}

			System.out.println("#" + tc + " " + ans);

		} // tc

	}// main
}
