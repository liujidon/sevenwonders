package resources;

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

  public ManufacturedGood(String name, MType type) {
    super(name);
    this.type = type;
  }

  public MType getMType() {
    return type;
  }

  public boolean add(Resource other) {
    if (other instanceof ManufacturedGood && ((ManufacturedGood) other).type.equals(this.type)) {
      this.setValue(getValue() + other.getValue());
      return true;
    }
    return false;
  }
}
