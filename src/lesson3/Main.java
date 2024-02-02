package lesson3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int age = 28;
//        boolean isYoung = age >= 18;
//        boolean isOld =age <= 65;
//        if(!isYoung && !isOld){
//            System.out.println("Вы можете работать");
//        }
//        else{
//
//            System.out.println("Работать не обязательно");
//        int side1, side2, side3;
//        System.out.println("Введите первую сторону: ");
//        side1 = input.nextInt();
//        System.out.println("Введите вторую сторону: ");
//        side2 = input.nextInt();
//        System.out.println("Введите третью сторону: ");
//        side3 = input.nextInt();
//
//        if (side1 == side2 || side1 == side3 || side2 == side3) {
//            System.out.println("Треугольник равнобедренный");
//        } else if (side1 == side2 && side1 == side3 && side2 == side3) {
//            System.out.println("Треугольник равносторонний");
//        } else {
//            System.out.println("Треугольник разносторонний");
//        }
//        int n;
//        System.out.print("Введите количество ворон(0-9): ");
//         n = input.nextInt();
//         if(n >= 0 && n <= 9){
//             System.out.print("На ветке ");
//             if (n == 1){
//                 System.out.println(n + "ворона");
//             } else if(n >= 2 && n <=4){
//                 System.out.println(n + "вороны");
//             } else {
//                 System.out.println(n + "ворон");
//             }
//         }
//         else{
//            System.out.println("Ошибка ввода данных");

//           int day, time;
//        System.out.print("Введите день недели цифрами: ");
//        day= input.nextInt();
//
//        if(day >= 1 && day <= 5){
//            System.out.print("Введите время: ");
//            time = input.nextInt();
//            System.out.println("Рабочий день. ");
//            if (time >= 8 && time <= 17){
//                System.out.println("Открыто");
//            } else {
//                System.out.println("Закрыто. Откроется в 8:00.");
//            }
//        }
//        else if(day ==6 || day == 7){
//            System.out.println("Выходной день.");
//        }
//        else {
//            System.out.println("Такого дня недели нет");
////        }
//        int day, time;
//        System.out.print("Введите день недели цифрами: ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.println("Рабочий день. ");
//            if (day == 1) {
//                System.out.println("Понедельник");
//            }
//            if (day == 2) {
//                System.out.println("Вторник");
//            }
//            if (day == 3) {
//                System.out.println("Среда");
//            }
//            if (day == 4) {
//                System.out.println("Четверг");
//            } else if (day == 6 || day == 7) {
//                System.out.println("Выходной день.");
//                if (day == 6) {
//                    System.out.println("Суббота");
//                }
//                if (day == 7) {
//                    System.out.println("Воскресенье");
//
//                }
//            }
//        }


//        int number, res;
//        number = -10;
//        res = number >= 0 ? number : -number;
//        System.out.println(res);

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 ? "Приятного просмотра!" : "Вам рано смотреть этот фильм");
//         System.out.println(a == b ? "a == b" : a > b ? " a > b" : "b > a");
//        int n = true ? (false ? 10 : 20) : 30;
//        System.out.println(n);
//        System.out.println(5 / 0);
//        int a = 10, b = 2;
//        System.out.println(b == 0 ? "На 0 делить нельзя" : (float)a / b);
//    int n;
//        System.out.println("\t Выбор цвета светофора\n1 (11)- красный, 2 (22) - желтый, 3 (33) - зеленый");
//        n = input.nextInt();
//
//        switch(n){
//
//            case 1:
//            case 11:
//                System.out.println("Стоим");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Приготовились");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Идем");
//                break;
//            default:
//                System.out.println("Такого цвета у русского светофора нет");
//        }
//    }
//        int month;

//        int year;
//        int numDays = 0;
//        System.out.println("Введите номер месяца: ");
//        month = input.nextInt();

//        switch (month){
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                numDays = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                numDays = 30;
//            break;
//            case 2:
//                System.out.print("Введите год: ");
//                year = input.nextInt();
//                if (year % 4 == 0){
//                    numDays = 29;
//
//                }
//                else{
//                    numDays = 28;
//
//                }break;
//            default:
//                System.out.println("Такого месяца не существует");
//
//        }
//        System.out.println("Количество дней: " + numDays);

//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month){
//            case 1,2,12 -> System.out.println("Зима");
//
//            case 3, 4, 5 -> System.out.println("Весна!");
//
//            case 6, 7, 8 ->System.out.println("Лето!");
//
//            case 9, 10, 11 -> System.out.println("Осень!");
//            default -> System.out.println("Такого месяца не существует!");
//
//        }
//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//       String s = switch (month){
//            case 1,2,12 ->"Зима!";
//
//            case 3, 4, 5 -> "Весна!";
//
//            case 6, 7, 8 -> "Лето!";
//
//            case 9, 10, 11 -> "Осень!";
//            default -> "Такого месяца не существует!";
//
//        };
//        System.out.println(s);
//        input.close();
//        System.out.print("Введите балл по 12 бальной системе оценивания: ");
//        int num = input.nextInt();
//
//        System.out.print("Ваш бал по 5 бальной системе оценивания: ");
//        switch ((num >= 1 && num <= 3) ? 2 :
//                (num >= 4 && num <= 6) ? 3 :
//                (num >= 7 && num <= 9) ? 4 :
//                (num >= 10 && num <= 12) ? 5 : 0) {
//
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет");
//        }
//    }
    }

}