package com.leetcode.prashant.twopointers;

public class LC_27_REMOVE_ELEMENT {
    public int removeElement(int[] nums, int val) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            //keep decreasing end pointer whenever we have matching val
            if(nums[end]==val){
                end--;
                continue;
            }
            if(nums[start]==val){
                nums[start]=nums[end];
                end--;//decrement end pointer to ensure again same val not copied at start pointer
            }
            start++;
        }
        return start;
}

}