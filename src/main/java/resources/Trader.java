package resources;

public class Trader extends Resource {

  public static enum TYPE {
    /**
     * starting on the turn following the one in which this building was constructed, the player
     * purchases raw materials from the neighboring city indicated by the arrow for 1 coin instead
     * of 2.
     */
    RAW_LEFT,
    RAW_RIGHT,

    /**
     * from the turn following the one in which this structure was built, the player pays the
     * manufactured goods bought from his or her neighbors 1 coin instead of 2
     */
    MANUFACTURED_BOTH
  };

  private TYPE type;

  public Trader(String name, TYPE type) {
    super(name);
    this.type = type;
  }

  public TYPE getType() {
    return type;
  }
}
