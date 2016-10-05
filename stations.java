/* AUTHOR: Simon Carucci - Station finder */

import java.util.Scanner; // import scanner

class stations {


public static void main (String[] p) {

  String stations = parser(); // String that calls the method parser and returns the users_station value
  results(stations); // prints out the result depending on users_station
  System.exit(0); // quit application


}

public static String parser() { // parsing method with if/else statements

  Scanner scanner = new Scanner(System.in); // scanner necessary to ask questions about the stations

  String users_station;

  System.out.println("Hey, what station do you need the zone of?");
  users_station = scanner.nextLine();

  return users_station;

 }

 public static void results(String users_station) {

   if (users_station.equals("Mile End")) { // beginning of if / else statement
     System.out.println("Mile End is in Zone 2");
   }
   else if (users_station.equals("Liverpool Street")) { // else if statement
     System.out.println("Liverpool Street is in Zone 1");
   }
   else if (users_station.equals("Woodford")) {
     System.out.println("Woodford is in Zone 4");
   }
   else {
     System.out.println(users_station + "?" + " Are you sure that is an underground station?");
   } // end if / else statement

   return;

 }

}
