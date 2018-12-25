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

  public RType getRType() {
    return type;
  }

  public boolean isSameType(Resource other) {
    return super.isSameType(other) &&
        other instanceof RawMaterial &&
        ((RawMaterial) other).getRType().equals(this.type);
  }
}
