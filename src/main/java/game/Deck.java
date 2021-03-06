package game;

import cards.Card;
import cards.Card.Age;
import cards.GuildCard;
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
    Collections.shuffle(cards, new Random(System.nanoTime()));
    int guildNeeded = players + 2;
    int guildAdded = 0;
    for (Card card : cards) {
      if (card.age().equals(Age.I)) {
        round1.addAll(card.getCardCopy(players));
      } else if (card.age().equals(Age.II)) {
        round2.addAll(card.getCardCopy(players));
      } else if (card.age().equals(Age.III)) {
        if (card instanceof GuildCard) {
          if (guildAdded < guildNeeded) {
            guildAdded++;
            round3.add(card);
          }
        } else {
          round3.addAll(card.getCardCopy(players));
        }
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

  public boolean canDraw(Age age) {
    if (age.equals(Age.I)) {
      return !round1.isEmpty();
    } else if (age.equals(Age.II)) {
      return !round2.isEmpty();
    } else if (age.equals(Age.III)) {
      return !round3.isEmpty();
    }
    return false;
  }

  public Card draw(Age age) {
    if (age.equals(Age.I)) {
      return round1.pop();
    } else if (age.equals(Age.II)) {
      return round2.pop();
    } else if (age.equals(Age.III)) {
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
