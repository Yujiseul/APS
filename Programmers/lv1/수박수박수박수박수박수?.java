class Solution {
    public String solution(int n) {
        String answer = "";
        
        String[] arr = new String[2];
        arr[1] = "박";
        arr[0] = "수";
        
        for(int i=0; i<n; i++) {
            answer+=arr[i%2];
        }
        return answer;
    }
}
