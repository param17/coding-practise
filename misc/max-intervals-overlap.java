//Maximum intervals overlap
//http://practice.geeksforgeeks.org/problems/maximum-intervals-overlap/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void maxOverlap(int n, int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i=0;i<n;i++){
        count = 0;
            for(int j=0;j<n;j++){
                if(a[i]>=a[j]&&a[i]<=b[j]){
                    count++;
                }   
            }
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+count);
            }
            else{
                map.put(a[i],count);
            }
        }
        
        Map.Entry<Integer, Integer> max = null;
        
        //Removing duplicates
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            count = 0;
            for(int i=0;i<n;i++){
                if(a[i]==entry.getKey())
                    count++;
            }
            
            if(max == null || (entry.getValue()/count)>max.getValue()){
                max = entry;
                max.setValue(entry.getValue()/count);
            }
            
        }

        System.out.println(max.getValue()+" "+max.getKey());
    }
    
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=0;i<t;i++){
		    int n = in.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int j=0;j<n;j++){
		        a[j] = in.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        b[j] = in.nextInt();
		    }
		    
		    maxOverlap(n,a,b);
		}
	}
}
