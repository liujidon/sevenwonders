package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class ScienceCard extends Card {

  public ScienceCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public ScienceCard copy() {
    return new ScienceCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }
}
