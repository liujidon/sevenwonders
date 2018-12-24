package resources;

public class Coin extends Resource {

  private float value;

  public Coin(String name, float value) {
    super(name);
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
