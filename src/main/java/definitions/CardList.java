package definitions;

import cards.Card;
import cards.Card.Age;
import cards.CommerceCard;
import cards.ManufacturedCard;
import cards.MaterialCard;
import cards.MilitaryCard;
import cards.StructureCard;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import resources.ChoiceResource;
import resources.Coin;
import resources.ManufacturedGood;
import resources.ManufacturedGood.MType;
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

    cards.add(new MilitaryCard("Apothecary",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Ruler))));
    cards.add(new MilitaryCard("Workshop",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Gear))));
    cards.add(new MilitaryCard("Scriptorium",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new Science(SType.Tablet))));

    return cards;
  }
}
