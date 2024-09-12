package sieveOfEratsthenesExample;

import java.util.Arrays;




public class  SieveOfEratosthenes {


        public static void sieveOfEratosthenes(int n) {
            // n + 1 elemanlı bir boolean dizisi oluşturuyoruz.
            // Başta tüm değerler true olarak işaretleniyor.
            boolean[] prime = new boolean[n + 1];

            Arrays.fill(prime, true); // Tüm elemanları true yapıyoruz.

            for (int p = 2; p * p <= n; p++) {
                // Eğer prime[p] hala true ise, p bir asal sayıdır.
                if (prime[p]) {
                    // p'nin tüm katlarını işaretleyelim, asal değil (false) yapalım.
                    for (int i = p * p; i <= n; i += p) {
                        prime[i] = false;
                    }
                }
            }

            // Asal sayıları ekrana yazdırma
            System.out.println("Asal sayılar:");
            for (int i = 2; i <= n; i++) {
                if (prime[i]) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            int n = 50; // n sayısına kadar olan asal sayıları bulmak için
            sieveOfEratosthenes(n);
        }
    }

