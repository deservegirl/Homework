package firstTask;
import java.util.Scanner;
public class Long {

        public static void main(String[] args) {
            System.out.println("введите 1 что бы получить формулу квадратных уравнений ");
            System.out.println("введите 2 что бы получить формулу бинома ньютона ");
            System.out.println("введите 3 что бы получить формулу польской нотации ");
            Scanner s = new Scanner(System.in) ;
            int bit = s.nextInt();
            if (bit==1){
                System.out.println(" ax^2 + bx + c = 0 ");
                System.out.println(" находим x .");
                System.out.println(" -b+корень d /(2*a)");

            }
            else if (bit==2){
                System.out.println("a^n+Cn*a^(n-1)*b+....Cn*a*b^(n-1)+b^n ");

            }
            else  if (bit==3){
                System.out.println("Обратная польская нотация — это форма записи математических выражений, в которой операторы расположены после своих операндов. \n" +
                        "\n");

            }
            else
                System.out.println("Фатальная ошибка , пользователь дурак .");
        }
    }


}
