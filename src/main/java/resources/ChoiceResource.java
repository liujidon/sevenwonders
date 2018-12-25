package resources;

import java.util.Set;

/**
 * Choose 1 resource in the set
 *
 * @author bliu
 */
public class ChoiceResource extends Resource {

  private Set<Resource> resource;

  public ChoiceResource(Set<Resource> resource) {
    super(resource.toString());
    this.resource = resource;
  }

  public Set<Resource> getResources() {
    return resource;
  }

  /**
   * Can not be added
   */
  public boolean add(Resource other) {
    return false;
  }

  public ChoiceResource copy() {
    return new ChoiceResource(resource);
  }
}
