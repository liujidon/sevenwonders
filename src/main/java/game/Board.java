package game;

import java.util.List;
import wonders.Alexandria;

public class Board {

  public Deck deck;
  public List<Player> players;

  public Board(int playerNumber) {
    for (int i = 0; i < playerNumber; i++) {
      players.add(new Player("", new Alexandria()));
    }
  }
}
