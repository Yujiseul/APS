class Solution {
    boolean solution(String s) {
        int cnt = 0;
        boolean flag = false;
        
        s = s.toUpperCase();

        
        boolean answer = true;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'P'){
                cnt++;

                flag = true;
            }else if(s.charAt(i) == 'Y'){
                cnt--;

                flag = true;
            }
        }

        if(cnt != 0){
            answer = false;
        }
        
        return answer;
    }
}
