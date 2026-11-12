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
   class RowCol {
      public int sum;
      public ArrayList<ArrayList<Integer>> comb = new();
      public ArrayList<Spot> spots = new();
      public Elliot(int sum) {
         this.sum = sum;
      }
   }
   class Spot {
      public RowCol row;
      public RowCol col;
      public Spot(RowCol r, RowCol c) {
         row = r;
         col = c;
      }
      //ArrayList<ArrayList<Integer>> comb;
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
   static void print(ArrayList<RowCol> rows, ArrayList<RowCol> cols) {
      System.out.print("  |");
   }
   static void main() {
     int ys[] = {50, 86, 56, 48, 85};
     int xs[] = {63, 54, 50, 85, 73};
     ArrayList<RowCol> rows = new();
     ArrayList<RowCol> cols = new();
     for (int i = 0; i < 5; i++) {
         cols.add(new RowCol(ys[i]));
     }
     for (int i = 0; i < 5; i++) {
       rows.add(new RowCol(xs[i]));
       for (int j = 0; j < 5; j++) {
            Spot s = new Spot(rows.get(i), cols.get(j));
            rows.get(i).spots.add(s);
            cols.get(j).spots.add(s);
       }
     }
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