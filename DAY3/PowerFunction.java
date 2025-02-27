package DAY3;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x and n:");
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(x+"^"+n+" : "+myPow(x,n));
    }
    public static double myPow(int x,int n){
        int N=n;
        if(N<1){
            N*=-1;
        }
        double ans=1.0;
        while (N>0){
            if(N%2==0){
                x*=x;
                N/=2;
            }
            if(N%2==1){
                ans*=x;
                N--;
            }
        }
        return ans;
    }
}
