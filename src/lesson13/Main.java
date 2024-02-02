package lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//          String s = "Я ищу совпадения в 2024 году. И я их найду в 2 счёта. 198765 Ели[-ели]";
//          String pattern = "[а-я&&[к-н]];"

        // String pattern = "[а-я&&[^к-н]]; - вычитание символов (все кроме [к-н])
      //  String pattern = "[а-я&&[к-н]];-> пересечение симвоора
          //[а-д[к-н]] - объединение символов ->[а-дк-н]
          //"[^А-яЁё]"[^...]- все кроме заданных символов
//          String pattern = "[-А-яЁё\\[\\]]";//[A-Za-z]
//        String pattern = "[12][0-9][0-9][0-9]";// [0-9] - диапазон символов
//          String pattern = "[204]";//[...] - один символ из перечисленных
//          Pattern regex = Pattern.compile(pattern);
//          Matcher matcher = regex.matcher(s);
//       System.out.println(matcher);
//          while (matcher.find()){
////              System.out.println("Шаблон совпадения найден с " + matcher.start() + " по " + (matcher.end() - 1));
////              System.out.println(s.substring(matcher.start(), matcher.end()));
//              System.out.println(matcher.group());
//          }
//        String str = "ЁАЯaяё";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + ": " + str.codePointAt(i));
        String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15T81:45.Минуты в диапазоне";
        String pattern = "[0-2][0-9]:[0-5][0-9]";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
        }
    }

