package engine;

import cards.Card;
import cards.Card.Action;
import evaluator.CardEval;
import game.Player;
import java.util.List;

public class RandomEngine implements Engine {

  public Card selectBestCard(Player p) {
    List<Card> hand = p.getHand();
    for (Card c : hand) {
      if (CardEval.canBuild(p, c)) {
        c.setAction(Action.Play);
        return c;
      }
    }
    //discard if can't play any
    hand.get(0).setAction(Action.Discard);
    return hand.get(0);
  }
}
