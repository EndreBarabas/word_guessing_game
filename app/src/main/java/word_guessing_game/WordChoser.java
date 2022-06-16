package word_guessing_game;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordChoser {
  private static final ArrayList<String> DICTIONARY = new ArrayList<>(Arrays.asList("MAKERS", "CANDIES", "DEVELOPER", "LONDON","ANYTHING"));

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY.get(rand.nextInt(DICTIONARY.size()));
}

  public static ArrayList<String> getDictionary() {
    return DICTIONARY;
  }
}
