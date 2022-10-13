class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zerocnt = 0;
        
        String t = "";
        
            while(!s.equals("1")){
                
                cnt++;
                
                // 0 없애기
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                zerocnt++;
            }else{
                t += "1";
            }
        }
                s = t;
                t = "";
                s = Integer.toString(s.length(), 2);
                
            }
        
        answer[0] = cnt;
        answer[1] = zerocnt;
        
        return answer;
    }
}
