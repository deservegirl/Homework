package firstTask;

/**
 * Created by laierr on 18.07.2020.
 */
import java.util.*;

public class two {




        public static void main(String []args)

        {

            Scanner con = new Scanner(System.in);

            TreeSet<String> s = new TreeSet<String>();

            int n = con.nextInt();

            for(int i = 0; i < n; i++)

                s.add(con.next());

            for(String st : s)

                System.out.println(st);

        }


}
