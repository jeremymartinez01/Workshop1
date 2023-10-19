import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the folowing data divided by commas"
        		+ " destination, # of travellers, duration of your vacation in days");
        String data[]= sc.nextLine().split(",");
        sc.close();

        if(data.length<3) {
        	System.out.println(-1+ "Be sure that you entered 3 words separated by commas");
        }else if(!(data[0] instanceof String)) {
        	System.out.println(-1+ "Looks like your 1st argument inst a word");
        }else if(!(Integer.valueOf(data[1]) instanceof Integer)){
        	System.out.println(-1+ "Looks like your 2nd argument isnt a number");
        }else if(!(Integer.valueOf(data[2]) instanceof Integer)){
        	System.out.println(-1+ "Looks like your 3rd argument isnt a number");
        }else if(Integer.valueOf(data[2])<0) {
        	System.out.println(-1+ "Looks like your 3rd number is negative");
        }else if(Integer.valueOf(data[1])<0) {
        	System.out.println(-1+ "Looks like your 2nd number is negative");
        }else if(Integer.valueOf(data[1])>80){
			System.out.println(-1+ "We only accept groups up to 80 persons");
        }else{
        	System.out.println("Your total value is:"+ 
        	PackageCalculator(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2])));
        }
	}
	public static double PackageCalculator(String destination,int nTravellers,int duration) {
		int base =1000;
		double discount=0;
		int penalties=0;
		if(destination.toLowerCase().equals("paris")){
			base+=500;
		}else if(destination.toLowerCase().equals("new york city")) {
			base+=600;
		}
		if (nTravellers>4 && nTravellers<10) {
			discount+=0.1;
		}else if(nTravellers>10) {
			discount+=20;
		}
		if(duration<7) {
			penalties+=200;
		}else if(duration >30||nTravellers==2) {
			penalties-=200;
		}
		base+=penalties;
		if(discount>0) {
			double total= base-(base*discount);
					
			return total;
		}
		return base;
	}
}
