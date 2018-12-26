package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class StructureCard extends Card {

  public StructureCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public StructureCard copy() {
    return new StructureCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }
}
