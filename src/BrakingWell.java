public class BrakingWell {

    public static double dist(double v, double mu) {    // suppose reaction time is 1
        // your code
        return Math.pow(v*10/36, 2)/(2*mu*9.81) + v*10/36;
    }
    public static double speed(double d, double mu) {   // suppose reaction time is 1
        // your code
        return (-1 + Math.sqrt(1 + (4 * d)/(2*mu*9.81)))*mu*9.81*3.6;
    }

    public static void main(String[] args) {
        System.out.println(dist(100, 0.7));
        System.out.println(speed(83.9598760937531, 0.7));
    }
}
