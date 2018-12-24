package resources;

import java.util.Set;

/**
 * Choose 1 resource in the set
 *
 * @author bliu
 */
public class ChoiceResource extends Resource {

  private Set<Resource> resource;

  public ChoiceResource(String name, Set<Resource> resource) {
    super(name);
    this.resource = resource;
  }

  public Set<Resource> getResources() {
    return resource;
  }
}