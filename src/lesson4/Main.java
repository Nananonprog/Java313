package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int n, kop;
//        System.out.println("Введите число от 1 до 99: ");
//        n = input.nextInt();
//        kop = n;
//        if(n >= 11 && n <=14){
//            System.out.println(n + "копеек");
//
//        }
//        else {
//            kop = kop % 10;
//            if (kop == 1 ){
//                System.out.println(n + "копейка");
//            }
//            else if(kop >= 2 && kop <= 4){
//                System.out.println(n + "копейки");
//            }else{
//                System.out.println(n + "копеек");
//            }
//        }

        // циклы
        /*
       while(условие){
        тело цикла;
       }
       Итерация - один шаг цикла
         */
//        int i = 0; // переменная счетчик
//        while (i < 5){ // условие
//            System.out.println("i = " + i);
//            i++; // шаг цикла


//        }
//
//        int count = 3;
//        int n;
//        int sum = 0;
//
//        while(count > 0){
//            System.out.println("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//            count--;
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int n, sum = 0;
//        while(input.hasNextInt() ){
//            System.out.println("Введите число: ");
//            n = input.nextInt();
//            sum += n;
//
//        }
//        System.out.println("Сумма введенных чисел: " + sum);

//        int i;
//        int b;
//        int sum = 0;
//        System.out.println("Введите начало диапазона: ");
//        i = input.nextInt();
//        System.out.println("Введите конец диапазона: ");
//        b = input.nextInt();
//        while (i <= b){
//
//            if(i % 2 != 0) {
//                System.out.println(i + " ");
//                sum += i;

//            }
//            i++;
//
//
//        }
//        System.out.println("Сумма нечетных чисел: " + sum);

//        int n, orient;
//        System.out.println("Количество символов: ");
//        n = input.nextInt();
//        String symbol;
//        System.out.print("Тип символа: ");
//        symbol = input.next();
//        System.out.print("0 - горизонтальная \n1 - вертикальная\nориентация линии: ");
//        orient = input.nextInt();
//
//        while(n > 0){
//            if(orient == 0){
//                System.out.print(symbol + " ");
//            }else{
//                System.out.println(symbol);
//            }
//            n--;

        int i = 1;
        int sum = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                sum += i;


            }
        }

    }
}