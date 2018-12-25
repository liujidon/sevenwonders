package game;

import cards.Card;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import resources.Age;
import resources.Age.AGE;

public class Deck {

  LinkedList<Card> round1 = new LinkedList<>();
  LinkedList<Card> round2 = new LinkedList<>();
  LinkedList<Card> round3 = new LinkedList<>();

  public Deck(List<Card> cards) {
    for (Card card : cards) {
      if (card.age().getAge().equals(AGE.I)) {
        round1.add(card);
      } else if (card.age().getAge().equals(AGE.II)) {
        round2.add(card);
      } else if (card.age().getAge().equals(AGE.III)) {
        round3.add(card);
      }
    }
    shuffleDeck();
  }

  public void shuffleDeck() {
    long seed = System.nanoTime();
    Collections.shuffle(round1, new Random(seed));
    Collections.shuffle(round2, new Random(seed));
    Collections.shuffle(round3, new Random(seed));
  }

  public Card draw(Age age) {
    if (age.getAge().equals(AGE.I)) {
      return round1.pop();
    }
    if (age.getAge().equals(AGE.II)) {
      return round2.pop();
    }
    if (age.getAge().equals(AGE.III)) {
      return round3.pop();
    }
    return null;
  }
}
