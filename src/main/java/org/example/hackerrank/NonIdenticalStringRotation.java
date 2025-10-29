package org.example.hackerrank;

import java.util.Objects;

public class NonIdenticalStringRotation {
    public static void main(String[] args) {
        System.out.println(isNonTrivialRotation("abcde", "cdeab"));
        System.out.println(isNonTrivialRotation("a", "a"));
        System.out.println(isNonTrivialRotation("b", "a"));
        System.out.println(isNonTrivialRotation("ab", "ab"));
        System.out.println(isNonTrivialRotation("ab", "ba"));

    }

    public static boolean isNonTrivialRotation(String s1, String s2) {
        if (Objects.isNull(s1) || Objects.isNull(s2) || s1.equals(s2) || s1.length() != s2.length()) {
            return false;
        }
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int l1 = sb1.length();
        for(int i = 1; i < l1; i++) {
           char c = sb1.charAt(l1 - 1);
           sb1.insert(0, c);
           sb1.deleteCharAt(l1);
           if (sb2.compareTo(sb1) == 0) {
               return true;
           }
        }
        return false;
    }
}
