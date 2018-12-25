package resources;

import java.util.Objects;

public class ManufacturedGood extends Resource {

  public enum MType {
    Glass,
    Loom,
    Papyrus
  }

  private MType type;

  public ManufacturedGood(MType type) {
    super(type.toString());
    this.type = type;
  }

  public ManufacturedGood(MType type, float value) {
    super(type.toString());
    this.type = type;
    setValue(value);
  }

  public MType getMType() {
    return type;
  }

  public boolean isSameType(Resource other) {
    return super.isSameType(other) &&
        other instanceof ManufacturedGood &&
        ((ManufacturedGood) other).getMType().equals(this.type);
  }

  public ManufacturedGood copy() {
    return new ManufacturedGood(type, getValue());
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ManufacturedGood)) {
      return false;
    }
    ManufacturedGood oo = (ManufacturedGood) o;
    return type.equals(oo.getMType()) &&
        Objects.equals(getName(), oo.getName()) &&
        Objects.equals(getValue(), oo.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, getValue(), getName());
  }
}
