package com.bigdreams.leetcode.strings;

import java.util.HashMap;

public class LC_242_Valid_Anagram {
    public static void main(String[] args) {
        String s = "test";
        String t ="sett";
        boolean result =  isAnagram(s,t);
        System.out.println(result);
    }
    public static boolean isAnagram(String s, String t) {
        char[] original=s.toCharArray();
        char[] target=t.toCharArray();
        HashMap charCount = getCharCount(target);
        HashMap charCountOriginal = getCharCount(original);
        if(charCount.equals(charCountOriginal)){
            return true;
        }
        return false;
    }

    private static HashMap getCharCount(char[] target) {
        HashMap<Character,Integer>charCount= new HashMap<>();
        for (char c:target) {
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }
        return charCount;
    }
    public boolean isAnagramOptimalSolution(String s, String t) {
        // Base case: if the two strings are empty...
        if(s == null || t == null) return false;
        // In case of different length of those two string...
        if(s.length() != t.length()) return false;
        // To count freq we make an array of size 26...
        int[] counter = new int[26];
        // Traverse all elements through a loop...
        for(int idx = 0; idx < s.length(); idx++){
            counter[s.charAt(idx)-'a']++;
            counter[t.charAt(idx)-'a']--;
        }
        // Above iteration provides us with count array having all values to zero then we can say we found an anagram.
        // Every element of count has to be equal to 0.
        // If it is greater than 0 it means s has a character whose occurrence is greater than its occurrence in t.
        // And if its less than 0 then, s has a character whose occurrence is smaller than its occurrence in t.
        for(int idx: counter){
            if(idx != 0)
                return false;
        }
        return true;
    }

}
