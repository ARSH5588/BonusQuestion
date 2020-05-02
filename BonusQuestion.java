
public class BonusQuestion {
  public static void main(String[] args) {

    Myname name = new Myname("Arshjit");
    System.out.println("My name is " + name.getMyname());

  }
}
class Myname {
  String name = "Arshjit";

  public Myname(String n) {
    name = n;
  }
  public void setMyname(String n) {
    name = n;
  }
  public String getMyname() {
    return name;
  }
}
