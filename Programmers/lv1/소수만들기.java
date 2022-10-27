import java.util.*;

class Solution {
    
    static int S;
    static int N = 3;
    static int[] comb = new int[3];
    static int[] ori;
    static List<Integer> check;
    public int solution(int[] nums) {
        int answer = 0;
        ori = nums;
        check = new LinkedList<>();
       //  System.out.println(Arrays.toString(ori));
        Arrays.sort(nums);
        S = nums.length;
        int max = 0;
        for(int i=nums.length-1; i>nums.length-4; i--){
            max += nums[i];
        }
        
        boolean[] arr = new boolean[max+1];
        arr[1] = true;
        for(int i=2; i<arr.length-1; i++){
            for(int j = i*2; j<arr.length; j++){
                if(arr[j]){
                    continue;
                }
                
                if(j%i == 0){
                    arr[j] = true;
                }
            }
        }
       combi(0, 0);
        
        for(int x: check){
            if(arr[x]){
                continue;
            }
            answer++;
        }

        return answer;
    }
    
    static void combi(int idx, int sidx){
        if(sidx == N){
            int sum = 0;
            
            for(int x : comb){
                sum += x;
            }
            check.add(sum);
            return;
        }else if(idx == S){
          return;
        }
        
        comb[sidx] = ori[idx];
        
        combi(idx+1, sidx+1);
        combi(idx+1, sidx);
    }
}
