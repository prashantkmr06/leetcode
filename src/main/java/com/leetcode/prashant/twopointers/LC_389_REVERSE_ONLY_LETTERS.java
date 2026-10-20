package com.leetcode.prashant.twopointers;

public class LC_389_REVERSE_ONLY_LETTERS {
    //Two pointer opposite direction approach to reverse the string in place
    //We will skip the non-letter characters and only reverse the letters in the string
    //We will use Character.isLetter() method to check if a character is a letter or not    
public String reverseOnlyLetters(String s) {
        int start=0;
        char[] arr=s.toCharArray();
        int end=arr.length-1;
        while (start<=end){
            if(!Character.isLetter(arr[start])){
                start++;continue;
            }
            if(!Character.isLetter(arr[end])){
                end--;continue;
            }
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
}
