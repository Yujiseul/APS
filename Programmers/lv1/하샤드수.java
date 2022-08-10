class Solution {
    public boolean solution(int x) {
        
        String[] xx = Integer.toString(x).split("");
        int y = 0;
        for(int i=0; i<xx.length; i++){
            y += Integer.parseInt(xx[i]);
        }
        
       
        boolean answer = true;
        
        if(x%y != 0){
            answer = false;
        }
        return answer;
    }
}
