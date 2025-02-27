package DAY3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElementII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Majority Element:"+majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums){
        int count1=0,count2=0,el1=0,el2=0;
        for(int num:nums){
            if(count1==0){
                count1=1;
                el1=num;
            }else if(count2==0){
                count2=1;
                el2=num;
            }else if(num==el1){
                count1++;
            }else if(num==el2){
                count2++;
            }
        }
        count1=count2=0;
        for(int num:nums){
            if(num==el1){
                count1++;
            }else if(num==el2){
                count2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(count1>nums.length/3){
            ans.add(el1);
        }
        if(count2>nums.length/3){
            ans.add(el2);
        }
        return ans;
    }
}
