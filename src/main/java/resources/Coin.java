package resources;

public class Coin extends Resource {

  private float value;

  public Coin(float value) {
    super(String.format("Coin:%.2f", value));
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
