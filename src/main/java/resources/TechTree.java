package resources;

import java.util.Set;

public class TechTree extends Resource {

  private Set<Resource> children;

  public TechTree(String name, Set<Resource> children) {
    super(name);
    this.children = children;
  }

  public Set<Resource> getChildren() {
    return children;
  }
}