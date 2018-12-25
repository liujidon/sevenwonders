package resources;

import java.util.Objects;

public class Science extends Resource {

  public enum SType {
    Gear,
    Tablet,
    Ruler
  }

  private SType type;

  public Science(SType type) {
    super(type.name());
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

  public Science copy() {
    return new Science(type);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Science)) {
      return false;
    }
    Science oo = (Science) o;
    return type.equals(oo.getSType()) &&
        Objects.equals(getName(), oo.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }
}
