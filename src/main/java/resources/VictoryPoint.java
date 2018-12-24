package resources;

public class VictoryPoint extends Resource {

  private float value;

  public VictoryPoint(String name, float value) {
    super(name);
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
