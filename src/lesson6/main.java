package lesson6;

import lesson1.Main;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // array
//        int mas[] = new int[4];
//        float[] mas2 = new float[5];
//        int mas3[];
//        mas3 = new int[4];
//        int mas[] = new int[]{2, 7, 5, 3};
//        int mas[] = {2, 7, 5, 3};
        Scanner input = new Scanner(System.in);
//        int mas[] = new int[5];
//        mas[0] = 5;
//        mas[1] = 2;
//        mas[2] = 7;
//        mas[3] = mas[1] + mas[2];

//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println(mas.length);
//        int last = mas[mas.length-1];
//        System.out.println(last);
//        for(int i = 0 ; i < mas.length; i++){
//            System.out.println(mas[i]);
//        int n = 100;
//        int[] a = new int[n * 2 + 3];
//        System.out.println(a.length);
//         int n = 10;
//         int[] a = new int[n];
//         a[n-1] = 2;
//         a[n-2] = 3;
//         a[n/5] = a[n-1] + a[n - 2];
//
//        for(int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        int[] array = new int[4];
//        System.out.println("-> ");
//        array[0] = input.nextInt();
//        System.out.println("-> ");
//        System.out.println("-> ");
//        System.out.println("-> ");

//        for(int i = 0; i < array.length; i++){
//            System.out.print("->");
//            array[i]= input.nextInt();
//        }
//        for(int i = 0; i < array.length; i++){
//
//        System.out.print(array[i] + " ");
//        }
//        int a;
//        System.out.println("Введите количество элементов массива: ");
//        a = input.nextInt();
//        int[] array;
//        if(a>5){
//            array = new int[a];
//
//        }
//        else {
//            array = new int[a];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//        }
//            for (int i = 0; i < array.length; i++);{
//                System.out.print(array[i] + " ");
//            }

//        int[] array = new int[10];
//        for(int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");}

//        int[] array = {1, 4, 6, 3, 8};
//        System.out.println(Arrays.toString(array));

//        int n, sum = 0;
//        System.out.println("n =");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//            if (array[i] < 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array));
//
////        for(int i = 0; i < array.length; i++){
////            if(array[i]<0){
////                sum+= array[i];
//
//
//        System.out.println("Сумма отрицательных элементов массива: " + sum);

//        int n;
//        System.out.println("n = ");
//        n = input.nextInt();
//
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//
//        }
//
//        for(int i = 0; i < array.length; i++){
//            if(array[i] < array[i-1]){
//                 = array[i];
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//
//
//        System.out.println("Минимальный элемент массива: " + min);

//        int n = 5;
//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j <= i) {
//                if (j == 0 || i == j || i == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.println(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        System.out.print("Введите начало диапазона: ");
//        int k = input.nextInt();
//        System.out.print("Введите начало диапазона: ");
//        int n = input.nextInt();
//        int[] array = new int[n-k+1];
//
//        for (int i = 0, j = k; i <= n - k; i++, j++) {
//            array[i] = j;
//            System.out.print(array[i] + "\t");
//
//        }
//        System.out.println("\n" + Arrays.toString(array));

//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length];
//
//        for(int i=0; i< a1.length; i++){
//            a2[i] = a1[i]; // a2[0] = a1[0]
//        }
//        a1[0] = 5;
//        System.out.println("\n" + Arrays.toString(a1));
//        System.out.println("\n" + Arrays.toString(a2));

        // math.random() * (max - min) + min;
//        double a = Math.random() * 3;
//        System.out.println(a);
//        // От 2 до 7 (не включая 7)
//        double b = 2 + Math.random() * 5;
//        System.out.println(b);
//
//        double c = 2 + Math.random() * 10 - 5; // от -5 до 5(не включительно)
//        System.out.println(c);
//        // math.random() * (5-(-5))) + (-5);
//
//        int a = (int)(Math.random() * 2 + 3); // от 3 до 5
//        System.out.println(a);

//        int c = (int)(Math.random() * 10 + 1 - 5);
//        System.out.println(c);
//        // Math.random() * (5-(-5)) + 1 +(-5)
//         int d = (int)(Math.random() * 6 + 1 - 2)
//        int[] array = new int[40];
//        for(int i = 0; i < array.length; i++){
//           // от 0 до 10(не включительно)
////            array[i] = (int)(Math.random() * 10);
////            array[i] = (int)(Math.random() * 12 + 2);
//            array[i] = (int)(Math.random() * 31 -15);
//        }
//        System.out.println(Arrays.toString(array));

//        int sum = 0, count = 0;
//        int[] array = new int[20];
//        for(int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString(array));
//        for(int i = 0; i < array.length; i++){
//            if(array[i] % 2 == 0){
//            count++;
//            }else{
//                sum += array[i];
//            }
//        }
//        System.out.println("Количество четных элементов: " + count);
//        System.out.println("Сумма нечетных элементов: " + sum);

//        int[] numbers = {10, 20, 30, 40, 50};
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        // for (объявление_переменной : выражение) {}
//        for (int x: numbers) {
//            System.out.print(x * 2 + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numbers));


//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for(String name : names) {
//            System.out.println(name);}

//        String[] cities = {"Брянск", "Иркутск", "Владивосток"};
//        System.out.println(Arrays.toString(cities));
//        String[] cities2 = new String[cities.length + 1];
//        for (int i = 0; i < cities.length; i++) {
//            cities2[i] = cities[i];
//        }
//        cities2[cities.length] = "Красноярск";
//        System.out.println(Arrays.toString(cities2));

//        ArrayList <String> cities = new ArrayList<>();
//        cities.add("Брянск");// добавляет элемент в массив
//        cities.add("Иркутск");
//        cities.add("Владивосток");
//        cities.add("Армавир");
//        cities.add(1,"Красноярск");
//        cities.add(2,"Сывтывкар");
//        System.out.println(cities.get(2)); // получает значение по индексу
//
//
//        for(String city:cities){
//            System.out.print(city + " ");
//        }
//        System.out.println("\n" + cities.indexOf("Владивосток")); // индекс по заданному значению
//
//
//        cities.set(2, "Курск"); // устанавливаем значение по заданному индексу
//
//        cities.remove(1);
//        for(String city : cities){
//            System.out.print(city + " ");}
//
//            if(cities.contains("Курск")){
//                System.out.println("\nArrayList содержит Курск");
//            }
//        System.out.println(cities.contains("Курск"));
//        System.out.println(cities.size());
//
//        for(int i = 0; i < cities.size() ; i++) {
//            System.out.println(cities.get(i));
//        }
//        cities.remove("Брянск");

//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка.Условие выхода 0 или отрицательное число: ");
//        while ((n = input.nextInt()) > 0){
//            mas.add(n);
//        }
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        for(int m: mas){
//            System.out.print(m + "\t");
//        }
//        int max, ind;
//       ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int)(Math.random() * 100));
//
//        }
//        for (int m: mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//
//        for(int i = 0; i < 10; i++) {
//            if(max < mas.get(i)){
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nMax: " + max);
//        ind = mas.indexOf(max);
//        System.out.println("index: " + ind);
//        mas.remove(ind);
//        mas.add(0, max);
//
//        for(int m: mas){
//            System.out.print(m + "\t");
//        }
//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//
//        if(a.size() > b.size()) {
//            for (int i = 0; i < b.size(); i++) {
//                c.add(a.get(i));
//                c.add(b.get(i));
//
//            }
//
//
//            for (int i = b.size(); i < a.size(); i++) {
//                c.add(a.get(i));
//            }
//            for (int m : c) {
//                System.out.print(m + "\t");
//            }
//            else{
//                for (int i = 0; i < a.size(); i++) {
//                    c.add(a.get(i));
//                    c.add(b.get(i));
//                }
//                for (int i = a.size(); i < b.size(); i++) {
//                    c.add(a.get(i));
//                }
//                for (int m : c) {
//                    System.out.print(m + "\t");
//
//                }
//
//            }
//        }

//        int[][] num = {{0,1,2,3}, {4,5,6,7},{8,9,10,11}};
//        System.out.println(num.length);
//        for(int i = 0; i< num.length; i++){
//            System.out.println(Arrays.toString(num[i]));
//        }
//        System.out.println(num[1][3]);
//        for (int i = 0; i < num.length; i++){
//            for (int j = 0; j < num[i].length; j++){
//                System.out.print(num[i][j] + "\t");
//
//            }
//            System.out.println();
//        }
//  int[][] num = {{0,1,2,3}, {4,5,6,7},{8,9,10,11}};
//     for (int i = 0; i < num.length; i++){
//         for (int j = 0; j < num[i].length; j++){
//             num[i][j] *= num[i][j];
//            System.out.print(num[i][j] + "\t");
//         }
//    System.out.println();
//        }
//        int n = 5;
//        char[][] graph = new char[n][n];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                graph[i][j] = '*';
//                System.out.print(graph[i][j] + "  ");
//            }
//            System.out.println();
//        }

//        int n = 3, m = 4, count = 0;
//        int [][] mas = new int[n][m];
//        for(int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                mas[i][j] = (int) (Math.random() * 30 - 20);
//                if(mas[i][j]<0){
//                    count++;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++){
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + count);
//        int [] array = new int[10];
//        int c;
//        for(int i = 0; i < array.length; i++){
//            c = (int)(Math.random() * 10);
//            int j = 0;
//            while(j<1){
//                if(c != array[j]) {
//                    j++;
//                }else{
//                    c = (int)(Math.random() * 10);
//                    j = 0;
//                }
//            }
//            array[i] = c;
//        }
//
//        System.out.println(Arrays.toString(array));

        //найти строку в двухмерном массиве, имеющую минимальную сумму элементов

//        int sum = Integer.MAX_VALUE;
//        int tmp =0, n=1;
//        int arr[][] = new int[3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = (int)(Math.random() * 100);
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < arr.length; i++) {
//            for (int j =0; j < arr.length; j++){
//                tmp+= arr[i][j];
//            }
//            if(sum > tmp){
//                sum = tmp;
//                n = i;
//            }
//
//            System.out.println("Сумма элементов " + (i + 1) + " строки: " + sum);
//            tmp = 0;
//        }
//        System.out.println("\nСтрока с минимальной суммой элементов " + sum + " имеет номер" + (n+1));

//        int[][] mas = new int[3][];
//        mas[0] = new int[2];
//        mas[1] = new int[3];
//        mas[2] = new int[4];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = input.nextInt();
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.println(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//
//        }
//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};
//        mas[0] = new int[]{3, 4, 5};
//        mas[0] = new int[]{6, 7, 8, 9};
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//        int[][] mas1 = new int[][] {{1,2}, {3,4,5},{6,7,8,9}};
//        for (int i = 0; i < mas1.length; i++) {
//            for (int j = 0; j < mas1[i].length; j++) {
//                System.out.print(mas1[i][j] + "\t\t");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        int arr[][] = new int[n][];
////        arr[0] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i + 1];
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//
//        }
//        int n = 5;
//        int arr[][] = new int[n][];
////        arr[0] = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[arr.length - i];
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t\t");
//            }
//            System.out.println();
//
//        }

//            int n = 8;
//            int tp[][] = new int[n][];
//        for (int i = 0; i < n; i++) {
//            tp[i] = new int[i + 1];
//            tp[i][0] = 1;
//            tp[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                tp[i][j] = tp[i-1][j-1] + tp[i-1][j];
//
//            }
//
//        }
//
//        for (int i = 0; i < tp.length; i++) {
//            for(int j = 0; j < n - i;j++){
//                System.out.print("  ");
//            }
//            for (int j = 0; j < tp[i].length; j++) {
//                System.out.print(tp[i][j] + "  ");
//            }
//            System.out.println();
//        }

    }
}
