package wonders;

import java.util.ArrayList;
import java.util.List;
import resources.Resource;

public class Wonder {

  private String name;
  private List<Resource> cost = new ArrayList<>();
  private List<Resource> production = new ArrayList<>();

  public Wonder(String name, List<Resource> cost, List<Resource> production) {
    this.name = name;
    this.cost = cost;
    this.production = production;
  }

  public String name() {
    return name;
  }

  public List<Resource> getCost() {
    return cost;
  }

  public List<Resource> getProduction() {
    return production;
  }

}
