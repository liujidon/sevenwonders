package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class ManufacturedCard extends Card {

  public ManufacturedCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public ManufacturedCard copy() {
    return new ManufacturedCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }
}
