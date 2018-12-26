package definitions;

import cards.Card;
import cards.Card.Age;
import cards.CommerceCard;
import cards.GuildCard;
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
import resources.TechTree;
import resources.Trader;
import resources.Trader.TType;
import resources.VictoryPoint;

public class CardList {

  public static List<Card> getCards(int players) {
    List<Card> cards = new ArrayList<>();

    // Age I
    cards.add(new MaterialCard("Lumber Yard",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new RawMaterial(RType.Lumber)),
        Lists.newArrayList(3, 4)));
    cards.add(new MaterialCard("Stone Pit",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new RawMaterial(RType.Stone)),
        Lists.newArrayList(3, 5)));
    cards.add(new MaterialCard("Clay Pool",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new RawMaterial(RType.Clay)),
        Lists.newArrayList(3, 5)));
    cards.add(new MaterialCard("Ore Vein",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new RawMaterial(RType.Ore)),
        Lists.newArrayList(3, 4)));

    cards.add(new MaterialCard("Tree Farm",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Clay),
                new RawMaterial(RType.Lumber))
        )),
        Lists.newArrayList(6)));

    cards.add(new MaterialCard("Excavation",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Clay),
                new RawMaterial(RType.Stone))
        )),
        Lists.newArrayList(4)));
    cards.add(new MaterialCard("Clay Pit",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Clay),
                new RawMaterial(RType.Ore))
        )),
        Lists.newArrayList(3)));
    cards.add(new MaterialCard("Timber Yard",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Stone),
                new RawMaterial(RType.Lumber))
        )),
        Lists.newArrayList(3)));

    cards.add(new MaterialCard("Forest Cave",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Ore),
                new RawMaterial(RType.Lumber))
        )),
        Lists.newArrayList(5)));

    cards.add(new MaterialCard("Mine",
        Age.I,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new ChoiceResource(
            ImmutableSet.of(
                new RawMaterial(RType.Ore),
                new RawMaterial(RType.Stone))
        )),
        Lists.newArrayList(6)));
    cards.add(new ManufacturedCard("Loom",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(3, 6)));
    cards.add(new ManufacturedCard("Glassworks",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(3, 6)));
    cards.add(new ManufacturedCard("Press",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(3, 6)));

    cards.add(new StructureCard("Pawn Shop",
        Age.I, new ArrayList<>(), Lists.newArrayList(new VictoryPoint(3)),
        Lists.newArrayList(4, 7)));
    cards.add(new StructureCard("Baths",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Stone)),
        Lists.newArrayList(
            new VictoryPoint(3),
            new TechTree("Aqueduct")),
        Lists.newArrayList(3, 7)));
    cards.add(new StructureCard("Altair",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(
            new VictoryPoint(2),
            new TechTree("Temple")),
        Lists.newArrayList(3, 5)));
    cards.add(new StructureCard("Theater",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(
            new VictoryPoint(2),
            new TechTree("Statue")),
        Lists.newArrayList(3, 6)));

    cards.add(new CommerceCard("Tavern",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new Coin(5)),
        Lists.newArrayList(4, 5, 7)));
    cards.add(new CommerceCard("East Trading Post",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new Trader(TType.RawRight),
            new TechTree("Forum")),
        Lists.newArrayList(3, 7)));
    cards.add(new CommerceCard("West Trading Post",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new Trader(TType.RawLeft),
            new TechTree("Forum")),
        Lists.newArrayList(3, 7)));
    cards.add(new CommerceCard("Market Place",
        Age.I,
        new ArrayList<>(),
        Lists.newArrayList(new Trader(TType.ManufaturedBoth),
            new TechTree("Caravansery")),
        Lists.newArrayList(3, 6)));

    cards.add(new MilitaryCard("Stockade",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new ShieldPoint(1)),
        Lists.newArrayList(3, 7)));
    cards.add(new MilitaryCard("Barracks",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(1)),
        Lists.newArrayList(3, 5)));
    cards.add(new MilitaryCard("Guard Tower",
        Age.I,
        Lists.newArrayList(new RawMaterial(RType.Clay)),
        Lists.newArrayList(new ShieldPoint(1)),
        Lists.newArrayList(3, 4)));

    cards.add(new ScienceCard("Apothecary",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Ruler),
            new TechTree("Stables"),
            new TechTree("Dispensary")
        ),
        Lists.newArrayList(3, 5)));
    cards.add(new ScienceCard("Workshop",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Gear),
            new TechTree("Archery Range"),
            new TechTree("Laboratory")),
        Lists.newArrayList(3, 7)));
    cards.add(new ScienceCard("Scriptorium",
        Age.I,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new Science(SType.Tablet),
            new TechTree("Courthouse"),
            new TechTree("Library")),
        Lists.newArrayList(3, 4)));

    // Age II
    cards.add(new MaterialCard("Saw Mill",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Lumber, 2)),
        Lists.newArrayList(3, 4)));
    cards.add(new MaterialCard("Quarry",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Stone, 2)),
        Lists.newArrayList(3, 4)));
    cards.add(new MaterialCard("Brickyard",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(3, 4)));
    cards.add(new MaterialCard("Foundry",
        Age.II,
        Lists.newArrayList(new Coin(1)),
        Lists.newArrayList(new RawMaterial(RType.Ore, 2)),
        Lists.newArrayList(3, 4)));

    cards.add(new ManufacturedCard("Loom",
        Age.II,
        new ArrayList<>(),
        Lists.newArrayList(new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(3, 5)));
    cards.add(new ManufacturedCard("Glassworks",
        Age.II,
        new ArrayList<>(),
        Lists.newArrayList(new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(3, 5)));
    cards.add(new ManufacturedCard("Press",
        Age.II,
        new ArrayList<>(),
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(3, 5)));

    cards.add(new StructureCard("Aqueduct",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Stone, 3)),
        Lists.newArrayList(new VictoryPoint(5)),
        Lists.newArrayList(3, 7)));
    cards.add(new StructureCard("Temple",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay),
            new RawMaterial(RType.Lumber),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new VictoryPoint(3),
            new TechTree("Pantheon")),
        Lists.newArrayList(3, 6)));
    cards.add(new StructureCard("Statue",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Ore, 2),
            new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new VictoryPoint(4),
            new TechTree("Gardens")),
        Lists.newArrayList(3, 7)));
    cards.add(new StructureCard("Courthouse",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new VictoryPoint(4)),
        Lists.newArrayList(3, 4)));

    cards.add(new CommerceCard("Forum",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(new ChoiceResource(
                ImmutableSet.of(
                    new ManufacturedGood(MType.Loom),
                    new ManufacturedGood(MType.Papyrus),
                    new ManufacturedGood(MType.Glass)
                )),
            new TechTree("Haven")
        ),
        Lists.newArrayList(3, 6, 7)));
    cards.add(new CommerceCard("Caravansery",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(new ChoiceResource(
                ImmutableSet.of(
                    new RawMaterial(RType.Stone),
                    new RawMaterial(RType.Lumber),
                    new RawMaterial(RType.Ore),
                    new RawMaterial(RType.Clay)
                )),
            new TechTree("Lighthouse")
        ),
        Lists.newArrayList(3, 5, 6)));
    cards.add(new CommerceCard("Vineyard",
        Age.II,
        new ArrayList<>(),
        Lists.newArrayList(new NeighborGather(NType.RawCoin)),
        Lists.newArrayList(3, 6)));
    cards.add(new CommerceCard("Bazar",
        Age.II,
        new ArrayList<>(),
        Lists.newArrayList(new NeighborGather(NType.RawCoin)),
        Lists.newArrayList(4, 7)));

    cards.add(new MilitaryCard("Walls",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Stone, 3)),
        Lists.newArrayList(new ShieldPoint(2),
            new TechTree("Fortifications")),
        Lists.newArrayList(3, 7)));
    cards.add(new MilitaryCard("Stables",
        Age.II,
        Lists.newArrayList(new RawMaterial(RType.Clay),
            new RawMaterial(RType.Lumber),
            new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(2)),
        Lists.newArrayList(3, 5)));
    cards.add(new MilitaryCard("Archery Range",
        Age.II,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(2)),
        Lists.newArrayList(3, 6)));

    cards.add(new MilitaryCard("Training Ground",
        Age.II,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber),
            new RawMaterial(RType.Ore, 2)),
        Lists.newArrayList(new ShieldPoint(2),
            new TechTree("Circus")),
        Lists.newArrayList(4, 6, 7)));

    cards.add(new ScienceCard("Dispensary",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Glass),
            new RawMaterial(RType.Ore, 2)),
        Lists.newArrayList(new Science(SType.Ruler),
            new TechTree("Arena"),
            new TechTree("Lodge")),
        Lists.newArrayList(3, 4)));
    cards.add(new ScienceCard("Laboratory",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus),
            new RawMaterial(RType.Clay, 2)),
        Lists.newArrayList(new Science(SType.Gear),
            new TechTree("Siege Workshop"),
            new TechTree("Observatory")),
        Lists.newArrayList(3, 5)));
    cards.add(new ScienceCard("Library",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Loom),
            new RawMaterial(RType.Stone, 2)),
        Lists.newArrayList(new Science(SType.Tablet),
            new TechTree("Senate"),
            new TechTree("University")),
        Lists.newArrayList(3, 6)));
    cards.add(new ScienceCard("School",
        Age.II,
        Lists.newArrayList(new ManufacturedGood(MType.Papyrus),
            new RawMaterial(RType.Lumber, 2)),
        Lists.newArrayList(new Science(SType.Tablet)),
        Lists.newArrayList(3, 7)));

    //Age III
    cards.add(new StructureCard("Pantheon",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2),
            new RawMaterial(RType.Ore),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Loom),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new VictoryPoint(7)),
        Lists.newArrayList(3, 6)));
    cards.add(new StructureCard("Gardens",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Clay, 2),
            new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new VictoryPoint(5)),
        Lists.newArrayList(3, 4)));
    cards.add(new StructureCard("Town Hall",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Stone, 2),
            new RawMaterial(RType.Ore),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new VictoryPoint(6)),
        Lists.newArrayList(3, 5, 6)));

    cards.add(new StructureCard("Palace",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Stone),
            new RawMaterial(RType.Lumber),
            new RawMaterial(RType.Ore),
            new RawMaterial(RType.Clay),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Loom),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new VictoryPoint(8)),
        Lists.newArrayList(3, 7)));
    cards.add(new StructureCard("Senate",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore),
            new RawMaterial(RType.Stone)),
        Lists.newArrayList(new VictoryPoint(6)),
        Lists.newArrayList(3, 5)));

    cards.add(new CommerceCard("Haven",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Ore),
            new RawMaterial(RType.Lumber),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new CoinVP(VPType.RAW_MATERIAL)),
        Lists.newArrayList(3, 4)));
    cards.add(new CommerceCard("Lighthouse",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new CoinVP(VPType.COMMERCE)),
        Lists.newArrayList(3, 6)));
    cards.add(new CommerceCard("Chamber of Commerce",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 2),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new CoinVP(VPType.MANUFACTURED_GOOD)),
        Lists.newArrayList(4, 6)));

    cards.add(new CommerceCard("Arena",
        Age.III,
        Lists.newArrayList(new RawMaterial(RType.Ore),
            new RawMaterial(RType.Stone, 2)),
        Lists.newArrayList(new CoinVP(VPType.WONDER)),
        Lists.newArrayList(3, 5, 7)));

    cards.add(new MilitaryCard("Fortifications",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone),
            new RawMaterial(RType.Ore, 3)),
        Lists.newArrayList(new ShieldPoint(3)),
        Lists.newArrayList(3, 7)));
    cards.add(new MilitaryCard("Circus",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone, 3),
            new RawMaterial(RType.Ore)),
        Lists.newArrayList(new ShieldPoint(3)),
        Lists.newArrayList(4, 5, 6)));
    cards.add(new MilitaryCard("Arsenal",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new ShieldPoint(3)),
        Lists.newArrayList(3, 4, 7)));
    cards.add(new MilitaryCard("Siege Workshop",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 3),
            new RawMaterial(RType.Lumber)),
        Lists.newArrayList(new ShieldPoint(3)),
        Lists.newArrayList(3, 5)));

    cards.add(new ScienceCard("Lodge",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 2),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Ruler)),
        Lists.newArrayList(3, 6)));
    cards.add(new ScienceCard("Observatory",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Ore, 2),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Gear)),
        Lists.newArrayList(3, 7)));
    cards.add(new ScienceCard("University",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Tablet)),
        Lists.newArrayList(3, 4)));
    cards.add(new ScienceCard("Academy",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone, 3),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new Science(SType.Ruler)),
        Lists.newArrayList(3, 7)));
    cards.add(new ScienceCard("Study",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new Science(SType.Gear)),
        Lists.newArrayList(3, 5)));

    // Guilds
    cards.add(new GuildCard("Workers Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber),
            new RawMaterial(RType.Ore, 2),
            new RawMaterial(RType.Clay),
            new RawMaterial(RType.Stone)),
        Lists.newArrayList(new NeighborGather(NType.BROWN_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Craftmens Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Ore, 2),
            new RawMaterial(RType.Stone, 2)),
        Lists.newArrayList(new NeighborGather(NType.GREY_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Traders Guild",
        Age.III,
        Lists.newArrayList(
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Loom),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new NeighborGather(NType.YELLOW_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Philosophers Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 3),
            new ManufacturedGood(MType.Papyrus),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new NeighborGather(NType.GREEN_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Spy Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Clay, 3),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new NeighborGather(NType.RED_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Strategy Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Ore, 2),
            new RawMaterial(RType.Stone),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new NeighborGather(NType.WAR_DEFEAT_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Shipowners Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 3),
            new ManufacturedGood(MType.Glass),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new NeighborGather(NType.BROWN_GREY_PURPLE_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Scientists Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 2),
            new RawMaterial(RType.Ore, 2),
            new ManufacturedGood(MType.Papyrus)),
        Lists.newArrayList(new NeighborGather(NType.GREEN_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Magistrates Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Lumber, 3),
            new RawMaterial(RType.Stone),
            new ManufacturedGood(MType.Loom)),
        Lists.newArrayList(new NeighborGather(NType.BLUE_VP)),
        new ArrayList<>()));
    cards.add(new GuildCard("Builder Guild",
        Age.III,
        Lists.newArrayList(
            new RawMaterial(RType.Stone, 2),
            new RawMaterial(RType.Clay, 2),
            new ManufacturedGood(MType.Glass)),
        Lists.newArrayList(new NeighborGather(NType.WONDER_VP)),
        new ArrayList<>()));

    return cards;
  }
}
