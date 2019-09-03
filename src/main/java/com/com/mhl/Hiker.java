package com.com.mhl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hiker {
    public static List<String> getAnagrams(final String word) {
        final List<String> anagrams = new ArrayList<>();

        if (word.length() == 1) {
            anagrams.add(word);
            return anagrams;
        }


        return  IntStream.range(0, word.length())
                .boxed()
                .flatMap(i -> {
                    final List<String> anagrams1 = getAnagrams(word.replace(word.charAt(i) + "", ""));
                    return anagrams1.stream().map(anagram -> word.charAt(i) + anagram);
                }).collect(Collectors.toList());

//        System.out.println(collect.size());
//
//        for (int i = 0; i < word.length(); i++) {
//            final List<String> innerAnagrams = getAnagrams(word.replace(word.charAt(i) + "", ""));
//            for (String innerAnagram : innerAnagrams) {
//                anagrams.add(word.charAt(i) + innerAnagram);
//            }
//        }
//        return anagrams;
    }
}
