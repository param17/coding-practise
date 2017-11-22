//8. String to Integer (atoi) 
//https://leetcode.com/problems/string-to-integer-atoi/description/
//-------------Still Inprogress--------------------

class Solution {
    public int myAtoi(String str1) {
        long result=0,answer=0;
        int i=0,digit=0,isNeg=1,count=0;
        boolean isDec=false;
        
        String str = str1.trim();//.replace(",","");
        
        if(str.length()==0)
            return 0;
        
        if(str.length()==1){
            if(str.charAt(0)>47&&str.charAt(0)<58)
                return str.charAt(0)-48;
            else
                return 0;
        }
        
        if(str.charAt(0)==43){
            isNeg=1;
            i=1;
        }
        
        if(str.charAt(0)==45){
            isNeg=-1;
            i=1;
        }
        
        for(;i<str.length();i++){
            digit=(int)str.charAt(i);
            if(digit>47&&digit<58){
                result = result*10 + (digit-48);
                count++;
            }
            
            else if(digit==46&&!isDec){
                isDec=true;
                answer = result;                
            }
            else
                break;
        }
                
        //if((((str.charAt(0)==43)&&(count==str.length()-1))||((str.charAt(0)>47&&str.charAt(0)<58)&&(count==str.length()))) && (str.compareTo("2147483647")>0)){
        if(result*isNeg>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        
        //if((str.charAt(0)==45&&((str.charAt(1)>47&&str.charAt(1)<58)))&&(count==str.length()-1)&&str.compareTo("-2147483648")>0){
        if(result*isNeg<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        
        return (int)((answer==0&&!isDec)?result*isNeg:answer*isNeg);
    }
}
