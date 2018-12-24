package resources;

public class VictoryPoint extends Resource {

  private float value;

  public VictoryPoint(float value) {
    super(String.format("VP:%.2f", value));
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
