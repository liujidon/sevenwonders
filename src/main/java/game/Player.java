package game;

import cards.Card;
import cards.Card.Action;
import engine.Engine;
import engine.RandomEngine;
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
  private List<Card> cards = new ArrayList<>();

  /**
   * cards to chose from this turn
   */
  private List<Card> hand = new ArrayList<>();

  /**
   * cards passed by adjacent player, to be moved to hand
   */
  private List<Card> tempHand = new ArrayList<>();

  private City city;
  private List<Resource> resources = new ArrayList<>();

  /**
   * Other players adjacent to this player
   */
  private Player leftPlayer, rightPlayer;

  private Engine engine;

  public Player(String name, City city) {
    this.name = name;
    this.city = city;
    this.engine = new RandomEngine();
    resources.add(city.getNaturalResource());
    resources.add(new Coin(3));
  }

  public void makeMove() {
    Card card = engine.selectBestCard(this);
    hand.remove(card);
    if (card.getAction().equals(Action.Discard)) {
      discardCard(card);
    } else if (card.getAction().equals(Action.Play)) {
      buildCard(card);
    } else if (card.getAction().equals(Action.Build)) {
      buildWonder(card);
    }
  }

  public void passHandLeft() {
    leftPlayer.setTempHand(hand);
  }

  public void passHandRight() {
    rightPlayer.setTempHand(hand);
  }

  public void moveToHand() {
    hand = tempHand;
    tempHand = new ArrayList<>();
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
    city.buildNextWonder();
  }

  /**
   * discard card to gain 3 coins
   */
  public void discardCard(Card c) {
    cards.add(c);
    resources.add(new Coin(3));
  }

  public void setHand(List<Card> nextHand) {
    this.hand = nextHand;
  }

  public void addHand(Card card) {
    hand.add(card);
  }

  public List<Card> getHand() {
    return hand;
  }

  public List<Card> getTempHand() {
    return tempHand;
  }

  public void setTempHand(List<Card> tempHand) {
    this.tempHand = tempHand;
  }

  public List<Resource> getResources() {
    return resources;
  }

  public Player getLeftPlayer() {
    return leftPlayer;
  }

  public void setLeftPlayer(Player leftPlayer) {
    this.leftPlayer = leftPlayer;
  }

  public Player getRightPlayer() {
    return rightPlayer;
  }

  public void setRightPlayer(Player rightPlayer) {
    this.rightPlayer = rightPlayer;
  }
}
