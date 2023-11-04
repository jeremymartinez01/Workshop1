import java.util.Scanner;

public final class Checks {
private Checks() { }
/**
 * This is the main method of the app.
 *
 * @param args Arguments passed to the application.
 */
public static void main(final String[] args) {
Scanner sc = new Scanner(System.in); // NOPMD by jeremymartinez, the scanner is later closed on 11/4/23, 15:56 PM
System.out.println("Enter the folowing data divided by commas"
+ " destination, # of travellers,"
+ " duration of your vacation in days");
String[] data = sc.nextLine().split(",");
final int minimun = 3;
final int maximunP = 80;
if (data.length < minimun) {
System.out.println(-1 + "Be sure that you"
+ " entered 3 words separated by commas");
} else if (!(data[0] instanceof String)) {
System.out.println(-1 + "Looks like your 1st argument inst a word");
} else if (!(Integer.valueOf(data[1]) instanceof Integer)) {
System.out.println(-1 + "Looks like your 2nd argument isnt a number");
} else if (!(Integer.valueOf(data[2]) instanceof Integer)) {
System.out.println(-1 + "Looks like your 3rd argument isnt a number");
} else if (Integer.valueOf(data[2]) < 0) {
System.out.println(-1 + "Looks like your 3rd number is negative");
} else if (Integer.valueOf(data[1]) < 0) {
System.out.println(-1 + "Looks like your 2nd number is negative");
} else if (Integer.valueOf(data[1]) > maximunP) {
System.out.println(-1 + "We only accept groups up to 80 persons");
} else {
System.out.println("Your total value is:"
+ packageCalculator(data[0],
Integer.parseInt(data[1]), Integer.parseInt(data[2]),sc));
}
sc.close();
}
/**
 * This is the packageCalculator method of the app.
 *
 * @param destination is the final destination of the package.
 * @param nTravellers is the number of people going in the trip.
 * @param duration is the length of their vacation in days.
 * @return the total value of the package
 */
public static double packageCalculator(
final String destination, final int nTravellers, final int duration, Scanner sc) {
final int base2 = 1000;
int base = base2;
final int discount2 = 0;
double discount = discount2;
final int penalties2 = 0;
int penalties = penalties2;
if ("paris".equals(destination.toLowerCase())) {
final int extra1 = 500;
base += extra1;
} else if ("new york city".equals(destination.toLowerCase())) {
final int extra2 = 600;
base += extra2;
}
final int n1 = 4;
final int n2 = 10;
if (nTravellers > n1 && nTravellers <  n2) {
final double dis = 0.1;
discount += dis;
} else if (nTravellers > n2) {
final double dis = 0.2;
discount += dis;
}
final int d1 = 7;
final int d2 = 30;
final int n3 = 2;
if (duration < d1) {
final int p1 = 200;
penalties += p1;
} else if (duration  > d2 || nTravellers == n3) {
final int p2 = 200;
penalties -= p2;
}
double addOnsCost = calculateAddOnsCost(nTravellers,sc);

base += penalties;
if (discount > 0) {
double total = base - (base * discount);
return total + addOnsCost;
}
return base + addOnsCost;
}
/**
 * This is the calculateAddOnsCost method of the app.
 *
 * @param nTravellers is the number of people going in the trip.
 * @return the total value of the AddOns based on the amounnt of travelers
 * and the option selected
 */
public static double calculateAddOnsCost(int nTravellers, Scanner sc) {
     double totalAddOnsCost = 0;

     System.out.println("Select add-ons:");
     System.out.println("1. All-Inclusive Package - $200 per traveler");
     System.out.println("2. Adventure Activities Package - $150 per traveler");
     System.out.println("3. Spa and Wellness Package - $100 per traveler");
     System.out.println("0. No add-ons");

     while(true) {
     System.out.print("Enter the number of the add-on (0, 1, 2, 3): ");
     int choice = Integer.parseInt(sc.nextLine());
     if (choice == 0) {
         return 0;
     }
     double addOnCost = 0;
     switch (choice) {
         case 1:
             addOnCost = 200;
             break;
         case 2:
             addOnCost = 150;
             break;
         case 3:
             addOnCost = 100;
             break;
         default:
        	 System.out.println("Invalid choice."+ " Please select a valid add-on.");
     }
     totalAddOnsCost += nTravellers * addOnCost;
     return totalAddOnsCost;   
     }
}
}

