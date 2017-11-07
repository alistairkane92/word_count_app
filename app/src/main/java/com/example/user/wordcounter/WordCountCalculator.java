package com.example.user.wordcounter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 06/11/2017.
 */

public class WordCountCalculator {
    private ArrayList<String> wordCount;
    private HashMap wordsHash;

    public WordCountCalculator() {
        wordCount = new ArrayList<>();
    }

    public String toString(int numberOfWords){
        String numberAsString = Integer.toString(numberOfWords);
        return numberAsString;
    }

    public void add(String word){
        wordCount.add(word);
    }

    public void clear(){
        wordCount.clear();
    }

    public int getWordCountSize(){
        return wordCount.size();
    }

    public void separateWords(String text){
        for(String word : text.split(" ")){
            wordCount.add(word);
        }
    }

    public HashMap wordFrequencies() {
        int count = 0;
        wordsHash = new HashMap();

        for (String word : wordCount) {
            count = Collections.frequency(wordCount, word);
            wordsHash.put(word, count);
        }

        return wordsHash;
    }
}
