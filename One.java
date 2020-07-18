package firstTask;

import java.util.*;
public class One
{ public static void main(String[] args ){
    {
        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)

            arr[i] = con.nextInt();

        Arrays.sort(arr);

        int number = 0;

        for (int i = 0; i < n - 1; i++)

            if (arr[i] != arr[i + 1] )

                number++;

        System.out.println(number + 1);

    }
}
}