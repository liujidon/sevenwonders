package resources;

public class WarPoint extends Resource {

  private float value;

  public WarPoint(String name, float value) {
    super(name);
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
