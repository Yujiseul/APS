import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] num = Integer.toString(n).toCharArray();
        for(char x : num){
answer += x-'0';
}
        return answer;
    }
}
