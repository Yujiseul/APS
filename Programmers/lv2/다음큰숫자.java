class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n, 2);
        int ncnt = 0;
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i)== '0'){
                continue;
            }
            ncnt++;
        }
        
        int find = n;
        
        while(true){
            ++find;
            
            String check = Integer.toString(find, 2);
            int chcnt = 0;
            for(int i=0; i<check.length(); i++){
                if(check.charAt(i)=='1'){
                    chcnt++;
                }
            }
            
            if(chcnt == ncnt){
                answer = find;
                break;
            }
        }
        
        return answer;
    }
}
