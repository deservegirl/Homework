package firstTask;

import java.util.*;
public class Three
{
    public static void main(String []args)

    {

        Scanner con = new Scanner(System.in);

        TreeSet<String> s = new TreeSet<String>();

        int tests = con.nextInt();

        for (int i = 0; i < tests; i++)

        {

            int n = con.nextInt();

            s.clear();

            for (int j = 0; j < n; j++)

            {

                String word = con.next();

                s.add(word);

            }

            System.out.println(s.size());

        }
    }
}
