package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class CommerceCard extends Card {

  public CommerceCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public CommerceCard copy() {
    return new CommerceCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }

}
