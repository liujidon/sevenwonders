package resources;

public class Science extends Resource {

  public static enum Type {
    Gear,
    Tablet,
    Ruler
  }

  private Type type;

  public Science(String name, Type type) {
    super(name);
    this.type = type;
  }
}
