package evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import resources.Coin;
import resources.Resource;

public class ResourceEval {

  /**
   * Check if can be built
   *
   * @return list of missing resources, empty list if can build
   */
  public static List<Resource> canBuild(List<Resource> cost, List<Resource> available) {
    List<Resource> missingResources = new ArrayList<>();
    cost = simplifyResources(cost);
    available = simplifyResources(available);
    for (Resource c : cost) {
      Resource production = getResource(available, c);
      if (production == null) {
        missingResources.add(c);
      } else {
        int valueMissing = c.getIntValue() - production.getIntValue();
        if (valueMissing > 0) {
          missingResources.add(new Coin());
        }
      }
    }
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
        shortResources.add(r);
        continue;
      }
      ListIterator<Resource> iterator = shortResources.listIterator();
      while (iterator.hasNext()) {
        Resource nr = iterator.next();
        if (!nr.add(r)) {
          iterator.add(r);
        }
      }
    }
    return shortResources;
  }
}
