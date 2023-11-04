import java.util.Scanner;

public final class Checks {
private Checks() { }
/**
 * This is the main method of the app.
 *
 * @param args Arguments passed to the application.
 */
public static void main(final String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the folowing data divided by commas"
+ " destination, # of travellers,"
+ " duration of your vacation in days");
String[] data = sc.nextLine().split(",");
sc.close();
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
Integer.parseInt(data[1]), Integer.parseInt(data[2])));
}
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
final String destination, final int nTravellers, final int duration) {
final int base2 = 1000;
int base = base2;
final int discount2 = 0;
double discount = discount2;
final int penalties2 = 0;
int penalties = penalties2;
if (destination.toLowerCase().equals("paris")) {
final int extra1 = 500;
base += extra1;
} else if (destination.toLowerCase().equals("new york city")) {
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
base += penalties;
if (discount > 0) {
double total = base - (base * discount);
return total;
}
return base;
}
}

