package game;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import cards.Card;
import resources.Resource;
import wonders.City;

public class Player {

  private String name;
  private List<Card> cards;
  private City city;
  private List<Resource> resources = new ArrayList<Resource>();

  public Player(String name, City city) {
    this.name = name;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public List<Card> getCards() {
    return cards;
  }

  public void addCard(Card c) {
    cards.add(c);
    resources.addAll(c.getProduction());
  }

  public City getCity() {
    return city;
  }

  public void simplifyResources() {
    List<Resource> shortResources = new ArrayList<Resource>();
    for (Resource r : resources) {
      ListIterator<Resource> iter = shortResources.listIterator();
      while (iter.hasNext()) {
        Resource nr = iter.next();
        if (!nr.add(r)) iter.add(r);
      }
    }
  }
}
