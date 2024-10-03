package K11_stringManipulations.Ders04;

public class C01_isEmpty_isBlank {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = " ";
        String s3 = "     ";
        String s4 = "Hello World";

        System.out.println(s4.isEmpty()); // false  length() == 0
        System.out.println(s4.isBlank()); // false  length() == 0 veya string sadece space'lerden olusuyorsa true

        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // true

        System.out.println(s2.isEmpty()); // false
        System.out.println(s2.isBlank()); // true

        System.out.println(s1.isEmpty()); // true
        System.out.println(s1.isBlank()); // true


    }
}
