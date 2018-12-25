package resources;

import game.Player;

public class NeighborGather extends Resource {

  public enum NType {
    RAW_COIN, // 1 coin per brown card built in the player�s city AND in the two neighboring cities
    MANUFACTURED_COIN, // 2 coins per gray card built in the player�s city AND in the two
    // neighboring cities
    RED_VP, // 1 victory point for each red card present in both neighboring cities
    BLUE_VP,
    BROWN_VP,
    GREY_VP,
    YELLOW_VP,
    GREEN_VP,
    WONDER_VP, // 1 victory point for each Wonder stage built in the neighboring cities AND in your
    // own city
    BROWN_GREY_PURPLE_VP, // 1 victory point for each brown, gray and purple card in your city
    WAR_DEFEAT_VP, // 1 victory point for each defeat token present in the neighboring cities
  }

  private NType type;

  public NeighborGather(NType type) {
    super(type.toString());
    this.type = type;
  }

  public NType getNType() {
    return type;
  }

  // Can generate Coin or VP
  public Resource getResource(Player player) {
    return null;
  }

  public boolean add(Resource other) {
    return false;
  }

  public boolean isSameType(Resource other) {
    return super.isSameType(other) &&
        other instanceof NeighborGather &&
        ((NeighborGather) other).getNType().equals(this.type);
  }
}
