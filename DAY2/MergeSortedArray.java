package DAY2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m:");
        int m=sc.nextInt();
        int[] nums1=new int[m*2];
        System.out.print("Enter array elements:");
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] nums2=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        merge(nums1,m,nums2,n);
        System.out.println("Merged:"+ Arrays.toString(nums1));
    }
    public static void merge(int[] nums1,int m,int [] nums2,int n){
        int ind=m+n-1;
        int i=m-1,j=n-1;
        while (j>=0){
            if(i>=0 && nums1[i]>=nums2[j]){
                nums1[ind--]=nums1[i--];
            }else{
                nums1[ind--]=nums2[j--];
            }
        }
    }
}
