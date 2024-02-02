package lesson1;

public class Main {
    public static void main(String[] args) {

//        int num2 = 0b10010; // prefix 0b, 0
//       System.out.println(num2);
//        int num8 = 022;
//        System.out.println(num8);
//        int num16 = 0x12;
//        System.out.println(num16);
//        System.out.println(num2 + num16);

//        int x = 123_456__789;
//        System.out.println(x);
//        double y = 234_567.789__102;
//        System.out.println(y);
//        double d1 = 0.512;
//        double d2 = .512;
//        double d3 = 512.;

//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//        System.out.println(d3 + 512.);
//        System.out.println(512.);
//        float f1 = .512F;


//        String text = "\tHello \nWorld";
//        System.out.println(text);
//        System.out.println("    Путь к каталогу \"folder\" находится в D:\\folder\\file.txt ");
//
//        System.out.print("2 + 2 = 5");
//        System.out.print("\b");
//        System.out.print("4");
//        System.out.println("\r");
//        System.out.print("Новый текст");

//        System.out.println("5 + 3 = ");
//        System.out.println(5 + 3);
//        System.out.printf("5 + 3 = %d %n", 5 + 3);
//        int a = 5;
//        int b = 6;
//        System.out.printf("a = %d, b = %d", a, b);
        // %d для целочисленных значений
//        String name = "Irina";
//        int age = 25;
//        double height = 1.7;%s для вывода строк
//        System.out.printf("my name is %s. I'm  %d years old. My height is %.1f", name, age, height);
        // %f любое вещ число
//        System.out.println("%8d%n");
//        System.out.println(5+2);
//        System.out.println(5-2);
//        System.out.println(5*2);
//        System.out.println(5/2);

//        int num = 4321;
//        int a, b, c, d, res;
//        System.out.printf("Исходное число: %d %n", num);
//        a = num % 10;
//        System.out.println(a);
//        num = num / 10;
//        b = num % 10;
//        System.out.println(b);
//
//        num = num / 10;
//        c = num % 10;
//        System.out.println(c);
//
//        num = num/10;
//        d = num % 10;
//        System.out.println(d);
//        res = a * 1000 + b * 100 + c * 10 + d * 1 ;
//        System.out.printf("Обратное число: %d", res);
    // ++a, a++ - инкремент - добавление 1
        // --a, a-- - декремент - добавление 1

//        int a = 8;
//        int b = a++;
//        a++;
//        ++b;
//        System.out.println(a);
//        System.out.println(b);
//        int a = 1;
//        int b = 1;
//        int c = a++ + 3;
//        int d = ++b + 3;

//        int a = 2 ;
//        int b = ++a;
//        int c = b + 3 + a;
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        int c = (a + 5) * ++b;
//        System.out.println(c);

//        System.out.printf("%8d%n", 123);
//        System.out.printf("%4d%5d%n", 123, 456);
//        System.out.printf("%4d%5d%n", 123, 456);
//        System.out.printf("%4d%n", 123456789);
//        System.out.printf("%6.2f%n", 123.456);
//        System.out.printf("%-6s%5d%n", "num =", 456);

//        System.out.printf("-------------------------------%n");
//        System.out.printf("      JAVA PRIMITIVE TYPES     %n");
//        System.out.printf("-------------------------------%n");
//        System.out.printf("| %-10s | %-8S | %-4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("-------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long", 64);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int", 32);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte", 8);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char", 16);
//        System.out.printf("| %-10s | %-8s | %04d |%n", "Boolean", "boolean", 1);
//        System.out.printf("-------------------------------%n");

    // Преобразование базовых типов данных
//        int x = 5;
//        byte y = (byte) x;
//        System.out.println(y);

//        byte x = 5;
//        int y = x;
//        System.out.println(y);

//        int x = 7654321;
//        float y = x;
//        System.out.println(y);

//        int x = 258;
//        byte y = (byte) x;
//        System.out.println(y);
//
//        long x = 5;
//        double x = 18.9848;
//        int y = (int)Math.round(x);
//        System.out.println(y);
//        int x = 5;
//        int y = 3;
//        int z = 7;
//        float srAr;
//        System.out.printf("Написать программу суммы, произведения и среднего арифметического: %d", x, y, z);
//        int a = 5, b = 10, c = 7;
//        int sum = a + b + c;
//        int mltply = a * b * c;
//        float avrg = (float) sum / 3;

//        System.out.println(sum);
//        System.out.println(mltply);
//        System.out.printf("%.2f", avrg);
//
//        System.out.println(17.0/3);
        int a = 5;
        double b = 4.7;
        double c = a + b;
        System.out.println(c);

        int d = 'a' + 3;
        System.out.println(d);


    }

}