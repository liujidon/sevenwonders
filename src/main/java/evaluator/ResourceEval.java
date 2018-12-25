package evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import resources.Resource;

public class ResourceEval {

  /**
   * Check if can be built given cost and available resources
   *
   * @return list of missing resources, empty list if can build
   */
  public static List<Resource> canBuild(List<Resource> cost, List<Resource> available) {
    List<Resource> missingResources = new ArrayList<>();

    // group similar resources
    cost = simplifyResources(cost);
    available = simplifyResources(available);

    for (Resource c : cost) {
      Resource production = getResource(available, c);
      if (production == null) {
        missingResources.add(c);
      } else {
        int valueMissing = c.getIntValue() - production.getIntValue();
        if (valueMissing > 0) {
          Resource missingResource = c.copy();
          missingResource.setValue(valueMissing);
          missingResources.add(missingResource);
        }
      }
    }

    // check choice resources
    return missingResources;
  }

  public static Resource getResource(List<Resource> resources, Resource target) {
    List<Resource> targetResources = new ArrayList<>();
    for (Resource r : resources) {
      if (r.isSameType(target)) {
        targetResources.add(r);
      }
    }
    targetResources = simplifyResources(targetResources);
    return targetResources.isEmpty() ? null : targetResources.get(0);
  }

  public static List<Resource> simplifyResources(List<Resource> resources) {
    List<Resource> shortResources = new ArrayList<>();
    for (Resource r : resources) {
      if (shortResources.isEmpty()) {
        shortResources.add(r.copy());
        continue;
      }
      ListIterator<Resource> iterator = shortResources.listIterator();
      while (iterator.hasNext()) {
        Resource nr = iterator.next();
        if (!nr.add(r)) {
          iterator.add(r.copy());
          break;
        }
      }
    }
    return shortResources;
  }
}
