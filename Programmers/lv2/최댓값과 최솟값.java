import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("\\s");
        int[] num = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        answer += num[0]+" "+num[num.length-1];
        return answer;
    }
}
