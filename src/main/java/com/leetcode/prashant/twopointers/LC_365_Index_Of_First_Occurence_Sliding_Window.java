package com.leetcode.prashant.twopointers;

public class LC_365_Index_Of_First_Occurence_Sliding_Window {

    public int strStr(String haystack, String needle) {
        //find the length of driver needle
        //create a fixed sliding window and slide it over haystack 
        //once matched return the first index of haystack not needle
        int needleLength=needle.length();
        int hayStackLength=haystack.length();
        if(needleLength>hayStackLength){
            return -1;
        }
        for(int i=0;i<=hayStackLength-needleLength;i++){
            int j=0;
            for(;j<needleLength;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                break;
                }
            }
            //IF J==needleLength then we have found the first occurence of needle in haystack
            if(j==needleLength){
                return i;
            }
        }
        return -1;
    }
}
