package helper;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import resources.Resource;

public class ResourceHelper {

  public static List<Resource> simplifyResources(List<Resource> resources) {
    List<Resource> shortResources = new ArrayList<>();
    for (Resource r : resources) {
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
