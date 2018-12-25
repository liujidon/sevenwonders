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

  public MType getMType() {
    return type;
  }

  public boolean isSameType(Resource other) {
    return super.isSameType(other) &&
        other instanceof ManufacturedGood &&
        ((ManufacturedGood) other).getMType().equals(this.type);
  }
}
