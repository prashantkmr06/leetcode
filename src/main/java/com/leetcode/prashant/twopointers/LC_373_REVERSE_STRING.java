package com.leetcode.prashant.twopointers;

public class LC_373_REVERSE_STRING {
//Two pointer opposite direction approach to reverse the string in place    
 public void reverseString(char[] s) {
        int start=0;
        int end =s.length-1;
        while(start<=end){
           char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}
