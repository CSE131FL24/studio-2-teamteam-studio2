package studio2;

public class Pi {

 public static void main(String[] args) {
  int numThrows = 10000;

        int dartsInCircle = 0;

        for (int i = 0; i < numThrows; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt(x * x + y * y);

            if (distance <= 1) {
                dartsInCircle++;
            }
        }

        double piEstimate = 4.0 * dartsInCircle / numThrows;

        System.out.println("Estimated value of Pi: " + piEstimate);
    }

}