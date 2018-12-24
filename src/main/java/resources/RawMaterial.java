package resources;

public class RawMaterial extends Resource {

  public enum RType {
    Lumber,
    Stone,
    Clay,
    Ore
  }

  private RType type;

  public RawMaterial(RType type) {
    super(type.toString());
    this.type = type;
  }

  public RawMaterial(RType type, float value) {
    super(type.toString());
    this.type = type;
    this.setValue(value);
  }

  public RawMaterial(String name, RType type) {
    super(name);
    this.type = type;
  }

  public RType getRType() {
    return type;
  }

  public boolean add(Resource other) {
    if (other instanceof RawMaterial && ((RawMaterial) other).type.equals(this.type)) {
      this.setValue(getValue() + other.getValue());
      return true;
    }
    return false;
  }
}
