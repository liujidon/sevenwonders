package resources;

public class RawMaterial extends Resource {

  public static enum TYPE {
    Lumber,
    Stone,
    Clay,
    Ore
  };

  private TYPE type;

  public RawMaterial(String name, TYPE type) {
    super(name);
    this.type = type;
  }
}
