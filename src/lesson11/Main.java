package lesson11;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res = getFactorial(5);
        System.out.println(res);
    }
//        try {
//            int[] numbers = new int[3];
//            numbers[4] = 9;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Введен некорректный индекс");
//        }

//        Scanner input = new Scanner(System.in);
//try {
//
//
//    System.out.println("Введите первое число: ");
//    int a = input.nextInt();
//    System.out.println("Введите второе число: ");
//    int b = input.nextInt();
//    System.out.println(a / b);
//}catch (InputMismatchException | ArithmeticException e){
//    System.out.println("Вы ввели не целое число или делить на 0 нельзя");
//}finally {
//    System.out.println("Конец программы");
//}

//}catch (InputMismatchException e){
//    System.out.println("Вы ввели не целое число");
//}
//catch (ArithmeticException e){
//    System.out.println("Делить на 0 нельзя");
//}
        public static int getFactorial(int num){
        int res = 1;
        try{
            if(num < 1){
               throw new Exception("Число меньше 1 указывать нельзя");
            }

            for (int i = 1; i <= num; i++) {
                res *= 1;

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            res = num;
        }
            return res;
        }

    }
