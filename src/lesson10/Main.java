package lesson10;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(toStr(254, 16));

//    public static String toStr(int n, int base) {
//        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "F"};
//        if (n < base) {
//            return convert[n];
//        } else {
//            return toStr(n / base, base) + convert[n % base];
//        }

        int size;
        System.out.println("Введите размер массива: ");
        size = input.nextInt();
        int[] list = new int[size];
        int option;
        do {
            System.out.println("Меню:");
            System.out.println("1. Ввод элементов массива");
            System.out.println("2. Отображение массива");
            System.out.println("3. Поиск элементов в массиве");
            System.out.println("4. Сортировка массива");
            System.out.println("5. Выход");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    readArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.print("Введите элемент, который вы хотите найти:");
                    int item = input.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1){
                        System.out.print("Элемент не найден");
                    }else {
                        System.out.println("Элемент найден на позиции " + (index + 1));
                    }
                    break;
                case 4:
                    System.out.println("Отсортированный массив: ");
                    sortArray(list);
                    displayArray(list);
                    break;
            }
        } while (option != 5);
    }
        public static void readArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print("-> ");
                array[i] = input.nextInt();
            }
        }
        public static void displayArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");

            }
        }
        public static int searchArray(int[] array, int data){
            for (int i = 0; i < array.length; i++) {
                if(array[i] == data){
                    return i;
                }
            }
            return -1;
        }
        public static void sortArray(int[] array){
                for(int i = 0; i < array.length-1; i++){
                    for(int j = 0; j < array.length-i-1; j++){
                        if(array[j] > array[j + 1]){
                            int temp =  array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
        }
//
//        System.out.print("На каком Вы этаже: ");
//        int n1 = input.nextInt();
//        elevator(n1);
//        int[] mas = {1,3,5,7,9};
//        System.out.println(sumList(0, mas));
//    }
//    public static  int sumList(int i, int[] arr){
//        if(i ==(arr.length-1)){
//            return arr[i];
//        }
//        return arr[i] + sumList(i + 1, arr);
//    }

//    public static int sumList(int[] arr){
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        return sum;
//    }

//    public static void elevator(int n) {
//    if(n == 0){
//        System.out.println("Вы в подвале");
//        return;
//    }
//        System.out.println("=> " + n);
//        elevator(n - 1);
//        System.out.print(n + " ");
//    }

}