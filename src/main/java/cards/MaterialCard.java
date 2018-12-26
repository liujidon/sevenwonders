package cards;

import com.google.common.collect.ImmutableList;
import java.util.List;
import resources.Resource;

public class MaterialCard extends Card {

  public MaterialCard(String name, Age age, List<Resource> cost, List<Resource> production,
      List<Integer> cardDist) {
    super(name, age, cost, production, cardDist);
  }

  public MaterialCard copy() {
    return new MaterialCard(name(), age(), ImmutableList.copyOf(getCosts()),
        ImmutableList.copyOf(getProduction()), ImmutableList.copyOf(getCardDist()));
  }
}
