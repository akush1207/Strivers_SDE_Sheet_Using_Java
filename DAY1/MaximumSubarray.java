package DAY1;

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Maximum Sum:"+kadaneAlgorithm(nums));
    }
    public static int kadaneAlgorithm(int[] nums){
        int maxSum=Integer.MIN_VALUE,currSum=0;
        for(int num:nums){
            if(currSum<0){
                currSum=0;
            }
            currSum+=num;
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
