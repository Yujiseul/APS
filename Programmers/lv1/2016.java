class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] day = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        
        String[] week = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int date = 0;
        
        for(int i=0; i<a; i++){
            date += day[i];
        }
        
        date += b-1;
        
        int plus = date%7;
        
        answer = week[(5+plus)%7];
        
        return answer;
    }
}
