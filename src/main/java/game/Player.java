package game;

import cards.Card;
import java.util.ArrayList;
import java.util.List;
import resources.Coin;
import resources.Resource;
import wonders.City;

public class Player {

  private String name;

  /**
   * cards already selected previously
   */
  private List<Card> cards;

  /**
   * cards to chose from this turn
   */
  private List<Card> hand;


  private City city;
  private List<Resource> resources = new ArrayList<>();
  private Player leftPlayer, rightPlayer;

  public Player(String name, City city) {
    this.name = name;
    this.city = city;
    resources.add(city.getNaturalResource());
    resources.add(new Coin(3));
  }

  public String getName() {
    return name;
  }

  public List<Card> getCards() {
    return cards;
  }

  public City getCity() {
    return city;
  }

  /**
   * build the structure described on card
   */
  public void buildCard(Card c) {
    cards.add(c);
    resources.addAll(c.getProduction());
  }

  /**
   * discard card to build next available wonder
   */
  public void buildWonder(Card c) {
    cards.add(c);
    c.discard();
    city.buildNextWonder();
  }

  /**
   * discard card to gain 3 coins
   */
  public void discardCard(Card c) {
    cards.add(c);
    c.discard();
    resources.add(new Coin(3));
  }

  public void setHand(List<Card> nexthand) {
    this.hand = nexthand;
  }

}
