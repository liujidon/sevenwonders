package resources;

public class Coin extends Resource {

  public Coin(float value) {
    super(String.format("Coin:%.2f", value));
  }
}
