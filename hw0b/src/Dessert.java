public class Dessert {
  int flavor;
  int price;
  public static int numDesserts;

  public Dessert(int f, int p) {
    flavor = f;
    price = p;
    numDesserts += 1;
  }

  public void printDessert() {
    System.out.println(flavor + " " + price + " " + numDesserts);
  }

  public static void main(String[] args) {
    System.out.println("I love dessert!");
  }
}
