import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        
    public static void uniqueBruteForce(String text){
        
        for(int i=0;i<text.length();i++){
            for(int j=i+1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    System.out.println("Not Unique");
                    return;
                }
            }
        }
        System.out.println("Unique");
        
    }
    
    public static void uniqueArray(String text){
        int array[] = new int[128];
        for(int i=0;i<text.length();i++){
            if(array[text.charAt(i)]>0){
                System.out.println("Not Unique");
                return;
            }
            else
                array[text.charAt(i)]=1;              
        }

        System.out.println("Unique");        
    }
    
    public static void uniqueHashMap(String text){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0;i<text.length();i++){
            if(map.containsKey(text.charAt(i))){
                System.out.println("Not Unique");
                return;
            }
            else{
                map.put(text.charAt(i),1);
            }
        }

        System.out.println("Unique");
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        
        //uniqueHashMap(text);
        uniqueArray(text);
        //uniqueBruteForce(text);
    }
}
