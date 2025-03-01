package DAY4;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Longest Substring:"+longestSubstring(s));
    }
    public static int longestSubstring(String s){
        HashSet<Character> set=new HashSet<>();
        int i=0,j=0;
        int maxLength=0;
        while (j<s.length()){
            char currChar=s.charAt(j);
            while (set.contains(currChar)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(currChar);
            maxLength=Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}
