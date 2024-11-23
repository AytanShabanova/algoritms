package eulerfunctionExample;

public class EulerFunctionExample {
    public static int eulerTotient(int n) {
        int result = n; // başlangıcda nəticə n-ə bərabərdir

        // 2-dən başlayaraq bütün prime faktorları yoxlayırıq
        for (int p = 2; p * p <= n; p++) {
            // Əgər p n-in bölənidirsə
            if (n % p == 0) {
                // Bu prime faktoru tam bölənlərdən çıxardırıq
                while (n % p == 0) {
                    n /= p;
                }
                // Euler funksiyasını uyğun olaraq yeniləyirik
                result -= result / p;
            }
        }

        // Əgər n 1-dən böyük prime faktora malikdirsə
        if (n > 1) {
            result -= result / n;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Euler's Totient Function for " + n + " is: " + eulerTotient(n));
    }



}
