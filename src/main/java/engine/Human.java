package engine;

import cards.Card;
import cards.Card.Action;
import game.Player;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Human implements Engine {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  final String operatingSystem = System.getProperty("os.name");

  public Card selectBestCard(Player player) {
    //discard if can't play any
    player.getHand().get(0).setAction(Action.Discard);
    return player.getHand().get(0);
  }

  private boolean isHelpCommand(String response) {
    return response.isEmpty() || response.equals("?") || response.equals("h");
  }
}
