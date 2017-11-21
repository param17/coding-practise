//5. Longest Palindromic Substring 
//https://leetcode.com/problems/longest-palindromic-substring/description/

class Solution {
    int start,len;
    
    public String longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        if(s.length()<2){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            isPalindrome(s,i,i+1);
            isPalindrome(s,i,i);
        }
        
        return s.substring(start,start+len);
    }
    
    public void isPalindrome(String s, int l, int r){
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            r++;
            l--;
        }
        
        if(len<r-l-1){
            len = r-l-1;
            start = l+1;
        }
    }
}
