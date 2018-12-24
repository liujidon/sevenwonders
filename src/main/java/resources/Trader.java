package resources;

public class Trader extends Resource {

  public enum TType {
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
  }

  private TType TType;

  public Trader(String name, TType TType) {
    super(name);
    this.TType = TType;
  }

  public TType getTType() {
    return TType;
  }

  public boolean add(Resource other) {
    return false;
  }
}
