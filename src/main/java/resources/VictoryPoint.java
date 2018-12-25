package resources;

public class VictoryPoint extends Resource {

  public VictoryPoint() {
    super("VP", 1);
  }

  public VictoryPoint(float value) {
    super("VP", value);
  }

  public VictoryPoint copy() {
    return new VictoryPoint(getValue());
  }
}
