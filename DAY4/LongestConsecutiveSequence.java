package DAY4;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Longest Consecutive:"+longestConsecutiveBrute(nums));
    }
    public static int longestConsecutiveBrute(int[] nums){
        Arrays.sort(nums);
        int maxCons=0,curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) {
                continue;
            }else if(nums[i]==nums[i-1]+1){
                curr++;
            }else{
                maxCons=Math.max(maxCons,curr);
                curr=1;
            }
        }
        maxCons=Math.max(maxCons,curr);
        return maxCons;
    }

}
