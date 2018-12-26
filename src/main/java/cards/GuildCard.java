package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class GuildCard extends Card {

  public GuildCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public GuildCard copy() {
    return new GuildCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }
}
