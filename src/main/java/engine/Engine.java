package engine;

import cards.Card;
import game.Player;

public interface Engine {

  Card selectBestCard(Player player);
}
