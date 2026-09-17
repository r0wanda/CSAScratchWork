import java.util.Scanner;

public class XCTeam {
   public static void main(String[] args) {
      String teamName = "Ballard Cross Country";
      boolean seasonHasStarted = true;
      int numberOfUpperClassMen = 37;
      int numberOfRunners = 102;
      int numberOfLowerClassMen;
      int maxTime = 30;
      int minTime = 16;
      double medTime;
      String coolestRunner;
      
      numberOfLowerClassMen = numberOfRunners - numberOfUpperClassMen;
      medTime = (maxTime + minTime) / 2.0;
      System.out.println("Team name: " + teamName);
      System.out.println("Has the season started: " + seasonHasStarted);
      System.out.print("Number of upperclassmen: " + numberOfUpperClassMen);
      System.out.print(", number of lowerclassmen: " + numberOfLowerClassMen);
      System.out.println(", total: " + numberOfRunners);
      System.out.println("Median race time: " + medTime);
      System.out.println("Who is the coolest runner?");
      Scanner scan = new Scanner(System.in);
      teamName = scan.nextLine();
      System.out.println("The coolest runner is.... " + teamName + "!");
      scan.close();
   }
}