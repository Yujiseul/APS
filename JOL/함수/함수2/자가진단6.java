main() 함수 내에는 숫자를 사용하지 말고 즉, #define 을 이용하여 1, 2, 3 세 개의 숫자를 조합하여 가능한 한 모든 합을 출력하는 프로그램을 작성하시오.

출력예와 같이 출력하시오.





public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		func(arr);

	}
	
	static void func(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%d + %d = %d\n",arr[i],arr[j],arr[i]+arr[j]);
			}
		}
	
	}
	
	

}
