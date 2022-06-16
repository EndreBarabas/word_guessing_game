package word_guessing_game;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class MaskerTest {
  @Test void testGetWordToGuess() {
    WordChoser wordchoser = mock(WordChoser.class);
    when(wordchoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    Game game = new Game(wordchoser);
    assertEquals("D________", game.getWordToGuess());
}
}
