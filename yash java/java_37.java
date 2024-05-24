public class java_37 {
    // // only for n>=2
    // public static boolean isPrime(int n) {

    // // corner case
    // // 2
    // if (n == 2) {
    // return true;
    // }

    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) { // completely dividing
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String[] args) {
    // System.out.println(isPrime(3));
    // }

    public static boolean isPrime(int n) {
    if (n == 2) {
    return true;
    }
    for (int i = 2; i < Math.sqrt(n); i++) {
    if (n % i == 0) {
    return false;
    }
    }
    return true;
    }

    // public static void main(String[] args) {
    // System.out.println(isPrime(12));
    // }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesInRange(20);
}
}
