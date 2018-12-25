import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import game.Player;
import org.junit.Test;
import wonders.Alexandria;
import wonders.Giza;

public class PlayerTest {

  @Test
  public void PlayerConstructionTest() {
    Player p1 = new Player("Player 1", new Alexandria());
    assertEquals(3, p1.getCity().getWonders().size());

    Player p2 = new Player("Player 2", new Giza());
    assertNotNull("Should be not null", p2.getCity().getWonders().get(2));
  }

}
