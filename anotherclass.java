package firstTask;

import java.util.Scanner;

    public class anotherclass  {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int k = s.nextInt();
            int c = minFunction(n, k);
            System.out.println(c );

        }

        /* Возвращает минимум из двух чисел */
        public static int minFunction(int n1, int n2) {
            return n1 & ~(1 << (n2 - 1)) ;
        }
    }

