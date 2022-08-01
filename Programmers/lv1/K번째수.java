import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
 int[] answer = new int[commands.length];       
        
        for(int i=0; i<commands.length; i++){
int f = commands[i][0]-1;
int s = commands[i][1]-1;
int k = commands[i][2]-1;
 
 
        
int[] arr = new int[s-f+1];
int idx =0;
for(int j=f; j<=s; j++){

arr[idx++]=array[j]; 
}
Arrays.sort(arr);
answer[i]= arr[k];
            

}
        
        return answer;
    }
}
