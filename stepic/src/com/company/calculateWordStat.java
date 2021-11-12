package com.company;

import java.util.*;

public class calculateWordStat {
    public String calculateWordStat(String input){
        List<String> words = Arrays.asList(input.split(" "));
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word: words) {
            wordCount.put(word, Collections.frequency(words, word));
        }
        String key = Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }
}