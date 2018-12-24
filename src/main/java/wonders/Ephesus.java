package wonders;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import resources.Coin;
import resources.ManufacturedGood;
import resources.ManufacturedGood.MType;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.Resource;
import resources.VictoryPoint;

public class Ephesus extends City {

  public Ephesus(String name, Resource natural, List<Wonder> wonders) {
    super("Ephesus", new ManufacturedGood(MType.Papyrus),
        ImmutableList.of(
            new Wonder("Wonder 1",
                Lists.newArrayList(new RawMaterial(RType.Stone, 2)),
                Lists.newArrayList(new VictoryPoint(3))),
            new Wonder("Wonder 2",
                Lists.newArrayList(new RawMaterial(RType.Lumber, 2)),
                Lists.newArrayList(new Coin(9))),
            new Wonder("Wonder 3",
                Lists.newArrayList(new ManufacturedGood(MType.Papyrus, 2)),
                Lists.newArrayList(new VictoryPoint(7)))
        ));
  }
}
