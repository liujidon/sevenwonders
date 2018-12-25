package resources;

public class WarPoint extends Resource {

  public WarPoint() {
    super("WP:1", 1);
  }

  public WarPoint(float value) {
    super(String.format("Shield:%.2f", value), value);
  }
}
