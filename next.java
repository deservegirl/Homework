package firstTask;
import java.util.Scanner;
public class next {



        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int a[] = new int[num];

            for (int i = 0; i < num; i++) {
                a[i] = s.nextInt();

            }

            for (int i = (num / 2) - 1; i >= 0; i--) {
                System.out.println(a[i]);
            }
            for (int i = num - 1; i >= 0; i--) {
                if ( i>(num/2)-1 ){
                    System.out.println(a[i]);
                }
            }

        }
    }


