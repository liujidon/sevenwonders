package cards;

import java.util.ArrayList;
import java.util.List;
import resources.Age;
import resources.Resource;

public abstract class Card {
  private String name;
  private Age age;
  private List<Resource> cost = new ArrayList<Resource>();
  private List<Resource> production = new ArrayList<Resource>();

  public Card(String name, Age age, List<Resource> cost, List<Resource> production) {
    this.name = name;
    this.age = age;
    this.cost = cost;
    this.production = production;
  }

  public String name() {
    return name;
  };

  public Age age() {
    return age;
  };

  public List<Resource> getCost() {
    return cost;
  };

  public List<Resource> getProduction() {
    return production;
  }

  public boolean canBuild(List<Resource> wonderProduction) {

    // TODO
    return true;
  };
}
