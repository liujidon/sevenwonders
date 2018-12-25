package resources;

public class Coin extends Resource {

  public Coin() {
    super(String.format("Coin:1", 1));
  }

  public Coin(float value) {
    super(String.format("Coin:%.2f", value), value);
  }
}
