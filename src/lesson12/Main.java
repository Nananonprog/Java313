package lesson12;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Work";
//        String message = str1 + " " +  str2;
//        System.out.println(message);
//
//        char[] helloArray = {'П', 'р', 'и', 'в', 'е', 'т'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);
//
//        String str = "Hello";
//        int a = 5;
//        String newStr  = str + a;
//        System.out.println(newStr);
//
//        int b = 3;
//        String st = b + "";
//        System.out.println(st);

//        String str = "2";
//        int a = Integer.parseInt(str);
//        System.out.println(a);
//
//        int b = Integer.parseInt("789");
//        System.out.println(b);

//         String name = "Hello";
//         name = "Hi";
//        System.out.println(name);
//        int count = name.length(); // длина строки
//        System.out.println(count);

//        int count1 = "".length();
//        System.out.println(count1);
//
//       String name = "Nikita";
//        String name2 = name.toLowerCase();

//        String name2  = name.toUpperCase();
//        System.out.println(name2);
//        System.out.println(name.toUpperCase());
//        System.out.println(name);
//        char res = name.charAt(2); // возвращает символ, расположенный по указанному индексу
//        System.out.println(res);
//        String text = "Частотный словарь букв русского алфавита. Создадим массив нужной длины, " +
//                "и будем хранить в соответствующих позициях вхождения символов.";
//        System.out.println(text);
//        text  = text.toLowerCase();
//        int[] result = new int['я' - 'а' + 1];
//        for (int i = 0; i < text.length(); i++){
//            char ch = text.charAt(i);
//            if(ch >= 'а' && ch <= 'я'){
//                result[ch - 'а']++;
//            }
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println((char) (i + 'а') + " = " + result[i]);

//        String s1 = "";
//        if(s1.isEmpty()){
//        System.out.println("Пустая строка");//проверка что строка пустая
//        }
//        String str = "ABC";
//        char[] res = str.toCharArray();
//
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите адрес сайта: ");
//        String path = input.nextLine();
//
//        char[] chars = path.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] == '/'){
//                chars[i] = '\\';
//            }
//
//        }
//        String res = new String(chars);
//        System.out.println(res);
//        String str = "I learning Java";
//        System.out.println(str);
//        System.out.println(str.indexOf('a'));
//        System.out.println(str.lastIndexOf('a'));
//        System.out.println("    Hello World     ".trim());
//        String str = "I learning Java";
//        System.out.println(str.substring(2));
//        System.out.println(str.substring(2,12));
//        String[] words = str.split(" ");
//        for(String word: words) {
//            System.out.println(word);
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите ФИО: ");
//        String line = input.nextLine();
//        String[] res = line.split(" ");
//        System.out.println(res[0] + " " + res[1].charAt(0) + "."  + res[2].charAt(0) +".");

//        String res = String.join(":","00", "23", "30");
//        String[] text = new String[]{"Hello", "World"};
//        String str = String.join("fuck", text);
//        System.out.println(str);
//        String text = "Я изучаю c++. Мне нравится c++";
//        System.out.println(text);
//        String[] array = text.split("c \\+\\+");
//        String res = String.join("Java", array);
//        System.out.println(res);

//int[] arr = {-2, 3, 8, -11, -4, 6};
//        System.out.println("n = " + Calc(arr, 0));
//
//    }
//
//    public static int Calc(int[] numbers, int index){
//        if(index == numbers.length){
//            return 0;
//        }
//            return (numbers[index] < 0 ? 1 : 0) + Calc(numbers, index + 1);
//    }

//        String str = "Замените в этой строке все появления букву \"о\" на буквы \"О\", кроме первого и последнего вхождения.";
//        System.out.println(str);
//        String a = str.substring(0, str.indexOf("о") + 1);
//        String b = str.substring(str.indexOf("о") + 1, str.lastIndexOf("о"));
//        System.out.println(str.lastIndexOf("о"));
//        String c = str.substring(str.lastIndexOf("о"));
//        System.out.println(a + b.replace("о", "О") + c);

//        String s1 = "Hello";
//        String s2 = "Hello1";
//        String s3 = "HELLO";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("I learn Java".endsWith("Java"));
        System.out.println("I learn Java".startsWith("Java"));
        System.out.println("I learn Java".contains("rn"));


//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите название документа:");
//        String path = input.nextLine();
//
//        if(path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")){
//            System.out.println("Это изображение");
//        }else if(path.endsWith(".docx") || path.endsWith(".doc")){
//            System.out.println("Это документ Word");
//        }
//        else{
//            System.out.println("Это неизвестный формат");
//        }
//       String s = "I learning Java";
//       int n;
//        n = s.codePointAt(5);// код индекса по его индексу в стрке
//        System.out.println(n);
//
//        n = s.codePointBefore(5);
//        System.out.println(n);

//        String s;
//        double d = 3.8567;
//        char d = "+";
//        int d = -3902;
//        s = String.valueOf(d);
//        System.out.println(s);

//        String str = "1";
//        System.out.println("1 > 2 : " + str.compareTo("2"));
//        str = "2";
//        System.out.println("2 > 1 : " + str.compareTo("1"));//лексикографическое сравнение
//     System.out.println("2==2 : " + str.compareTo("2"));

//        String str = "A";
//        System.out.println("A > m : " + str.compareToIgnoreCase("m"));
//        str = "m";
//        System.out.println("m > a : " + str.compareToIgnoreCase("A"));


        //StringBuilder
        //StringBuffer

//        StringBuilder sb = new StringBuilder();
//        sb.append('a');
//        sb.append(10);
//        sb.append(123456L);
//        sb.append(12.34);
//        sb.append(12.34f);
//        sb.append("Hello")
//                .append("_")
//                .append("World");
//        System.out.println(sb);
//        sb.insert(5, "_!");
//        System.out.println(sb);
//        sb.delete(5,7);
//        System.out.println();
//        sb.replace(5,10, "Java");
//        System.out.println(sb);
//        String st = sb.substring(5, 8);
//        System.out.println(st);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l", 7));

//        StringBuilder sb1 = createStr(5, 3);
//        modifyStr(sb1, "=", "равно");
//        modifyStr(sb1, "+", "плюс");
//        modifyStr(sb1, "-", "минус");
//        modifyStr(sb1, "*", "умножить");
//        System.out.println(sb1);
//    }
//
//    public static StringBuilder createStr(int a, int b) {
//        StringBuilder res = new StringBuilder();
//        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
//        res.append(a).append(" - ").append(b).append(" = ").append(a + b).append("\n");
//        res.append(a).append(" * ").append(b).append(" = ").append(a + b).append("\n");
//        return res;
//    }
//
//    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr) {
//        int pos;
//        while ((pos = stBuild.indexOf(oldStr)) != -1) {
//            stBuild.replace(pos, pos + 1, newStr);
//        }
//        return stBuild;
//    }

//        StringBuilder modStr = getStringBuilder();
//        System.out.println("Измнененная строка - \"" + modStr + "\"");
//    }
//
//        public static StringBuilder getStringBuilder(){
//            System.out.print("Исходная строка = \"");
//            String str = "  Текст  с    повторяющимися  символами ";
//            System.out.println(str + "\"");
//            StringBuilder modify = new StringBuilder(str.replace(" ", ""));
//            for (int i = 0; i < modify.length(); i++) {
//                for(int j = modify.length()-1; j > i;j--){
//                    if(modify.charAt(i) == modify.charAt(j)){
//                        modify.deleteCharAt(j);
//                    }
//                }
//
//            }
//            return modify;


    }
    }
