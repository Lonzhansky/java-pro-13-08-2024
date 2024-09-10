package ua.hillel.lessons.lesson7;

public class Main {
    public static void main(String[] args) {

//        char charVariable1 = 'A';
//        char charVariable2 = 65;
//        char charVariable3 = '\u0041';
//
//
//        System.out.println(charVariable1);
//        System.out.println(charVariable2);
//        System.out.println(charVariable3);


//        int code = 0x1F600;
//        char[] chars = Character.toChars(code);
//        System.out.println(chars);

//        Character ch = 'A';
//        System.out.println(ch);

//        String str = "qwe";
//        str += "123";  // qwe123
//        str += "asd";  // qwe123asd


//        String str1 = "Orange";
//        String str2 = "Orange";
//
//
//        for (int i = 0; i < 200_000; i++) {
//            str1 += i;
//        }
//
//        System.out.println(str1);


        StringBuilder stringBuilder = new StringBuilder("QWERTY");
        System.out.println(stringBuilder.reverse());
        for (int i = 0; i < 200_000; i++) {
            stringBuilder.append(i);
        }
        String string = stringBuilder.toString();

//        System.out.println(string);



//        String str1 = "Orange";
//        String str2 = new String("Orange");
//        str2 = str2.intern();
//        String str3 = new String("Orange").intern();
//        String str4 = "Orange2";
//
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1 == str4);

//        print("qweqw", 2,"qwe", "asd", "zxc", "qweqweqw", "sdfsdf");



    }


    static void print(String a, int b, String... arr) {

        System.out.println(arr.length);
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
