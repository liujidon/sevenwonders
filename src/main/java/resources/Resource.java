package resources;

public abstract class Resource {

  private String name;
  private float value;

  public Resource(String name) {
    this.name = name;
    this.value = 1;
  }

  public Resource(String name, float value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public float getValue() {
    return value;
  }

  public int getIntValue() {
    return (int) value;
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

  public boolean isSameType(Resource other) {
    return other != null && this.getClass().equals(other.getClass());
  }

  public boolean add(Resource other) {
    if (isSameType(other)) {
      value += other.value;
      return true;
    }
    return false;
  }
}
