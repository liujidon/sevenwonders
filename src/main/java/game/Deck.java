package game;

import cards.Card;
import cards.Card.Age;
import definitions.CardList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {

  LinkedList<Card> round1 = new LinkedList<>();
  LinkedList<Card> round2 = new LinkedList<>();
  LinkedList<Card> round3 = new LinkedList<>();

  public Deck(int players) {
    List<Card> cards = CardList.getCards(players);
    for (Card card : cards) {
      if (card.age().equals(Age.I)) {
        round1.add(card);
      } else if (card.age().equals(Age.II)) {
        round2.add(card);
      } else if (card.age().equals(Age.III)) {
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
    if (age.equals(Age.I)) {
      return round1.pop();
    }
    if (age.equals(Age.II)) {
      return round2.pop();
    }
    if (age.equals(Age.III)) {
      return round3.pop();
    }
    return null;
  }

  public void clear() {
    round1.clear();
    round2.clear();
    round3.clear();
  }
}
