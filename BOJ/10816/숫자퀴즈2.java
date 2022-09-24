//getOrDeafult 사용
package aps;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // 전체 수 개수
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<M; i++) {
			map.put(sc.nextInt(), map.getOrDefault(sc.nextInt(), 1)+1);
		}
		
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			sb.append(map.get(sc.nextInt())).append(" ");
		}
		
		System.out.println(sb.toString());
		
		
	}

}
