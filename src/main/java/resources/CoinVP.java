package resources;

import game.Player;

/**
 * the coins are taken only once, when the structure is built. The victory points are counted at the
 * end of the game, according to the cards and Wonder phases built at that point.
 *
 * @author bliu
 */
public class CoinVP extends Resource {

  public static enum TYPE {
    /**
     * 3 coins per Wonder stage constructed in its home city at the time it comes into play (3, 6, 9
     * or 12 coins). At the end of the game, the card is worth 1 victory point per Wonder stage
     * built in its home city (1, 2, 3 or 4 points)
     */
    WONDER,

    /**
     * s 1 coin per brown card present in a player’s city when it is played. At the end of the game,
     * the card is worth 1 victory point for each brown card present in the player’s city
     */
    RAW_MATERIAL,

    /**
     * 2 coins for each gray card present in the player’s city when it comes into play. At the end
     * of the game, the card is worth 2 victory points for each gray card present in the player’s
     * city
     */
    MANUFACTURED_GOOD,

    /**
     * s 1 coin per yellow card in the player’s city, itself included, when it is played. At the end
     * of the game, the card is worth 1 victory point for each yellow card present in a player’s
     * city
     */
    COMMERCE
  }

  private TYPE type;

  public CoinVP(String name, TYPE type) {
    super(name);
    this.type = type;
  }

  public TYPE getType() {
    return type;
  }

  public Coin getCoin(Player player) {
    return new Coin(0);
  }

  public VictoryPoint getVP(Player player) {
    return new VictoryPoint(0);
  }

  /** Can not be added */
  public boolean add(Resource other) {
    return false;
  }
}
