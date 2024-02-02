package lesson14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
//        try {
//            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09";
//            String pattern = "[0-9][0-9]:[0-9][0-9]";
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        }catch(PatternSyntaxException pse){
//            System.err.println("Неправильное регулярное выражение:" + pse.getMessage());
//
//
//        }

        //  String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 198765 Ели[-ели]. Hello_World 200000000";
//        String s = "author=Пушкин А.С.; title = Евгений Онегин; price =200; year= 1830";
//        String pattern = "\\w+\\s*=\\s*[^;]+"; //"\\w+\\s*=\\s*[А-я0-9\\s.]+";
        // + - от 1 до бесконечности  (\d+)
        // * - от 0 до бесконечности
        // ? - от 0 до 1
        // \\d ==[0-9] - одна любая цифра \\D == [^0-9]
        // \\s == [] - один пробельный символ \\S == [^ ]
        // \\w == [A-za-z0-9_] - один символ - буквы только англ, регистронезависимый, цифры и символ подчеркивания
        // \\А - от начала строки
        // \\Z - поиск с конца
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");
//        }
//    }
//}
        //String s = "+7 499 456-45-78, +74994564578, 7(499) 456 45 78, 74994564578";
        //String pattern = "\\+?7\\d{10}";
        // {4} - 4 повторениz
        // {2,} - 2 повторения до бесконечности
        // {2,4} - от 2 повторения до 4 (включительно)

        // String s = "i learning Java";
        // String pattern = "^\\w+\\s\\w+"; - поиск от начала строки
        // String pattern = "^\\w+\\s\\w+$"; - поиск с конца строки
        // ^ - строка должна начинаться с заданного шаблона
        // $ - строка должна заканчиваться на заданный шабллн
//        String pattern = "^\\w+\\s\\w+\\s\\w+$";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.print(matcher.group() + "\t\t");

//            String s = "Java_master";
//            String pattern = "^[\\w-]{3,16}$"; //буквы, цифры,_, -, от 3 до 16
//
//            Pattern regex = Pattern.compile(pattern);
//            Matcher matcher = regex.matcher(s);
//            System.out.println(matcher.find());

//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите текст с цифрами");
//        String s = input.nextLine();
//        String pattern = "\\d #поиск цифр";
//        Pattern regex = Pattern.compile(pattern, Pattern.COMMENTS);
//        Matcher matcher = regex.matcher(s);
//        int count = 0;
//        while (matcher.find()) {
//            count++;
//        }
//        System.out.println("Количество цифр во введенном тексте: " + count);


//        String s = "one\ntwo";
//        String pattern = "one$";
//
//        Pattern regex = Pattern.compile(pattern,Pattern.MULTILINE);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//            System.out.print(matcher.group() + "\t\t");

//        String s = "Goods - $500";
//        String pattern = "$500";
//
//        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//            System.out.print(matcher.group() + "\t\t");

//        String s = "Java, \njava, \nJAVA";
//        String pattern = "(?im)^java";
//
//        Pattern regex = Pattern.compile(pattern, Pattern.LITERAL);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-1@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru";
//        String pattern = "[а-я\\w.-]+@[\\w.]+.ru";
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//   жадное соответствие
//        String s = "<body>Пример жадного соответствия регулярных выражений</body>";
//        String pattern = "<.*?>";
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//        String s = "Егорова Алиса Александровна";
//        String pattern = "А.+?а";
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//            System.out.print(matcher.group() + "\t\t");
//        }
//        String s = "Word2016, PS6, AI5";
//        String pattern = "([a-z]+)(\\d*)";
//
//        Pattern regex = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        while(matcher.find()){
//           System.out.println(matcher.group());
//            System.out.println(matcher.group(1));
//            System.out.println(matcher.group(2));
//        String s = "abc";
//        String pattern = "(.(.(.)))}";
//
//        Pattern regex = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
//        Matcher matcher = regex.matcher(s);
//        matcher.find();
//        System.out.println(matcher.groupCount());
//        for (int i = 0; i <= matcher.groupCount(); i++) {
//            System.out.println(i + ": " + matcher.group(i));

//        String s = "Ольга и Виталий отлично учатся!";
//        String pattern = "Петр|Ольга|Виталий";
//        String s = "int = 4, float = 4.0f, double = 8.0";
////        String pattern = "\\w+\\s*=\\s*\\d\\.?\\d?[.\\w]*";
////        String pattern = "int\\s*=\\s*\\d[.\\w]*|float\\s*=\\s*\\d[.\\w]*";
//       String pattern = "(int|float)\\s*=\\s*(\\d[.\\w]*)";
//
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()){
//            System.out.println(matcher.group(2));


//     String s = "127.168.255.255";
////        String s = "127.0.0.1";
////        String pattern = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
//        String pattern = "(\\d{1,3}.){3}\\d{1,3}";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//
//        }

//        String s = "23-10-2024";
//        String pattern = "(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19[0-9][0-9]|20[0-9][0-9])";
//        Pattern regex = Pattern.compile(pattern);
//        Matcher matcher = regex.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//
//        }
//        String s = "Я ищу совпадения в 2024 году. И я их найдц в 2 счёта.";
//        String[] arr = s.split("[.2]");
//        for (String temp:arr) {
//            System.out.println(temp);

//        Pattern p = Pattern.compile(",\\s");
//        String[] arr = p.split("Суворова Виктория, Россия, г.Сочи, +7 999 555-77-33");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
        String s = "05-03-1987 // Дата рождения";
//        String s2 = s.replaceAll("//.*","");
        String s2 = s.replaceAll("\\s*//.*","").replaceAll("-",".");
        System.out.println("Дата рождения: " + s2);

        }

        }





