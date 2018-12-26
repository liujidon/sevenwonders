package resources;

public class TechTree extends Resource {

  private String freeBuild;

  public TechTree(String freeBuild) {
    super(freeBuild);
    this.freeBuild = freeBuild;
  }

  public String getFreeBuild() {
    return freeBuild;
  }

  public boolean add(Resource other) {
    return false;
  }

  public TechTree copy() {
    return new TechTree(freeBuild);
  }
}
