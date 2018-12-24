package wonders;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import resources.ChoiceResource;
import resources.ManufacturedGood;
import resources.ManufacturedGood.MType;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.VictoryPoint;

public class Alexandria extends City {

  public Alexandria() {
    super("Alexandria", new ManufacturedGood(MType.Glass),
        ImmutableList.of(
            new Wonder("Wonder 1",
                Lists.newArrayList(new RawMaterial(RType.Stone, 2)),
                Lists.newArrayList(new VictoryPoint(3))),
            new Wonder("Wonder 2",
                Lists.newArrayList(new RawMaterial(RType.Ore, 2)),
                Lists.newArrayList(new ChoiceResource("Wonder", ImmutableSet.of(
                    new RawMaterial(RType.Lumber, 1),
                    new RawMaterial(RType.Clay, 1),
                    new RawMaterial(RType.Ore, 1),
                    new RawMaterial(RType.Stone, 1)
                )))),
            new Wonder("Wonder 3",
                Lists.newArrayList(new ManufacturedGood(MType.Glass, 2)),
                Lists.newArrayList(new VictoryPoint(7)))
        ));
  }
}
