// Design your controller in such a way that JavaFX components are never passed to it.
package controller;
import model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary = new Dictionary();

    public DictionaryController() {

        dictionary.addWord("apricity", "The warmth of the sun during winter.");
        dictionary.addWord("accismus", "Pretending to refuse something you actually want.");
        dictionary.addWord("lollygag","To waste time or dawdle.");
        dictionary.addWord("java","A high-level, general-purpose coding language designed to run across different platforms via a Java Virtual Machine (JVM).");
        dictionary.addWord("object","A specific instance of a class created in memory.");
        dictionary.addWord("method","A named block of code that performs a task and can be called when needed.");
    }

    public String search(String word){
        if (word.trim().isEmpty()){
            return "Please enter a word";
        }
        return dictionary.getMeaning(word.trim());
    }
}
