package wonders;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import resources.ChoiceResource;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.Science;
import resources.Science.SType;
import resources.VictoryPoint;

public class Babylon extends City {

  public Babylon() {
    super("Babylon", new RawMaterial(RType.Clay),
        ImmutableList.of(
            new Wonder("Wonder 1",
                Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
                Lists.newArrayList(new VictoryPoint(3))),
            new Wonder("Wonder 2",
                Lists.newArrayList(new RawMaterial(RType.Lumber, 3)),
                Lists.newArrayList(new ChoiceResource("Wonder", ImmutableSet.of(
                    new Science(SType.Gear),
                    new Science(SType.Ruler),
                    new Science(SType.Tablet)
                )))),
            new Wonder("Wonder 3",
                Lists.newArrayList(new RawMaterial(RType.Clay, 4)),
                Lists.newArrayList(new VictoryPoint(7)))
        ));
  }
}
