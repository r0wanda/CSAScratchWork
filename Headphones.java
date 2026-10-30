public class Headphones {
   public static void main(String[] args) {
      Headphones sonys = new Headphones();
      sonys.volumeUp(10);
      System.out.println(sonys.howLoudIsIt());
   }
   public Headphones() {
      volume = 5;
   }
   public int volume;
   public int volumeUp(int howMuch) {
      volume += howMuch;
      return volume;
   }
   public String howLoudIsIt() {
      if (volume > 5) return "TOO LOUD";
      else return "too quiet";
   }
}