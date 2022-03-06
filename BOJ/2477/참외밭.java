import java.util.Scanner;

public class bj_2477_참외밭 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 곱해줄 참외 개수
		int Cham = sc.nextInt();

		// 육각형 길이 넣을 배열생성
		int[] field = new int[6];

		// 육각형 정보 입력받음
		for (int i = 0; i < 6; i++) {

			// 방향 고려하지 않을 것
			int direc = sc.nextInt();

			// 길이 값
			field[i] = sc.nextInt();
		}

		// 배열 중에서 제일 긴 값과 인덱스 찾기

		// 제일 긴 값1
		int maxH = 0;

		// 인덱스
		int idxH = 0;

		// 값 및 인덱스 구하기
		for (int i = 0; i < 6; i += 2) {

			if (field[i] > maxH) {
				maxH = field[i];
				idxH = i;
			}
		}

		// 제일 긴 값2 (단, 값1과 다른 방향)
		int maxV = 0;
		int idxV = 0;

		for (int i = 1; i < 6; i += 2) {

			if (field[i] > maxV) {
				maxV = field[i];
				idxV = i;
			}
		}

		// 큰 직사각형 넓이
		int big = maxH * maxV;

		// 작은 직사각형 넓이구하기

		int sub = 0;

		if ((idxH + 1) % 6 == idxV) {
			sub = field[(idxH + 3) % 6] * field[(idxH + 4) % 6];
		} else {
			sub = field[(idxH + 2) % 6] * field[(idxH + 3) % 6];
		}

		// 계산 ( 큰 직사각형 넓이 - 작은 직사각형 넓이 )

		int result = big - sub;

		// 넓이에다 자라나는 참외 수(Cham)를 곱해준 것이 최종 정답

		int ans = result * Cham;

		// 출력

		System.out.println(ans);

	}

}
