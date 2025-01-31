package DAY1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int numRows=sc.nextInt();
        System.out.println("Pascals Triangle:"+generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }else{
                    ans.get(i).add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
        }
        return ans;
    }
}
