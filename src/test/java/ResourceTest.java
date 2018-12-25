import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import evaluator.ResourceEval;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Test;
import resources.ChoiceResource;
import resources.Coin;
import resources.ManufacturedGood;
import resources.ManufacturedGood.MType;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.Resource;
import resources.Science;
import resources.Science.SType;
import resources.ShieldPoint;
import resources.VictoryPoint;

public class ResourceTest {

  final static Logger logger = Logger.getLogger(ResourceTest.class);

  @Test
  public void checkCanBuild() {
    List<Resource> resources = new ArrayList<>();
    resources.add(new Coin(1));
    resources.add(new Coin(3));
    resources.add(new VictoryPoint(10));
    resources.add(new ShieldPoint(4));
    resources.add(new ManufacturedGood(MType.Papyrus));
    resources.add(new ManufacturedGood(MType.Loom));
    resources.add(new ManufacturedGood(MType.Papyrus));
    resources.add(new RawMaterial(RType.Ore, 2));
    resources.add(new RawMaterial(RType.Ore, 2));

    List<Resource> missing = ResourceEval.canBuild(ImmutableList.of(
        new Coin(3)), resources);
    assertTrue(missing.isEmpty());

    missing = ResourceEval.canBuild(ImmutableList.of(
        new ManufacturedGood(MType.Papyrus)), resources);
    assertTrue(missing.isEmpty());

    missing = ResourceEval.canBuild(ImmutableList.of(
        new RawMaterial(RType.Ore, 4)), resources);
    assertTrue(missing.isEmpty());

    missing = ResourceEval.canBuild(ImmutableList.of(
        new ManufacturedGood(MType.Glass),
        new Coin(9),
        new RawMaterial(RType.Clay, 3)), resources);
    assertFalse(missing.isEmpty());
    logger.info("Missing: " + missing);
  }

  @Test
  public void checkGetResource() {
    List<Resource> resources = new ArrayList<>();
    resources.add(new Coin(5));
    resources.add(new Coin(8));
    resources.add(new VictoryPoint(10));
    resources.add(new ShieldPoint(4));
    resources.add(new VictoryPoint(2));
    resources.add(new ManufacturedGood(MType.Papyrus));
    resources.add(new ManufacturedGood(MType.Loom));
    resources.add(new ChoiceResource("Test",
        ImmutableSet.of(new RawMaterial(RType.Lumber), new RawMaterial(RType.Clay)
        )));
    resources.add(new Coin(2));
    resources.add(new Science(SType.Gear));
    resources.add(new Science(SType.Ruler));
    resources.add(new Science(SType.Gear));
    resources.add(new Science(SType.Tablet));

    Resource coin = ResourceEval.getResource(resources, new Coin());
    assertTrue("Coin = 15", coin.getIntValue() == 15);

    Resource vp = ResourceEval.getResource(resources, new VictoryPoint());
    assertTrue("VP = 12", vp.getIntValue() == 12);

    Resource wp = ResourceEval.getResource(resources, new ShieldPoint());
    assertTrue("WP = 4", wp.getIntValue() == 4);

    Resource pap = ResourceEval.getResource(resources, new ManufacturedGood(MType.Papyrus));
    assertTrue("got papyrus", pap.isSameType(new ManufacturedGood(MType.Papyrus)));

    Resource ore = ResourceEval.getResource(resources, new RawMaterial(RType.Ore));
    assertNull("no got ore", ore);

    Resource gear = ResourceEval.getResource(resources, new Science(SType.Gear));
    assertTrue("got gear", gear.isSameType(new Science(SType.Gear)));

  }

  @Test
  public void isSameTypeResourceTest() {
    Resource r1 = new RawMaterial(RType.Ore);
    Resource r2 = new RawMaterial(RType.Lumber);
    Resource r3 = new RawMaterial(RType.Lumber);
    assertFalse(r1.getName() + "!=" + r2.getName(), r1.isSameType(r2));
    assertFalse(r2.getName() + "!=" + r1.getName(), r2.isSameType(r1));
    assertTrue(r3.getName() + "==" + r3.getName(), r2.isSameType(r3));

    Resource m1 = new ManufacturedGood(MType.Papyrus);
    Resource m2 = new ManufacturedGood(MType.Glass);
    Resource m3 = new ManufacturedGood(MType.Papyrus);
    Resource m4 = new ManufacturedGood(MType.Loom);
    assertFalse(m1.getName() + "!=" + m2.getName(), m1.isSameType(m2));
    assertFalse(m1.getName() + "!=" + m2.getName(), m2.isSameType(m1));
    assertTrue(m1.getName() + "==" + m2.getName(), m1.isSameType(m3));
    assertFalse(m1.getName() + "!=" + m4.getName(), m1.isSameType(m4));
  }

  @Test
  public void resourceCopyTest() {
    Resource r1 = new RawMaterial(RType.Ore);
    Resource r2 = new RawMaterial(RType.Lumber, 2);
    assertTrue(r1.getValue() == r1.copy().getValue());
    assertTrue(r1.equals(r1.copy()));
    assertTrue(r1.equals(r1.copy().copy()));
    assertTrue(r2.equals(r2.copy()));

    Resource m = new ManufacturedGood(MType.Papyrus, 40);
    assertTrue(m.equals(m.copy()));

    Resource s = new Science(SType.Tablet);
    assertTrue(s.equals(s.copy()));

  }
}
