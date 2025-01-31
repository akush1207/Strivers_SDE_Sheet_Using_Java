package DAY1;

import java.util.Scanner;
public class BuyAndSellStock{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of days:");
        int len=sc.nextInt();
        int[] prices=new int[len];
        System.out.print("Enter price of each day:");
        for (int i = 0; i < len; i++) {
            prices[i]=sc.nextInt();
        }
        System.out.println("Max Profit:"+maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minPrice=0,maxProfit=Integer.MIN_VALUE;
        for(int price:prices){
            minPrice=Math.min(minPrice,price);
            maxProfit=Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;
    }
}
