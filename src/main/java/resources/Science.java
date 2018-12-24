package resources;

public class Science extends Resource {

  public enum SType {
    Gear,
    Tablet,
    Ruler
  }

  private SType type;

  public Science(String name, SType type) {
    super(name);
    this.type = type;
  }

  public SType getSType() {
    return type;
  }

  public boolean add(Resource other) {
    if (other instanceof Science && ((Science) other).type.equals(this.type)) {
      this.setValue(getValue() + other.getValue());
      return true;
    }
    return false;
  }
}
