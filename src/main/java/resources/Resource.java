package resources;

public abstract class Resource {

  private String name;
  private float value;

  public Resource(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public float getValue() {
    return value;
  }

  public void setValue(float value) {
    this.value = value;
  }

  public void incrementValue() {
    this.value++;
  }

  public boolean isGreaterEqual(Resource other) {
    return this.getValue() >= other.getValue();
  }
}
