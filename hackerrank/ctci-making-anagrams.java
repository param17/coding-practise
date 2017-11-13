//Strings: Making Anagrams
//https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    private static int MAX = 256;
    
    public static int count(int a[],int b[]){
        int count=0;
        for(int i=0;i<MAX;i++){
            if(a[i]!=b[i]){
                count += (b[i]-a[i])>0?(b[i]-a[i]):(a[i]-b[i]);
            }
        }
        return count;
    }
    
    public static int numberNeeded(String first, String second) {
        int fcount[] = new int[MAX];
        int scount[] = new int[MAX];
        int flen = first.length();
        int slen = second.length();
        for(int i=0;i<flen;i++)
            fcount[first.charAt(i)]++;
        for(int i=0;i<slen;i++)
            scount[second.charAt(i)]++;

        return count(fcount,scount);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
