package resources;

public class ManufacturedGood extends Resource {

  public static enum TYPE {
    Glass,
    Loom,
    Papyrus
  };

  private TYPE type;

  public ManufacturedGood(TYPE type) {
    super(type.toString());
    this.type = type;
  }

  public ManufacturedGood(String name, TYPE type) {
    super(name);
    this.type = type;
  }

  public TYPE getType() {
    return type;
  }
}
