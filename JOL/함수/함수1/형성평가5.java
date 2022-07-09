3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
  
  import java.util.Scanner;

public class Test {

	static int[] last = new int[4];
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String std1 = sc.nextLine();
		String std2 = sc.nextLine();
		String std3 = sc.nextLine();
	
		System.out.println(std1+func(std1));
		System.out.println(std2+func(std2));
		System.out.println(std3+" "+func(std3));
		
		last[3] = last[0]+last[1]+last[2];
		
		for(int i=0; i<4; i++) {
			System.out.print(last[i]+" ");
		}
	
		
	}
	
	static int func(String s1) {
		
		String[] score = s1.split(" ");
		
		int sum = 0;

		
		for(int i=0; i<3; i++) {
			sum+= Integer.valueOf(score[i]
					);
			last[i] += Integer.valueOf(score[i]); 
		}
		
		
		return sum;
		
	}
	
	
}
