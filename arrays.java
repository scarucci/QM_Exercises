import java.util.Scanner;

class arrays {

  public static void main(String[] p){

  Loop();
  getAnimalCount();
  System.exit(0);

  }

  public static void Loop() {

    String highestCountName = " ";
    int highestValueName = 0;

    int animals_quest;

    String[] animals = {"Komodo Dragon", "Manatee", "Kakapo", "Florida Panther", "White Rhino"};
    int[] counting = new int[5];

    for (int k = 0; k < animals.length; k++) {
      System.out.print(k);
      System.out.print(", How many are left in the world?");

      animals_quest = getAnimalCount();

      counting[k] = animals_quest;

      if (animals_quest>highestValueName){
        highestCountName = animals[k];
        highestValueName = animals_quest;
      }
    }

    System.out.println("The most endangered animal is the "+highestCountName+".");
    System.out.println("There are only "+highestValueName+" left in the wild.");

    for (int k = 0; k<counting.length; k++){
      System.out.println(counting[k]+", "+animals[k]);
    }

  }

  public static int getAnimalCount(){
    Scanner scn = new Scanner(System.in);
    int animals_quest = scn.nextInt();
    return animals_quest;
  }

}
