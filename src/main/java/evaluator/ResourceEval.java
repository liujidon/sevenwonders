package evaluator;

import static java.util.stream.Collectors.toList;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import resources.ChoiceResource;
import resources.Resource;

public class ResourceEval {

  /**
   * Check if can be built given cost and available resources
   *
   * @return list of missing resources, empty list if can build
   */
  public static List<Resource> canBuild(List<Resource> cost, List<Resource> available) {
    // group similar resources
    cost = groupResources(cost);
    available = groupResources(available);
    List<Resource> missingResources = subtract(cost, available);

    // use up choice resources
    List<ChoiceResource> choices = getResourceByClass(available, ChoiceResource.class);
    if (choices != null && !choices.isEmpty()) {
      List<Set<Resource>> inputChoices = new ArrayList<>();
      choices.forEach(choice -> inputChoices.add(choice.getResources()));
      Set<List<Resource>> possibleCombos = Sets.cartesianProduct(inputChoices);
      //try each combination
      List<Resource> lastMissingCombo = null;
      for (List<Resource> combo : possibleCombos) {
        List<Resource> missingCombo = subtract(missingResources, groupResources(combo));
        if (missingCombo.isEmpty()) {
          return missingCombo;
        }
        if (lastMissingCombo == null || lastMissingCombo.size() > missingCombo.size()) {
          lastMissingCombo = missingCombo;
        }
      }
      if (lastMissingCombo != null) {
        return lastMissingCombo;
      }
    }
    return missingResources;
  }

  /**
   * r1-r2
   *
   * @return remaining set from r1
   */
  public static List<Resource> subtract(List<Resource> r1, List<Resource> r2) {
    List<Resource> remainder = new ArrayList<>();
    for (Resource c : r1) {
      Resource production = getResource(r2, c);
      if (production == null) {
        remainder.add(c);
      } else {
        int valueMissing = c.getIntValue() - production.getIntValue();
        if (valueMissing > 0) {
          Resource missingResource = c.copy();
          missingResource.setValue(valueMissing);
          remainder.add(missingResource);
        }
      }
    }
    return remainder;
  }

  /**
   * filter resources by resource targetClass
   */
  public static <T> List<T> getResourceByClass(List<Resource> resources, Class<T> targetClass) {
    return resources.stream()
        .filter(targetClass::isInstance)
        .map(targetClass::cast)
        .collect(toList());
  }

  /**
   * Filter resources by the type of target
   */
  public static Resource getResource(List<Resource> resources, Resource target) {
    List<Resource> targetResources = new ArrayList<>();
    for (Resource r : resources) {
      if (r.isSameType(target)) {
        targetResources.add(r);
      }
    }
    targetResources = groupResources(targetResources);
    return targetResources.isEmpty() ? null : targetResources.get(0);
  }

  /**
   * Add same type of resource together
   */
  public static List<Resource> groupResources(List<Resource> resources) {
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
