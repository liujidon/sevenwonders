package resources;

public class Age extends Resource {

  public Age(AGE age) {
    super(age.toString());
    this.age = age;
  }

  public enum AGE {
    I,
    II,
    III
  }

  private AGE age;

  public AGE getAge() {
    return age;
  }

  /**
   * Can not be added
   */
  public boolean add(Resource other) {
    return false;
  }
}
