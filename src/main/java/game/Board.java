package game;

import cards.Card.Age;
import definitions.CityList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import wonders.City;

public class Board {

  public Deck deck;
  public LinkedList<City> cities = new LinkedList<>();
  public List<Player> players = new ArrayList<>();
  private int playerNumber;
  private Age age;

  public Board(int playerNumber) {
    this.playerNumber = playerNumber;
    setup();
  }

  public void setup() {
    clear();
    setupCities();
    deck = new Deck(playerNumber);
    for (int i = 0; i < playerNumber; i++) {
      Player newPlayer = new Player("Player " + i, cities.pop());
      if (i > 1) {
        newPlayer.setLeftPlayer(players.get(i - 2));
        players.get(i - 2).setRightPlayer(newPlayer);
      }
      if (i == playerNumber) {
        newPlayer.setRightPlayer(players.get(0));
        players.get(0).setLeftPlayer(newPlayer);
      }
      players.add(newPlayer);
    }
    age = Age.I;
  }

  public void setupCities() {
    cities = CityList.getCities(playerNumber);
    long seed = System.nanoTime();
    Collections.shuffle(cities, new Random(seed));
  }

  public void clear() {
    players.clear();
    cities.clear();
    deck.clear();
  }

  public void startAge() {
    while (deck.canDraw(age)) {
      players.forEach(player -> player.addHand(deck.draw(age)));
    }
  }

  public void takeTurn() {
    // make a move
    players.forEach(player -> player.makeMove());

    //pass on the cards
    players.forEach(player -> player.passHandLeft());
    players.forEach(player -> player.moveToHand());
  }
}
