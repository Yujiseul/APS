2016년의 날짜를 두 개의 정수 월 일로 입력받아서 입력된 날짜가 존재하면 "OK!" 그렇지 않으면 "BAD!"라고 출력하는 프로그램을 작성하시오.
  
  
  import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();

		int day = sc.nextInt();

		String answer = func(month, day);

		System.out.println(answer);

	}

	static String func(int month, int day) {

		boolean flag = false;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day >= 1 && day <= 31) {
				flag = true;
			}
		} else if (month == 2) {
			if (day >= 1 && day <= 29) {
				flag = true;
			}
		} else {
			if (day >= 1 && day <= 30) {
				flag = true;
			}
		}
		
		if(month<1 || month >12) {
			flag = false;
		}

		if (flag) {

			return "OK!";
		}

		return "BAD!";
	}

}
