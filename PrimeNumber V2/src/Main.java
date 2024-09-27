public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder primes = new StringBuilder();

        for (int i = 0; i < 100000000; i++) {
            if (estPremier(i)) {
                primes.append(i).append("\n");
            }
        }

        System.out.println(primes.toString());
        System.out.println("-------------------------");

        long endTime = System.currentTimeMillis();
        System.out.println("Simulation terminée !");
        System.out.println("Temps total de simulation : " + (endTime - startTime) / 1000.0 + " secondes.");
    }

    public static boolean estPremier(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int limite = (int) Math.sqrt(n);
        for (int i = 3; i <= limite; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
