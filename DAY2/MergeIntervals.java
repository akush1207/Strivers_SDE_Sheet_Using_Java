package DAY2;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of intervals:");
        int len=sc.nextInt();
        int[][] nums=new int[len][2];
        System.out.print("Enter the intervals:");
        for(int i=0;i<len;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
        System.out.println("Merged Intervals:"+ Arrays.deepToString(merge(nums)));
    }
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> {
            if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        List<List<Integer>> temp=new ArrayList<>();
        for(int[] interval:intervals){
            if(temp.isEmpty() || interval[0]>temp.get(temp.size()-1).get(1)){
                temp.add(Arrays.asList(interval[0],interval[1]));
            }else{
                temp.get(temp.size()-1).set(1,Math.max(interval[1],temp.get(temp.size()-1).get(1)));
            }
        }
        int[][] merged=new int[temp.size()][2];
        for(int i=0;i<temp.size();i++){
            merged[i][0]=temp.get(i).get(0);
            merged[i][1]=temp.get(i).get(1);
        }
        return merged;
    }
}
