package resources;

public class Age extends Resource {

  public Age(AGE age) {
    super(age.toString());
    this.age = age;
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
