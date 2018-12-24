package cards;

import java.util.List;
import resources.Age;
import resources.Resource;

public abstract class Card {

  private String name;
  private Age age;
  private List<Resource> costs;
  private List<Resource> production;
  private boolean discarded = false;

  public Card(String name, Age age, List<Resource> costs, List<Resource> production) {
    this.name = name;
    this.age = age;
    this.costs = costs;
    this.production = production;
  }

  public String name() {
    return name;
  }

  public Age age() {
    return age;
  }

  public List<Resource> getCosts() {
    return costs;
  }

  public List<Resource> getProduction() {
    return production;
  }

  public boolean isDiscarded() {
    return discarded;
  }

  public void discard() {
    discarded = true;
  }
}
