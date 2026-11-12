public class FindMinimum {
   public static int findMin() {
      int min = 100;
      for (int i = 0; i < 10; i++) {
         int n = (int)(Math.random() * 100);
         if (n < min) min = n;
      }
      return min;
   }
   public static void main(String args[]) {
      System.out.println(findMin());
   }
}