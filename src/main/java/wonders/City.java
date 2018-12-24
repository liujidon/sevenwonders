package wonders;

import java.util.ArrayList;
import java.util.List;
import resources.Resource;

public abstract class City {

  private String name;
  private Resource natural;
  private int wondersBuilt = 0;
  private List<Wonder> wonders = new ArrayList<Wonder>();

  public City(String name, Resource natural, List<Wonder> wonders) {
    this.name = name;
    this.natural = natural;
    this.wonders = wonders;
  }

  public String getName() {
    return name;
  }

  public Resource getNaturalResource() {
    return natural;
  }

  public int wondersBuilt() {
    return wondersBuilt;
  }

  public List<Wonder> getWonders() {
    return wonders;
  }
}
