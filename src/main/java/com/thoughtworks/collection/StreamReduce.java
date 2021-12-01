package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0, (number, nextNum) -> (nextNum%2 == 1) ? nextNum : number);
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce("", (word, nextWord) -> (nextWord.length() > word.length()) ? (word = nextWord) : (word));
    }

    public int getTotalLength(List<String> words) {
        return words.stream().reduce("", (word, nextWord) -> (word + nextWord)).length();
    }
}
