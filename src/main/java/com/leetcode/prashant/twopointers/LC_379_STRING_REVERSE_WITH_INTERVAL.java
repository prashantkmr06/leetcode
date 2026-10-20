package com.leetcode.prashant.twopointers;

public class LC_379_STRING_REVERSE_WITH_INTERVAL {
    //K interval reverse of string using two pointer approach
    //we will jump 2k after reversing the first k characters of string
public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        //jumps twice of 2k after reversing 
        for(int i=0;i<arr.length;i=i+2*k){
            int start=i;
            //out of bound guard end will be lower than arraylength
            int end=Math.min(start+k-1,arr.length-1);
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
        return String.valueOf(arr);
 }
}
