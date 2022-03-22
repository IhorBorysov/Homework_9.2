import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            summTwoChsel();
        }catch (InputMismatchException a) {
            a.printStackTrace();
        }
    }
        public static void summTwoChsel() throws InputMismatchException{
            int a;
            int b;
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Введіть перше число: ");
                a = scan.nextInt();
            }catch (Exception exception){
                throw new InputMismatchException("Ви ввели не коректне число!");
            }
            try{
                System.out.println("Введіть друге число: ");
                b = scan.nextInt();
            }catch (Exception exception){
                throw new InputMismatchException("Ви ввели не коректне число!");
            }
              System.out.println("Cума двох чисел = "+(a+b));

        }
}
