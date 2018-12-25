package definitions;

import cards.Card;
import cards.Card.Age;
import cards.CommerceCard;
import cards.ManufacturedCard;
import cards.MaterialCard;
import cards.MilitaryCard;
import cards.ScienceCard;
import cards.StructureCard;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import resources.ChoiceResource;
import resources.Coin;
import resources.CoinVP;
import resources.CoinVP.VPType;
import resources.ManufacturedGood;
import resources.ManufacturedGood.MType;
import resources.NeighborGather;
import resources.NeighborGather.NType;
import resources.RawMaterial;
import resources.RawMaterial.RType;
import resources.Science;
import resources.Science.SType;
import resources.ShieldPoint;
import resources.Trader;
import resources.Trader.TType;
import resources.VictoryPoint;

public class CardList {

  public static List<Card> getCards(int players) {
    List<Card> cards = new ArrayList<>();

    // 3+ players
    cards.add(new MaterialCard("Lumber Yard",
        Age.I,
        null,
        Lists.newArrayList(new RawMaterial(RType.Lumber))));
    cards.add(new MaterialCard("Stone Pit",
        Age.I,
        null,
        Lists.newArrayList(new RawMaterial(RType.Stone))));
    cards.add(new MaterialCard("Clay Pool",
        Age.I,
        null,
        Lists.newArrayList(new RawMaterial(RType.Clay))));
    cards.add(new MaterialCard("Ore Vein",
        Age.I,
        null,
        Lists.newArrayList(new RawMaterial(RType.Ore))));
    cards.add(new MaterialCard("Timber Yard",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(new RawMaterial(RType.Stone),
                new RawMaterial(RType.Lumber))
        ))));

    cards.add(new ManufacturedCard("Loom",
        Age.I,
        null,
        Lists.newArrayList(new ManufacturedGood(MType.Loom))));
    cards.add(new ManufacturedCard("Glassworks",
        Age.I,
        null,
        Lists.newArrayList(new ManufacturedGood(MType.Glass))));
    cards.add(new ManufacturedCard("Press",
        Age.I,
        null,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus))));

    cards.add(new StructureCard("Baths",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Stone)),
        Lists.newArrayList(new VictoryPoint(3))));
    cards.add(new StructureCard("Altair",
        Age.I,
        null,
        Lists.newArrayList(new VictoryPoint(2))));
    cards.add(new StructureCard("Theater",
        Age.I,
        null,
        Lists.newArrayList(new VictoryPoint(2))));

    cards.add(new CommerceCard("East Trading Post",
        Age.I,
        null,
        Lists.newArrayList(new Trader(TType.RawRight))));
    cards.add(new CommerceCard("West Trading Post",
        Age.I,
        null,
        Lists.newArrayList(new Trader(TType.RawLeft))));
    cards.add(new CommerceCard("Market Place",
        Age.I,
        null,
        Lists.newArrayList(new Trader(TType.ManufaturedBoth))));

    cards.add(new MilitaryCard("Stockade",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new ShieldPoint(1))));
    cards.add(new MilitaryCard("Barracks",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(1))));
    cards.add(new MilitaryCard("Guard Tower",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Clay)),
        Lists.newArrayList(new ShieldPoint(1))));

    cards.add(new ScienceCard("Apothecary",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Ruler))));
    cards.add(new ScienceCard("Workshop",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Gear))));
    cards.add(new ScienceCard("Scriptorium",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new Science(SType.Tablet))));

    // Age II
    cards.add(new MaterialCard("Saw Mill",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Lumber, 2))));
    cards.add(new MaterialCard("Quarry",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Stone, 2))));
    cards.add(new MaterialCard("Brickyard",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Clay, 2))));
    cards.add(new MaterialCard("Foundry",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Ore, 2))));

    cards.add(new ManufacturedCard("Loom",
        Age.II,
        null,
        Lists.newArrayList(new ManufacturedGood(MType.Loom))));
    cards.add(new ManufacturedCard("Glassworks",
        Age.II,
        null,
        Lists.newArrayList(new ManufacturedGood(MType.Glass))));
    cards.add(new ManufacturedCard("Press",
        Age.II,
        null,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus))));

    cards.add(new StructureCard("Aqueduct",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Stone, 3)),
        Lists.newArrayList(new VictoryPoint(5))));
    cards.add(new StructureCard("Temple",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay),
            new RawMaterial(RType.Lumber),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new VictoryPoint(3))));
    cards.add(new StructureCard("Theater",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Ore, 2),
            new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new VictoryPoint(4))));
    cards.add(new StructureCard("Courthouse",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new VictoryPoint(4))));

    cards.add(new CommerceCard("Forum",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new ManufacturedGood(MType.Loom),
                new ManufacturedGood(MType.Papyrus),
                new ManufacturedGood(MType.Glass)
            ))
        )));
    cards.add(new CommerceCard("Caravansery",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Stone),
                new RawMaterial(RType.Lumber),
                new RawMaterial(RType.Ore),
                new RawMaterial(RType.Clay)
            ))
        )));
    cards.add(new CommerceCard("Vineyard",
        Age.II,
        null,
        Lists.newArrayList(new NeighborGather(NType.RawCoin))));
    if (players >= 4) {
      cards.add(new CommerceCard("Bazar",
          Age.II,
          null,
          Lists.newArrayList(new NeighborGather(NType.RawCoin))));
    }

    cards.add(new MilitaryCard("Walls",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Stone, 3)),
        Lists.newArrayList(new ShieldPoint(2))));
    cards.add(new MilitaryCard("Stables",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay),
            new RawMaterial(RType.Lumber),
            new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(2))));
    cards.add(new MilitaryCard("Archery Range",
        Age.II,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(2))));
    if (players >= 4) {
      cards.add(new MilitaryCard("Training Ground",
          Age.II,
          Lists.newArrayList(
              new RawMaterial(RType.Lumber),
              new RawMaterial(RType.Ore, 2)),
          Lists.newArrayList(new ShieldPoint(2))));
    }

    cards.add(new ScienceCard("Dispensary",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Glass),
            new RawMaterial(RType.Ore, 2)),
        Lists.newArrayList(new Science(SType.Ruler))));
    cards.add(new ScienceCard("Laboratory",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus),
            new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(new Science(SType.Gear))));
    cards.add(new ScienceCard("Library",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Loom),
            new RawMaterial(RType.Stone, 2)),
        Lists.newArrayList(new Science(SType.Tablet))));
    cards.add(new ScienceCard("School",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus),
            new RawMaterial(RType.Lumber, 2)),
        Lists.newArrayList(new Science(SType.Tablet))));

    //Age III
    cards.add(new StructureCard("Pantheon",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2),
            new RawMaterial(RType.Ore),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Loom),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new VictoryPoint(7))));
    cards.add(new StructureCard("Gardens",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2),
            new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new VictoryPoint(5))));
    cards.add(new StructureCard("Town Hall",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Stone, 2),
            new RawMaterial(RType.Ore),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new VictoryPoint(6))));
    cards.add(new StructureCard("Palace",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Stone),
            new RawMaterial(RType.Lumber),
            new RawMaterial(RType.Ore),
            new RawMaterial(RType.Clay),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Loom),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new VictoryPoint(8))));
    cards.add(new StructureCard("Senate",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore),
            new RawMaterial(RType.Stone)),
        Lists.newArrayList(new VictoryPoint(6))));

    cards.add(new CommerceCard("Haven",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Ore),
            new RawMaterial(RType.Lumber),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new CoinVP(VPType.RAW_MATERIAL))));
    cards.add(new CommerceCard("Lighthouse",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new CoinVP(VPType.COMMERCE))));
    if (players >= 4) {
      cards.add(new CommerceCard("Chamber of Commerce",
          Age.III,
          Lists.newArrayList(
              new RawMaterial(RType.Clay, 2),
              new ManufacturedGood(MType.Papyrus)),
          Lists.newArrayList(new CoinVP(VPType.MANUFACTURED_GOOD))));
    }
    cards.add(new CommerceCard("Arena",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Ore),
            new RawMaterial(RType.Stone, 2)),
        Lists.newArrayList(new CoinVP(VPType.WONDER))));

    cards.add(new MilitaryCard("Fortifications",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone),
            new RawMaterial(RType.Ore, 3)),
        Lists.newArrayList(new ShieldPoint(3))));
    if (players >= 4) {
      cards.add(new MilitaryCard("Circus",
          Age.III,
          Lists.newArrayList(
              new RawMaterial(RType.Stone, 3),
              new RawMaterial(RType.Ore)),
          Lists.newArrayList(new ShieldPoint(3))));
    }
    cards.add(new MilitaryCard("Arsenal",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new ShieldPoint(3))));
    cards.add(new MilitaryCard("Siege Workshop",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 3),
            new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new ShieldPoint(3))));

    cards.add(new ScienceCard("Lodge",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 2),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Ruler))));
    cards.add(new ScienceCard("Observatory",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Ore, 2),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Gear))));
    cards.add(new ScienceCard("University",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Tablet))));
    cards.add(new ScienceCard("Academy",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone, 3),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Ruler))));
    cards.add(new ScienceCard("Study",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Gear))));
    
    return cards;
  }
}
