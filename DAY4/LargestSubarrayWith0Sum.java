package DAY4;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Longest Subarray:"+longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums){
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        int currSum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum==0){
                maxLength=i+1;
            }
            if(prefixSum.containsKey(currSum)){
                maxLength=Math.max(maxLength,i-prefixSum.get(currSum));
            }else{
                prefixSum.put(currSum,i);
            }
        }
        return maxLength;
    }
}
