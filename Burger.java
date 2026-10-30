public class Burger {
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int bites;
   public Burger() {
      bites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 30.0;
      burgerName = "Royale with Cheese";
   }
   public Burger(int numPatties, boolean isTasty, double sauce, String name) {
      bites = 0;
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      gramsOfSauce = sauce;
      burgerName = name;
   }
   public void bite() {
      System.out.println("chomp");
      bites++;
   }
   public int getBites() {
      return bites;
   }
   public static String getRecipe() {
      return "buns ketchup pickle cheese put the patty in between";
   }
   public static void main(String[] args) {
      Burger b1 = new Burger();
      Burger b2 = new Burger(1, false, 0.0, "mondo burger");
      
      b1.bite();
      System.out.println("bites: " + b1.getBites());
      System.out.println(Burger.getRecipe());
   }
}