package wonders;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.VictoryPoint;

public class Giza extends City {

  public Giza() {
    super("Giza", new RawMaterial(RType.Stone),
        ImmutableList.of(
            new Wonder("Wonder 1",
                Lists.newArrayList(new RawMaterial(RType.Stone, 2)),
                Lists.newArrayList(new VictoryPoint(3))),
            new Wonder("Wonder 2",
                Lists.newArrayList(new RawMaterial(RType.Lumber, 3)),
                Lists.newArrayList(new VictoryPoint(5))),
            new Wonder("Wonder 3",
                Lists.newArrayList(new RawMaterial(RType.Stone, 4)),
                Lists.newArrayList(new VictoryPoint(7)))
        ));
  }
}
