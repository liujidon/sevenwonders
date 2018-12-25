package cards;

import java.util.List;
import resources.Resource;

public abstract class Card {

  public enum Age {
    I,
    II,
    III
  }

  public enum Action {
    None,
    Play,
    Discard,
    Build
  }

  private String name;
  private Age age;
  private List<Resource> costs;
  private List<Resource> production;
  private boolean discarded = false;
  private Action action;

  public Card(String name, Age age, List<Resource> costs, List<Resource> production) {
    this.name = name;
    this.age = age;
    this.costs = costs;
    this.production = production;
    action = Action.None;
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

  public void setAction(Action action) {
    this.action = action;
    if (action.equals(Action.Discard) ||
        action.equals(Action.Build)) {
      discard();
    }
  }

  public Action getAction() {
    return action;
  }

  public boolean isDiscarded() {
    return discarded;
  }

  private void discard() {
    discarded = true;
  }
}
