‘@’문자를 10개 출력하는 함수를 작성 한 후 함수를 세 번 호출하여 아래와 같이 출력하는 프로그램을 작성하시오.
  
  public class Main {

	public static void main(String[] args) {
		
		
		String[] word = {"first", "second", "third"};
		
		for(int i=0; i<3; i++) {
			System.out.println(word[i]);
			func(i);
		}
		
		
	}
	
	static void func(int n) {
		
		if(n == 3)
			return;
		
		System.out.println("@@@@@@@@@@");
		
	}

}
