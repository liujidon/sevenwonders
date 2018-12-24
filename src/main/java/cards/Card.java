package cards;

import java.util.ArrayList;
import java.util.List;
import resources.Age;
import resources.Resource;

public abstract class Card {
  private String name;
  private Age age;
  private List<Resource> costs = new ArrayList<Resource>();
  private List<Resource> production = new ArrayList<Resource>();

  public Card(String name, Age age, List<Resource> costs, List<Resource> production) {
    this.name = name;
    this.age = age;
    this.costs = costs;
    this.production = production;
  }

  public String name() {
    return name;
  };

  public Age age() {
    return age;
  };

  public List<Resource> getCosts() {
    return costs;
  };

  public List<Resource> getProduction() {
    return production;
  }
}
