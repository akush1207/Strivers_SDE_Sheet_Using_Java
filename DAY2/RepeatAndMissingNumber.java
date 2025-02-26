package DAY2;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Repeating And Missing Number:"+ Arrays.toString(repeatAndMissing(nums)));
    }
    public static int[] repeatAndMissing(int[] nums){
        long n = nums.length; // size of the array
        // Find Sn and S2n:
        long ActualSumUptoN = (n * (n + 1)) / 2;
        long ActualSumOfSquaresUptoN = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long Sum = 0, SumOfSquares = 0;
        for (int num : nums) {
            Sum += num;
            SumOfSquares += (long) num * (long) num;
        }

        //S-Sn = X-Y:
        long val1 = Sum - ActualSumUptoN;

        // S2-S2n = X^2-Y^2:
        long val2 = SumOfSquares - ActualSumOfSquaresUptoN;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int)x, (int)y};
    }
}
