package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Majority Element:"+majorityElementBrute(nums));
        System.out.println("Majority Element:"+majorityElementOptimized(nums));
    }
    public static int majorityElementBrute(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static int majorityElementOptimized(int[] nums){
        int count=0,ans=0;
        for(int num:nums){
            if(count==0){
                count=1;
                ans=num;
            }else if(num==ans){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num:nums){
            if(num==ans){
                count++;
            }
        }
        if(count>nums.length/2){
            return ans;
        }
        return -1;
    }
}
