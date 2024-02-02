package lesson9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        int a = 7;
//        int b = 3;
//        int c = 5;
//        int res1 = sum(a,b);
//        int res2 = sum(a,b,c);
//        System.out.println("Сумма двух чисел: " + res1);
//        System.out.println("Сумма трех чисел: " + res2);
        double num1 = getNumber();
//        System.out.println("num: " + num1);
        double num2 = getNumber();
//        System.out.println("num: " + num2);
        char operation = getOperation();
//        System.out.println(operation);
        double result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);

    }

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 != 0.0) {
            return num1 / num2;
        }else{
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }

    }

    public static double getNumber() {
//        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (input.hasNextDouble()) {
            return input.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод.");
            return getNumber();
        }
    }

    public static char getOperation() {
//        Scanner input = new Scanner(System.in);
        System.out.print("1 - сумма\n2 - разность\n3 - произведение\n4 - частное\nВыберите номер операции:");
        int operationNumber = 0;
        if (input.hasNextInt()) {
            operationNumber = input.nextInt();
        } else {
            System.out.println("Вы ввели не число. Повторите ввод.");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция. Повторите ввод");
                return getOperation();
        }
    }
}

//    public static int sum(int n1, int n2){
//        int sum = n1 + n2;
//       return sum;
//    }
//    public static int sum(int n1, int n2, int n3){
//        int sum = n1 + n2 + n3;
//        return sum;
//    }
//        int a = 7;
//        int b = 3;
//        double c = 5.1;
//        double d = 7.2;
//        int res1 = min(a,b);
//        System.out.println(res1);
//        double res2 = min(c,d);
//        int num = 4;
//        String str = "2 * 2= ";
//        print(str);
//        print(num);
//        print(str, num);
//    }
//
//    public static void print(String text) {
//        System.out.println(text);
//    }
//
//
//    public static void print(int number) {
//        System.out.println(number);
//    }
//    public static void print(String text, int number) {
//        System.out.println(text + " " + number);
//    }

//        sum(20 ,  "Welcome!", "20");
//        sum(1, "Hello World!", "a", "b");
//        func_num(2,7,0,3,1,5,-13);
//        func_num(2,7,0,3,1,5,-13,13);
//        func_num(26);
//        func_num(99,99,100,34,-39);
//        func_num(99,39,99,100,34);
//        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
//        System.out.println(ch(3,6,7));


//    public static int min(int n1, int n2){
//        int min;
//        if(n1 > n2){
//            min = n2;
//        }else{
//            min = n1;
//
//        }
//        return min;
//
//    public static double min(double n1, double n2){
//        double min;
//        if(n1 > n2){
//            min = n2;
//        }else{
//            min = n1;
//
//        }
//        return min;

//    public static ArrayList ch(int... num) {
//    ArrayList<Integer> mas = new ArrayList<>();
//        int sum = 0;
//        int count = 0;
//        float avr;
//        for (int i : num) {
//            sum += i;
//            count += 1;
//        }
//        avr = (float) sum/count;
//        System.out.println("Среднее арифметическое: " + avr);
//        for(int i: num){
//            if(i < avr){
//                mas.add(i);
//            }
//        }
//        return mas;
//






//    public static void func_num(int... args) {
//        int max = args[0];
//        for (int i : args) {
//            if (i % 13 == 0 && i > 0) {
//                max = i;
//            }
//        }
//        if (args[0] % 13 != 0 &&max == args[0]){
//            System.out.println("Число не найдено");
//        }
//        else{
//            System.out.println(max);
//        }
//    }
//    public static void func_num(int... args) {
//        int max = -1;
//        for (int i : args) {
//            if (i % 13 == 0 && i > 0) {
//                max = i;
//            }
//        }
//        if (max != - 1){
//            System.out.println(max);
//        }
//        else{
//            System.out.println("Число не найдено");
//        }
//    }


//    public static void sum(int nums, String... message) {
//        System.out.println(message);
//        for (int n : nums) {
//            res += n;
//        }
//        for(String s : message){
//            System.out.println(s);
//        }
//        System.out.println(res);


