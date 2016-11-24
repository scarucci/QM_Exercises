import java.util.Scanner;

class loopw {

  public static void main(String[] p) { // main method including sub-method

    whileloop();
    getBirdName();
    getNumberSeen();
    System.exit(0);

  }

  public static void whileloop() {

    String nameWithHighestCount = " ";
    int highestValueName = 0;

    String name;
    int number;

    boolean forceAsking = true;

    System.out.println("What bird have you spotted? ");
    name = getBirdName();

    while (!name.equals("END")) { // start checking user input

      System.out.println("How many times have you seen this bird?");
      number = getNumberSeen();

      if (number>highestValueName){
        nameWithHighestCount = name;
        highestValueName = number;
      }

      System.out.println("What bird have you spotted? ");
      name = getBirdName();
    }

    System.out.println("You have spotted "+nameWithHighestCount+" "+highestValueName+" times"); // once END is recognised, prints statement with bird spotted most times

    }

    public static String getBirdName(){ // obtains bird name through scanner method

      Scanner scanner = new Scanner(System.in);
      String name = scanner.nextLine();
      return name;

    }

    public static int getNumberSeen(){ // scans for number of times bird has been spotted
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      return number;
    }
}
