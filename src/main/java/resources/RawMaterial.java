package resources;

import java.util.Objects;

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

  public RawMaterial copy() {
    return new RawMaterial(type, getValue());
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof RawMaterial)) {
      return false;
    }
    RawMaterial oo = (RawMaterial) o;
    return type.equals(oo.getRType()) &&
        Objects.equals(getName(), oo.getName()) &&
        Objects.equals(getValue(), oo.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getValue(), type);
  }

}
