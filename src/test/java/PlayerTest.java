import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cards.Card.Age;
import game.Deck;
import game.Player;
import org.apache.log4j.Logger;
import org.junit.Test;
import wonders.Alexandria;
import wonders.Giza;

public class PlayerTest {

  final static Logger logger = Logger.getLogger(PlayerTest.class);

  @Test
  public void PlayerConstructionTest() {
    Player p1 = new Player("Player 1", new Alexandria());
    assertEquals(3, p1.getCity().getWonders().size());

    Player p2 = new Player("Player 2", new Giza());
    assertNotNull("Should be not null", p2.getCity().getWonders().get(2));
  }

  @Test
  public void DealDeckTest() {
    int playerNumber = 5;
    int cardsExpected = playerNumber * 7 * 3;
    int cardSeen = 0;
    Deck d = new Deck(playerNumber);
    logger.info("Age I");
    while (d.canDraw(Age.I)) {
      logger.info(d.draw(Age.I));
      cardSeen++;
    }
    logger.info("Age II");
    while (d.canDraw(Age.II)) {
      logger.info(d.draw(Age.II));
      cardSeen++;
    }
    logger.info("Age III");
    while (d.canDraw(Age.III)) {
      logger.info(d.draw(Age.III));
      cardSeen++;
    }
    assertEquals(cardsExpected, cardSeen);
  }

}
