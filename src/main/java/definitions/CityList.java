package definitions;

import java.util.LinkedList;
import wonders.Alexandria;
import wonders.Babylon;
import wonders.City;
import wonders.Ephesus;
import wonders.Giza;
import wonders.Rhodes;

public class CityList {

  public static LinkedList<City> getCities(int number) {
    LinkedList<City> cities = new LinkedList<>();
    cities.add(new Alexandria());
    cities.add(new Babylon());
    cities.add(new Ephesus());
    cities.add(new Giza());
    cities.add(new Rhodes());
    return cities;
  }
}
