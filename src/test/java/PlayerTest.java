import static org.junit.Assert.assertEquals;

import game.Player;
import org.junit.Test;
import wonders.Alexandria;

public class PlayerTest {

  @Test
  public void PlayerConstructionTest() {
    Player p1 = new Player("Player 1", new Alexandria());
    assertEquals(p1.getCity().getWonders().size(), 3);
  }

}
