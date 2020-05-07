package firstTask;
import java.util.Scanner;


public class Long {
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);

        char choice;

        do
        {
            System.out.println("Help on : ");
            System.out.println("1.  что бы получить формулу квадратных уравнений");
            System.out.println("2. что бы получить формулу бинома ньютона");
            System.out.println("3. что бы получить формулу польской нотации ");

            System.out.println("Выберите что то из этого  : ");
            choice = scan.next().charAt(0);
        }while(choice < '1' || choice > '3');

        System.out.println("\n");

        switch(choice)
        {
            case '1' :
                double a, b, c;
                double D;
                System.out.println("Программа решает квадратное уравнение вида:");
                System.out.println("ax^2 + bx + c = 0");
                System.out.println("Введите a, b и c:");
                a = scan.nextDouble();
                b = scan.nextDouble();
                c = scan.nextDouble();

                System.out.println("Программа решает квадратное уравнение вида:");
                System.out.println("ax^2 + bx + c = 0");
                System.out.println("Введите a, b и c:");
                D = b * b - 4 * a * c;
                if (D > 0) {
                    double x1, x2;
                    x1 = (-b - Math.sqrt(D)) / (2 * a);
                    x2 = (-b + Math.sqrt(D)) / (2 * a);
                    System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
                }
                else if (D == 0) {
                    double x;
                    x = -b / (2 * a);
                    System.out.println("Уравнение имеет единственный корень: x = " + x);
                }
                else {
                    System.out.println("Уравнение не имеет действительных корней!");
                }
                break;

            case '2' :
                int r ;
                int bit = scan.nextInt();
                int bid = scan.nextInt();

                int result = Fact(bit,bid);
                System.out.println(result);


                break;

            case '3' :
                System.out.println("Обратная польская нотация — это форма записи математических выражений, в которой операторы расположены после своих операндов.:\n");
                break;


        }

    }
    public static int Fact(int n , int k ) {
        if (k>n/2) k=n-k;
        if (k==1)  return n;
        if (k==0)  return 1;
        int r=1;
        for (int i=1; i<=k;++i) {
            r*=n-k+i;
            r/=i;
        }
        return r;
    }
}