import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_2164_카드2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 입력받기
		int N = sc.nextInt();

		// 큐 생성
		Queue<Integer> card = new LinkedList<>();

		// 1부토 N까지 큐에 넣어줌
		for (int i = 1; i <= N; i++) {

			card.add(i);
		}

		// 한 장이 남을때 까지 맨 위의 카드는 버리고, 그 다음 카드는 뽑아서 넣음
		while (card.size() != 1) {

			card.poll();
			card.add(card.poll());
		}

		// 남아있는 카드 출력
		System.out.println(card.element());
	}

}
