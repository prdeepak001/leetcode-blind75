package com.bigdreams.leetcode.strings;

public class LC_125_ValidPalindrome {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(" Is Palindrome " + isPalindrome);
    }
    public  static boolean isPalindrome(String s){
        s= s.replaceAll("[^a-zA-Z0-9]","");
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
        if(reverse.equalsIgnoreCase(s)){
            return true;
        }
        return  false;
    }

    public boolean isPalindromeTwoPointer(String s) {
        int x = 0;
        int y = s.length()-1;
        while (x<y){
            Character head = s.charAt(x);
            Character tail = s.charAt(y);
            if (!Character.isLetterOrDigit(head)){
                x++;
                continue;
            }
            if (!Character.isLetterOrDigit(tail)){
                y--;
                continue;
            }
            if (Character.toLowerCase(head) != Character.toLowerCase(tail)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}
