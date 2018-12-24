package resources;

public abstract class Resource {

  private String name;

  public Resource(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
