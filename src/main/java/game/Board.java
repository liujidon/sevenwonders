package game;

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

  public Board(int playerNumber) {
    this.playerNumber = playerNumber;
    setup();
  }

  public void setup() {
    clear();
    setupCities();
    deck = new Deck(playerNumber);
    for (int i = 0; i < playerNumber; i++) {
      players.add(new Player("Player " + i, cities.pop()));
    }
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
}
