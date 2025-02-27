package DAY3;

import java.util.Scanner;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and column of the matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.print("Enter matrix elements:");
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the target element:");
        int target=sc.nextInt();
        System.out.println("Is "+target+" present in the matrix ? "+search(matrix,target));
    }
    public static boolean search(int[][] matrix,int target){
        int m=matrix[0].length;
        int low=0,high=matrix.length*m-1;
        while (low<=high){
            int mid=(low+high)/2;
            int row=mid/m, col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}
