
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			int num = sc.nextInt();

			String[] word = sc.next().split("");

			for (int i = 0; i < word.length; i++) {

				for (int j = 0; j < num; j++) {

					System.out.print(word[i]);

				}
			}
			System.out.println();
		}

	}

}
