package wonders;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.VictoryPoint;
import resources.WarPoint;

public class Rhodes extends City {

  public Rhodes() {
    super("Rhodes", new RawMaterial(RType.Ore),
        ImmutableList.of(
            new Wonder("Wonder 1",
                Lists.newArrayList(new RawMaterial(RType.Lumber, 2)),
                Lists.newArrayList(new VictoryPoint(3))),
            new Wonder("Wonder 2",
                Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
                Lists.newArrayList(new WarPoint(2))),
            new Wonder("Wonder 3",
                Lists.newArrayList(new RawMaterial(RType.Ore, 4)),
                Lists.newArrayList(new VictoryPoint(7)))
        ));
  }
}
