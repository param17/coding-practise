// 1. Two Sum
//https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
                        
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }
            
            map.put(nums[i],i);
        }
        int temp=0;
        if(result[0]>result[1]){
            temp=result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        
        return result;
    }
}
