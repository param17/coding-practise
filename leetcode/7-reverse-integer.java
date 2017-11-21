//7. Reverse Integer 
//https://leetcode.com/problems/reverse-integer/description/

class Solution {
    public int reverse(int x) {
        int negative=0;
        long result=0;
        
        while(x!=0){
            result = result*10 + x%10;
            x /= 10;
            
            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
                return 0;
            }
        }

        return (int)result;
    }
}
