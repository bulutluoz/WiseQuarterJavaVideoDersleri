package K26_stringBuilder;

public class C02_StringBuilderMethodlari {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Candir ");
        sb.append(3);
        sb.append(true);

        System.out.println(sb); // Java Candir 3true

        String str = "Ali topu at";

        sb.append(str,3,8);

        System.out.println(sb); // Java Candir 3true topu


        String metin = "Ali Can";
        System.out.println(metin.replace("Ali", "veli")); // veli Can


        sb.replace(11,18,"*");

        System.out.println(sb); // Java Candir*topu

        sb.replace(11,16,".");

        System.out.println(sb); // Java Candir.

        sb.reverse();

        System.out.println(sb); // .ridnaC avaJ

        System.out.println(sb.reverse()); // Java Candir.


        System.out.println(sb); // Java Candir.


        sb.insert(4," hem");

        System.out.println(sb); // Java hem Candir.

        sb.deleteCharAt(15);

        System.out.println(sb); // Java hem Candir



    }
}
