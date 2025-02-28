package DAY4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum:");
        int target=sc.nextInt();
        System.out.println("Two Sum:"+ Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums,int target){
        int[] ans=new int[2];
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(prefixSum.containsKey(target-nums[i])){
                ans[0]=prefixSum.get(target-nums[i]);
                ans[1]=i;
                break;
            }else{
                prefixSum.put(nums[i],i);
            }
        }
        return ans;
    }
}
