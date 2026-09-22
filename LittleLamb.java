public class LittleLamb {
   public static void main(String[] args) {
      System.out.print("Mary had a ");
      marysPet("Honey-baked ham");
      marysPet("Honey-baked ham");
      marysPet("Honey-baked ham", ".");
   }
   public static void marysPet(String name, String punc) {
      System.out.print(name + punc);
   }
   public static void marysPet(String name) {
      System.out.print(name + ", ");
   }
}