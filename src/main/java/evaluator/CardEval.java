package evaluator;

import cards.Card;
import game.Player;
import wonders.Wonder;

public class CardEval {

  /**
   * @return true if player can build that card
   */
  public static boolean canBuild(Player player, Card card) {
    return ResourceEval.canBuild(card.getCosts(), player.getResources()).isEmpty();
  }

  /**
   * @return true if player can build that card
   */
  public static boolean canBuild(Player player, Wonder wonder) {
    return ResourceEval.canBuild(wonder.getCost(), player.getResources()).isEmpty();
  }
}
