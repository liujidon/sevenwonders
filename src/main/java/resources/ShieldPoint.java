package resources;

public class ShieldPoint extends Resource {

  public ShieldPoint() {
    super("Shield", 1);
  }

  public ShieldPoint(float value) {
    super("Shield", value);
  }

  public ShieldPoint copy() {
    return new ShieldPoint(getValue());
  }
}
