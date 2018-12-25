package resources;

public class VictoryPoint extends Resource {

  public VictoryPoint() {
    super("VP:1", 1);
  }

  public VictoryPoint(float value) {
    super(String.format("VP:%.2f", value), value);
  }
}
