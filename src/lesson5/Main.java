package lesson5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


    /*
    do (
    тело цикла)
    }while(условие);
     */
//       int i = 0;
//        do {
//            System.out.println("i = " + i);
//            i++;
//
//        } while (i > 5);{

        Scanner input = new Scanner(System.in);
//        int i;
//        int count = 0;
//        int sum = 0;
//        double average;
//        do {
//            System.out.println("Введите число: ");
//            i = input.nextInt();
//            if(i <0){
//                sum += i;
//                count++;
//
//            }
//        }while (i != 0 );
//        average = (double) sum/count;
//        System.out.printf("Среднее арифметическое: %.2f ", average);

//        int number, copy, reverse_number=0, i;
//        System.out.println("Введите число: ");
//        number = input.nextInt();
//        copy = number;
//        do{
////            i = copy % 10;
//////            reverse_number = i * 10;
////           reverse_number = reverse_number * 10 + i;
//           reverse_number *= 10;
//           reverse_number += copy % 10;
//            copy /= 10;
//
//        }while(copy > 0);
//        System.out.println(reverse_number);
//        System.out.println("Число " + number + (number == reverse_number ? " " : " не ") +  "палиндром");

//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен");

//        int i = 0;
//        do {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }
//        while (i < 10);
//        System.out.println("Цикл завершен");

//        int i = 0;
//        while (i < 10){
//            if(i == 3){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен");
//        int i = 0;
//       do{
//
//           if(i == 3){
//               i++;
//               continue;
//           }
//           System.out.println(i);
//           if(i == 5){
//               break;
//           }
//           i++;
//       }
//           while (i < 10);
//
//        System.out.println("Цикл завершен");

//        int i = 0;
//        while (true){
//            System.out.println(i);
//            if(i==5){
//                break;
//            }
//            i++;
//        }

//        int n, pr=1;
//        while (true){
//            System.out.println("Введите число: ");
//            n = input.nextInt();
//            if(n == 0){
//                break;
//            }
//            pr *=n;
//
//        }
//        System.out.println("Произведение чисел " + pr);
//        int ch, min = Integer.MAX_VALUE, max = 0, sum=0, count =0;
//        do {
//            System.out.print("Введите число: ");
//            do {
//                ch = input.nextInt();
//
//                if (ch < 0) {
//                    System.out.print("Вы ввели отриуательное число");
//                }
//            } while (ch < 0);
//            if(ch < min && ch != 0){
//                min = ch;
//            }
//            if(ch > max){
//                max = ch;
//            }
//            sum += ch;
//            if(ch != 0){
//                count++;
//            }
//
//        }while(ch != 0);
//        if (sum != 0) {
//            System.out.println("Минимальное число: " + min);
//            System.out.println("Максимальное число: " + max);
//            System.out.printf("Среднее арифметическое: %.2f", (double) sum / count);
//        }else{
//            System.out.println("Вы вводили только отрицательные числа");
//        }

//        int i = 1;
//        while (i < 5){
//            System.out.println("Внешний цикл: i = " + i);
//            int j = 1;
//            while (j < 4){
//                System.out.println("\tВнутренний цикл: j = " + j);
//                j++;
//            }
//            i++;
//        }
//        int i=1;
//        while(i < 10){
//            int j =1;
//            while (j<10){
//                System.out.print(i + " * " + j + "=" + i * j + "\t\t");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        int i = 0;
//        while(i < 5) {
//            int j = 0;
//            while(j<16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//
//                } else {
//                    System.out.println("-");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//       int i = 0;
//       while (i < 5){
//           int j = 0;
//           while (j < i) {
//               System.out.print(" ");
//               j++;
//           }
//           System.out.println("*");
//           i++;
//       }

        /*
        for(инициализация_перменной; условие){
         тело цикла;
        }
         */
//        for (int i = 0; i<5; i++){
//            System.out.println(i);
//        int count = 0;
//        for (int i = 0; i < 6; i++){
//            System.out.print("Количество симоволов: ");
//            if(input.hasNextInt()){
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Вы ввели чисел: " + count);
//        System.out.print("Количество симоволов: ");
//        int a = input.nextInt();
//        for (int i = 0; i < a; i++){
//
//            System.out.print("*");
//
//            }
//        System.out.print("Введите целое число: ");
//        int a = input.nextInt();
//        for (int i = 1; i <= a; i++){
//            if(a % i == 0){
//                System.out.print(i + " ");
//            }

//        for(int i = 10; i > 0; i--){
//            System.out.print(i + " ");
//
//        int i = 10;
//        for(;;){
//            System.out.println(i + " ");
//           if(i==90){
//               break;
//           }
//           i += 10;
//        }

//        int n, res = 1;
//        for(;true;){
//            System.out.println("-> ");
//            n = input.nextInt();
//
//            if(n == 0){
//                break;
//            }
//            res *= n;
//
//        }
//
//        System.out.println("Произведение введенных чисел: " + res);

//        for(int i = 5, a = 1;  i > 0; i--, a++){
//            System.out.println(a + ")Значение: " + i);
//        }
//
//        for(int i = 10; i <= 100; i++){
//            int tensDig = i/10;
//            int onesDig = i % 10;
//            if(tensDig == onesDig){
//                System.out.print(i + " ");
//            }
//        }
//        for(int i = 10; i <= 100; i++){
//            if(i/10 == i % 10){
//                System.out.print(i + " ");
//            }
//        }
//        for (int i = 0; i < 3; i++){
////            System.out.println("+++ = " + i);
////            for(int j = 0; j < 2; j++) {
////                System.out.println("---- = " + j);
//        int w, h;
//        System.out.print("Введите ширину прямоугольника: ");
//        w = input.nextInt();
//        System.out.print("Введите высоту прямоугольника: ");
//        h = input.nextInt();
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//      int size = 8;
//        for(int i = 0; i <size; i++){
//            for(int j = 0; j < size; j++) {
//                if(j <= i){
//                    System.out.println("*");
//                }
//
//            }
//            System.out.println();
//        }

//        int h = 3;
//        int w = h * 2 - 1;
//        int m = w / 2;
//        for (int i = 0, l = m, r = m; i < h; i++, r++, l--) {
//            for (int j = 0; j < w; j++) {
//                if (j >= l && j <= r) {
//                    System.out.print("*");
//                } else {
//                    System.out.println("-");
//                }
//
//            }
//            System.out.println();
//        }
//        int row = 8;
//        for(int i = row; i >= 1; i--){
//            for(int j = 1; j <= i; j++)
//
//        }
    }
}


