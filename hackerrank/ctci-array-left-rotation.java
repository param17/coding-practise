//Arrays: Left Rotation
//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void leftShift(int a[],int n, int d){
        int temp = 0;
        int index = 0;
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            index = ((i-d)<0)?(i-d)+n:i-d;
            b[index] = a[i];
        }
        for(int item:b)
            System.out.print(item+" ");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        leftShift(a,n,k);
    }
}
