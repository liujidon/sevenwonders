package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class MilitaryCard extends Card {

  public MilitaryCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public MilitaryCard copy() {
    return new MilitaryCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }
}
