package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter start amount: ");
        double startAmount = scan.nextDouble();
        System.out.println("Please enter win chance: ");
        double winChance = scan.nextDouble();
        System.out.println("Please enter win limit: ");
        double winLimit = scan.nextDouble();
        System.out.println("Please enter total simulations: ");
        int totalSimulations = scan.nextInt();
    	int ltimes = 0;
        for (int i = 1; i<=totalSimulations; i++) {
        	int times = 0;
        	double amount = startAmount;
	        while(amount < winLimit && amount > 0) {
	        	times ++;
	        	double randomValue = Math.random();
	            if (randomValue < winChance) {
	            	amount += 1;
	            } else {
	            	amount -= 1;
	            }
	        }
	        
	        String status;
	        if (amount > 0) {
	        	status = " WIN";
	        }
	        else {
	        	status = " LOSE";
	        	ltimes++;
	        }
	        System.out.println("Simulation " + i + ": " + times + status);
        }
        double simurr = ltimes / (double) totalSimulations;
        double alpha = (1.0-winChance) / winChance;
        double exprr;
        if (winChance == 0.5) {
        	exprr = 1.0 - startAmount / winLimit;
        } else {
        	exprr = (Math.pow(alpha,startAmount) - Math.pow(alpha,winLimit)) / (1.0-Math.pow(alpha,winLimit));
        }
        System.out.println("Ruin Rate from Simulation: " + simurr +" Expected Ruin Rate: " + exprr);
        
	}

}
