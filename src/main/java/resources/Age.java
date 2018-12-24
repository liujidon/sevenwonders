package resources;

public class Age extends Resource {

  public Age(String name) {
    super(name);
  }

  public static enum AGE {
    I,
    II,
    III
  };

  private AGE age = AGE.I;

  public AGE getAge() {
    return age;
  }
}
