package resources;

public class WarPoint extends Resource {

  private float value;

  public WarPoint(float value) {
    super(String.format("Shield:%.2f", value));
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
