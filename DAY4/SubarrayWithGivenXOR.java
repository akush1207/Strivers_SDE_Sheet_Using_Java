package DAY4;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        System.out.println("Total Subarray:"+totalSubarray(nums,target));
    }
    public static int totalSubarray(int[] nums,int target){
        HashMap<Integer,Integer> prefixXor=new HashMap<>();
        prefixXor.put(target,1);
        int total=0,curr=0;
        for(int num:nums){
            curr^=num;
            int x = curr ^ target;
            if (prefixXor.containsKey(x)) {
                total += prefixXor.get(x);
            }
            if(prefixXor.containsKey(curr)){
                prefixXor.put(curr,prefixXor.get(curr)+1);
            }else {
                prefixXor.put(curr,1);
            }
        }
        return total;
    }
}
