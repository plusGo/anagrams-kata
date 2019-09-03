package com.mhl;

import com.com.mhl.Hiker;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HikerTest {
    @Test
    public void should_get_1_when_input_b() {
        // given
        final String word = "b";

        // when
        final List<String> anagrams = Hiker.getAnagrams(word);

        // then
        assertEquals(1, anagrams.size());
    }

    @Test
    public void should_get_2_when_input_bi() {
        // given
        final String word = "bi";

        // when
        final List<String> anagrams = Hiker.getAnagrams(word);

        // then
        assertEquals(2, anagrams.size());
    }

    @Test
    public void should_get_6_when_input_bi() {
        // given
        final String word = "bir";

        // when
        final List<String> anagrams = Hiker.getAnagrams(word);

        // then
        assertEquals(6, anagrams.size());
    }

    @Test
    public void should_get_24_when_input_biro() {
        // given
        final String word = "biro";

        // when
        final List<String> anagrams = Hiker.getAnagrams(word);

        // then
        System.out.println(anagrams);
        assertEquals(24, anagrams.size());
    }
}
