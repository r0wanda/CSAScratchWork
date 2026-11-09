import java.util.ArrayList;
import java.util.List;

/*
  50 86 56 48 85
63
54
50
85
73
*/
class Elliot {
   class Spot {
      
   }
   static ArrayList<ArrayList<Integer>> comb = new ArrayList<ArrayList<Integer>>();
   static int k = 5;
   static int max = 25;
   static void bt(int start, List<Integer> current) {
        // Base case: if the combination reached the fixed length k
        if (current.size() == 5) {
            comb.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= max - (k - current.size()); i++) {
            current.add(i + 1); // Choose
            bt(i + 1, current); // Explore
            current.remove(current.size() - 1); // Unchoose
        }
    }

   static void main() {
     int xs[] = {50, 86, 56, 48, 85};
     int ys[] = {63, 54, 50, 85, 73};
     int v = 50;
     bt(0, new ArrayList<>());
     for (int i = 0; i < comb.size(); i++) {
         int sum = 0;
         for (int j = 0; j < k; j++) {
            sum += comb.get(i).get(j);
         }
         if (sum == v) {
            System.out.println(comb.get(i) + ": " + v);
         }
     }
     System.out.println(comb.size());
   }

}