package org.example.hackerrank;

import java.util.Objects;

public class PalindromeByFilteringNonLetters {
    public static void main(String[] args){
        System.out.println(isAlphabeticPalindrome("A1b2B!a"));
        System.out.println(isAlphabeticPalindrome("aA1b2B!aa"));
        System.out.println(isAlphabeticPalindrome("aA1bbB!aa"));
        System.out.println(isAlphabeticPalindrome("aA1bbB!a"));
        System.out.println(isAlphabeticPalindrome("12345"));
        System.out.println(isAlphabeticPalindrome("12@12Zz"));
    }

    public static boolean isAlphabeticPalindrome(String code) {
        if (Objects.isNull(code)) {
            return false;
        }
        String upperCaseCode = code.toUpperCase();
        String alphabets = upperCaseCode.replaceAll("[^A-Z]", "");
        String reverse = new StringBuffer(alphabets).reverse().toString();
        return alphabets.equals(reverse);
    }
}
