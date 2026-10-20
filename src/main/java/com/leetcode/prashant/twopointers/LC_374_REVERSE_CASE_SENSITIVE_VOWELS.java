package com.leetcode.prashant.twopointers;

public class LC_374_REVERSE_CASE_SENSITIVE_VOWELS {

    public String reverseVowels(String s) {
        int start=0;
        char[] arr=s.toCharArray();
        int end=arr.length-1;
        while(start<=end){
            if(!isVowel(arr[start])){
                start++;
                continue;
            }

            if(!isVowel(arr[end])){
                end--;
                continue;
            }
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
return String.valueOf(arr);
       
    }
    private boolean isVowel(char c){
        switch(c){
            case 'a': case 'A': 
            case 'e': case 'E':
            case 'i': case 'I': 
            case 'O': case 'o': 
            case 'U': case 'u':
            return true;
            default :
            return false;
        }

    }
     //private boolean isVowel(char val){
    //     return "aeiouAEIOU".indexOf(val)!=-1;
    //}
}
