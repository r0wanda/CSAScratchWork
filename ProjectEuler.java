public class ProjectEuler {
   public static void main(String[] args) {
      System.out.println("The answer to problem 0 (signup) is " + problem0(970000));
       System.out.println("The answer to problem 1 is " + problem1());
       System.out.println("The answer to problem 2 is " + problem2());
       System.out.println("The answer to problem 3 is " + problem3());
       System.out.println("The answer to problem 4 is " + problem4());
   }
   public static long problem0(int n) {
      long sum = 0;
      for (int i = 1; i <= n; i++) {
         long sq = (long)i * i;
         if (sq % 2 != 0) sum += sq;
      }
      return sum;
   }
   public static int problem1() {
      int sum = 0;
      for (int i = 1; i < 1000; i++) {
         if (i % 3 == 0 || i % 5 == 0) sum += i;
      }
      return sum;
   }
   public static int problem2() {
      int sum = 0;
      int a = 1;
      int b = 2;
      while (b < 4000000) {
         if (b % 2 == 0) sum += b;
         int c = a + b;
         a = b;
         b = c;
      }
      return sum;
   }
   public static boolean isPrime(long n) {
      long max = (long) Math.sqrt(n) + 1;
      for (int x = 2; x < max; x++) {
         if (n % x == 0) {
             return false;
         }
      }
      return true;
   }
   public static long problem3() {
      long n = 600851475143L;
      long max = (long) Math.sqrt(n) + 2;
       System.out.println(max);
      long i = 1;
      long big = 0;
      while (++i < max) {
         if (n % i != 0) continue; // not factor
         long max1 = (long) Math.sqrt(i) + 2;
         long y = 0;
         if (isPrime(n / i)) y = n / i;
         else if (isPrime(i)) y = i;
         else continue;
         if (y > big) {
            big = y;
         }
      }
      return big;
   }
   public static long problem4() {
      long big = 0;
      for (int x = 1; x < 1000; x++) {
         for (int y = 1; y < 1000; y++) {
            long z = x * y;
            String s = String.valueOf(z);
            if ((new StringBuilder(s).reverse().toString()).equals(s) && z > big) big = z;
         }
      }
      return big;
   }
}