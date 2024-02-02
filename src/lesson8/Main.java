package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        hello("Irina");
        Scanner input = new Scanner(System.in);
//        getSum(2, 5);
//        int a = 1;
//        int b = 7;
//        getSum(a, b);
//        int n1 = 3;
//        int n2 = 7;
//        getSum(n1, n2);
//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'X', '0');
//
//        int a = 30;
//        int b = 45;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        swapFunction(a,b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.print("Введите а:");
//        int a = input.nextInt();
//
//        System.out.print("Введите b:");
//        int b = input.nextInt();
//        int c = func1(a, b);
//        System.out.println("Результат: " + c);
//        for (int i = 0; i < 11; i++) {
//            System.out.print(i + " в кубе = " + cub(i));
//        }

//        printLine(1, 2);
//        printLine(1, 4);
//        printLine(1, 5);
//        printLine(1, 6);

        int n = 5;
        for (int i = 0; i <= n; i++) {
            printLine(1, i);
        }
        for (int i = n - 1; i > 0; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
//    public static int cub(int a) {
//        return a * a * a;
//    }
//    public static int func1(int n1, int n2) {
//        int res;
//        if(n1 > n2){
//            res = n1 - n2;
//    }else{
//            res = n1 + n2;
//        }
//        return res;
//    public static int min(int n1, int n2) {
//        int min;
//        if(n1 > n2){
//            min = n2;
//    }else{
//            min = n1;
//        }
//        return min;
}
//    public static void swapFunction(int n, int m){
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
//        int c = n;
//        n = m;
//        m = c;
//        System.out.println("--------------------");
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);


//    public static void symbolDraw(int count, char a, char b){
//        for(int i = 0; i < count; i++) {
//           if(i % 2 == 0){
//               System.out.print(a);
//           }else{
//               System.out.print(b);
//           }



//        System.out.println();
//    public static void getSum(int a, int b){
//        System.out.println(a + b);



//public static void hello(String name){
//    System.out.println("Hello, " + name + "!");
//}
//}