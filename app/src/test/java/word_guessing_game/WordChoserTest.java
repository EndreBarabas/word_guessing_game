package word_guessing_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

public class WordChoserTest {
  @Test
  @Disabled void testWordChoser() {
      WordChoser wordchoser = new WordChoser();
      assertEquals(WordChoser.getDictionary().contains(wordchoser.getRandomWordFromDictionary()), true);
  }
}
