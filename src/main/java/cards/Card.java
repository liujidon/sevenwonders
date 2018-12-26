package cards;

import java.util.ArrayList;
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
  private List<Integer> cardDist;
  private boolean discarded = false;
  private Action action;

  public Card(String name, Age age, List<Resource> costs, List<Resource> production,
      List<Integer> cardDist) {
    this.name = name;
    this.age = age;
    this.costs = costs;
    this.production = production;
    this.cardDist = cardDist;
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

  public List<Integer> getCardDist() {
    return cardDist;
  }

  public List<Card> getCardCopy(int players) {
    List<Card> cards = new ArrayList<>();
    if (cardDist == null || cardDist.isEmpty()) {
      cards.add(this);
    } else {
      cardDist.forEach(req -> {
        if (players >= req) {
          cards.add(this.copy());
        }
      });
    }
    return cards;
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

  public abstract Card copy();

  @Override
  public String toString() {
    return name + "[" + this.getClass().getSimpleName() + "] " +
        ", age=" + age +
        ", costs=" + costs +
        ", production=" + production +
        ", cardDist=" + cardDist +
        ", discarded=" + discarded +
        ", action=" + action;
  }
}
