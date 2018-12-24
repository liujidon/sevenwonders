package resources;

public abstract class Resource {

  private String name;
  private float value;

  public Resource(String name) {
    this.name = name;
    this.value = 1;
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

  public boolean add(Resource other) {
    if (this.getClass().equals(other.getClass())) {
      value += other.value;
      return true;
    }
    return false;
  }
}
