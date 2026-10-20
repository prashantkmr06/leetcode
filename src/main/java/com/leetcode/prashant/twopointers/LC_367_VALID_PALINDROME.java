package com.leetcode.prashant.twopointers;

public class LC_367_VALID_PALINDROME {
    //Instead of introducing charArray, we used Character class method on string
    //isLetterOrDigit to skip special character
    //.toLowercase comparison for case insensitive equality check
    //in case of special character we shift start or downshift end pointerac
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
            start++;
            continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(end))){
            end--;
            continue;
            }
        //short circuit
        if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
            return false;
        }
        start++;
        end--;
        }
        return true;
    }
}
