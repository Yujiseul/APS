import java.util.Scanner;

public class 모의_수영장 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();  // 테스트케이스 수

		for (int tc = 1; tc <= T; tc++) {

			int day = sc.nextInt();    // 1일 요금
			int month = sc.nextInt();  // 1달 요금
			int three = sc.nextInt();  // 3달 요금
			int year = sc.nextInt();   // 1년 요금

			int tcnt = 0;  // 세달치 요금 몇번 사용했는지 저장할 변수

			int[] pool = new int[12];  // 수영장 이용하는 횟수 저장하는 배열

			int[] pay = new int[12];  // 이용 요금 저장하는 배열. 1일권과 한달권을 비교해 더 작은 값을 넣음

			for (int i = 0; i < 12; i++) {

				pool[i] = sc.nextInt();

				pay[i] = Math.min(pool[i] * day, month); // 1일권과 한달권을 비교해 더 작은 값을 넣음
			}

			while (true) {
				
				int[] comp = new int[12]; // 3달씩(11, 12월달은 각각 2달, 1달) 요금을 더해준 값을 넣을 배열
				int max = 0;
				int idx = 0;
				boolean flag = true;
				
				for (int i = 0; i < 12; i++) {

					if (i == 10) { // 11월일 때

						comp[i] = pay[i] + pay[i + 1];  // 11월+12월
						
					} else if (i == 11) { // 12월일 때
						
						comp[i] = pay[i];  // 12월만
					} else {

						comp[i] = pay[i] + pay[i + 1] + pay[i + 2]; // 3달치 더해줌
					}

					if (max < comp[i]) {  // 가장 요금이 많이 드는 달을 찾음
						max = comp[i];
						idx = i;
					}
				}

				if (max > three) { // 그 값이 3달치 요금보다 클 때
					
					if (idx == 10) {  // 11월이면 11월과 12월 요금을 0으로 해놓음

						pay[idx] = pay[idx + 1] = 0;
					
					} else if (idx == 11) {  // 12월이면 12월 요금을 0으로 해놓음
						
						pay[idx] = 0;
						
					} else {  // 더해준 3달치를 0으로 해놓음

						pay[idx] = pay[idx + 1] = pay[idx + 2] = 0;
					}
					
					tcnt++;  // 세달치요금 사용횟수
					flag = false;
				}

				if (flag) {  // 합들이 다 세달치 요금보다 작으면 멈추기
					break;
				}
			}

			int ans = tcnt * three;  // 세달치 요금
			for (int i = 0; i < 12; i++) {

				ans += pay[i];  // 남아있는 요금
			}

			ans = Math.min(ans, three*4);
			ans = Math.min(ans, year);  // 마지막으로 1년치요금과 비교해서 더 작은 요금이 답

			System.out.println("#"+tc+" "+ans);
			
		} // tc

	}

}
