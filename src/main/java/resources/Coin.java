package resources;

public class Coin extends Resource {

  public Coin() {
    super("Coin", 1);
  }

  public Coin(float value) {
    super("Coin", value);
  }

  public Coin copy() {
    return new Coin(getValue());
  }
}
