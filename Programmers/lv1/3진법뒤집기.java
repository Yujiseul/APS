class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);
        String reverse = "";
        
        for(int i=three.length()-1; i>=0; i--){
            reverse += String.valueOf(three.charAt(i));
        }
        int a = Integer.parseInt(reverse, 3);
        answer = a;
        return answer;
    }
}
