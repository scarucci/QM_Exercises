import java.util.Scanner;

class forloops
{
        public static void main (String[] p)
        {
                int total = 0; // Initialising the number that is in 'total' at the begining
                int teammember; // declaration of the variable

                for (int k = 1; k<5; k++)
                {
                        System.out.println("What is the disability of Runner "+k+" ?");
                        total = total + getscore(); // Adding up the user input with the total from the previous run of the loop
                }
                if(validateScore(total)) {
                                System.out.println("This adds up to "+total+" so is legal");

                } else {
                                System.out.println("This adds up to "+total+ " so is not legal");

                }
        }
        public static int getscore ()
        {
                Scanner scanner = new Scanner(System.in);
                int teammember = scanner.nextInt(); // the number of the user input is score that is going to be written on the next line.
                return teammember; // returning the value of player0ne
        }
        public static boolean validateScore (int total)
        {
          if (total<=32) {
            return true;
          }
            else
          {
            return false;
          }
        }

}
