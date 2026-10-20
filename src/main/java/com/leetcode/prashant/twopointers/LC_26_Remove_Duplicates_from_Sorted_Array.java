package com.leetcode.prashant.twopointers;

/**
 * Problem Number : 26
 * Problem Name   : Remove Duplicates from Sorted Array
 * Difficulty     : Easy
 * Link           : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Approach:
 * Use two pointers to scan the sorted array and overwrite duplicate values
 * with the next unique value. The first returned-length elements contain the
 * unique values.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */
public class LC_26_Remove_Duplicates_from_Sorted_Array {
public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int length = removeDuplicates(nums);
    System.out.println("Length of array after removing duplicates: " + length);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < length; i++) {
        System.out.print(nums[i] + " ");
    }
}
private static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int start = 0;
    int end = 1;
    if (nums.length == 1){ return 1;}
while (end < nums.length) {
        if (nums[start] == nums[end]) {
            end++;
        } else {
            start++;
            nums[start] = nums[end];
        }
    }
    return start + 1;
}
}