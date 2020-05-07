package firstTask;

/**
 * Created by laierr on 15.04.2020.
 */

import java.util.Scanner;

public class Nrw  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int bit = s.nextInt();
        int result = minFunction(bit);
        System.out.println(result );

    }

    public static int minFunction(int n, int k) {
        return -~((n-~(n^(n+1))/2)^(n-~(n^(n+1))/2+1))/2  ;
    }
}

