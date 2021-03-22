package wordscrambler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Gergö Szijarto
 */
public class Model {

    String currentWord;
    String shuffledString;
    Random rand = new Random();
    List<String> wordList = Arrays.asList("hello",
            "computer",
            "laptop",
            "school",
            "programming",
            "pullover",
            "jacket",
            "coffee",
            "polymorphism",
            "java",
            "smartphone",
            "door",
            "gaming",
            "desk",
            "bus",
            "studying");
    ArrayList<String> words = new ArrayList<>(wordList);

    public String shuffle() {
        String x = words.get(rand.nextInt(wordList.size()));
        List<Character> list = new ArrayList<>();
        for (char c : x.toCharArray()) {
            list.add(c);
        }
        Collections.shuffle(list);
        StringBuilder builder = new StringBuilder();
        list.forEach((c) -> {
            builder.append(c);
        });
        String shuffled = builder.toString();
        currentWord = x;
        shuffledString = shuffled;
        System.out.println(x + " " + shuffled);
        return shuffled;
    }

    public String handleInput(String guess) {
        if (guess.equals(currentWord)) {
            JOptionPane.showMessageDialog(null,
                    "Well done! You guessed the word.",
                    "Congrats!",
                    JOptionPane.INFORMATION_MESSAGE);
            shuffle();
        }

        return null;
    }

    public String getCurrentWord() {
        return shuffledString;
    }
}
