package resources;

public class Science extends Resource {

  public static enum TYPE {
    Gear,
    Tablet,
    Ruler
  }

  private TYPE type;

  public Science(String name, TYPE type) {
    super(name);
    this.type = type;
  }

  public TYPE getType() {
    return type;
  }
}
