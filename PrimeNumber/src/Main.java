public class Main {
    private static int n;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            if (estPremier(i)){
                System.out.println(i);
            }
        }
        System.out.println("-------------------------");

        long endTime = System.currentTimeMillis();
        System.out.println("Simulation terminée !");
        System.out.println("Temps total de simulation : " + (endTime - startTime) / 1000.0 + " secondes.");
    }

    public static boolean estPremier(int n){
        if( n== 0 || n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for(int i = 3; i < n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
