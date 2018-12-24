package wonders;

import java.util.ArrayList;
import java.util.List;
import resources.Resource;

public abstract class City {

  private String name;
  private Resource natural;
  private List<Wonder> wonders;
  private List<Wonder> wondersBuilt = new ArrayList<>();

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

  public List<Wonder> getWondersBuilt() {
    return wondersBuilt;
  }

  public List<Wonder> getWonders() {
    return wonders;
  }

  public boolean buildNextWonder() {
    int wonderNumber = wondersBuilt.size();
    //no more wonders to build
    if (wonderNumber == wonders.size()) {
      return false;
    }
    return wondersBuilt.add(wonders.get(wonderNumber));
  }
}
