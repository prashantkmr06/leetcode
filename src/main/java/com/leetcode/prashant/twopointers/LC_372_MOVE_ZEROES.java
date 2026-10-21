package com.leetcode.prashant.twopointers;

public class LC_372_MOVE_ZEROES {
    //There is only shifting no expanding so we will move from left to right.
    //Copying all non zeroes to the first and then filling all zeroes at last.
    public void moveZeroes2Pass(int[] nums) {
        int reader=0;
        int writer=0;
        //writer filling non zeroes values
        while(nums.length>0 && reader<=nums.length-1){
            if(nums[reader]!=0){
                nums[writer]=nums[reader];
                writer++;
            }
            reader++;
        }
        //writer filling zero in remaining slots
        while(writer<=nums.length-1){
            nums[writer]=0;
            writer++;
        }
}

public void moveZeroesSinglePass(int[] nums) {
        int reader=0;
        int writer=0;
        while(reader<=nums.length-1){
            if(nums[reader]!=0){
                int temp=nums[writer];
                nums[writer]=nums[reader];
                nums[reader]=temp;
                writer++;
            }
            reader++;
        }
}

}
