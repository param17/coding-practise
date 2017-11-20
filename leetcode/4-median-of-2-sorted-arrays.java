//4. Median of Two Sorted Arrays 
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n,m;
        n = nums1.length;
        m = nums2.length;
        int size = n+m;
        int[] temp = new int[size];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                temp[k++]=nums1[i++];
            }
            else{
                temp[k++]=nums2[j++];
            }
        }
        while(i<n){
            temp[k++]=nums1[i++];
        }
        while(j<m){
            temp[k++]=nums2[j++];
        }
        
        double mid = 0;
        
        if(size%2==0){
            mid = (double)(temp[size/2]+temp[(size/2)-1])/2;
        }
        else{
            mid = temp[(size-1)/2];
        }
                        
        return mid;
    }
}
