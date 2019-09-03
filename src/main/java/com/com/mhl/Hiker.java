package com.com.mhl;

import java.util.ArrayList;
import java.util.List;

public class Hiker {
    public static List<String> getAnagrams(final String word) {
        final List<String> anagrams = new ArrayList<>();

        if (word.length() == 1) {
            anagrams.add(word);
            return anagrams;
        }

        for (int i = 0; i < word.length(); i++) {
            final List<String> innerAnagrams = getAnagrams(word.replace(word.charAt(i) + "", ""));
            for (String innerAnagram : innerAnagrams) {
                anagrams.add(word.charAt(i) + innerAnagram);
            }
        }
        return anagrams;
    }
}
