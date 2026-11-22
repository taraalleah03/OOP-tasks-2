package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words = new HashMap<>();

    public void addWord(String word, String meaning) {
        words.put(word, meaning);
    }

    public String getMeaning(String word) {
        if(words.containsKey(word)){
            return words.get(word);
        }else{
            return word + " can not be found in dictionary";
        }
    }
}
