package example.codeclan.com.wordcounter;

import java.util.HashMap;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

    private String input;

    public StringSplitter(String input) {
        this.input = input;
    }

    public void splitString() {
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public int getCount() {
        int counter = 0;
        String[] words = input.split(" ");
        for(String word : words) {
            counter++;
        }
        return counter;
    }

    public HashMap<String,Integer> detailedCount() {
        HashMap<String, Integer> result = new HashMap<>();
        String[] words = input.split(" ");
        for(String word : words) {
            if(result.get(word) == null) {
                result.put(word, 1);
            } else {
                result.put(word, result.get(word) + 1);
            }
        }
        return result;
    }
}
