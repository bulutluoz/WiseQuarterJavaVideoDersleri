    package K16_scope;

    public class Hastane {
        static String hastaneIsmi  = "Yildiz Hastanesi";
        static String hastaneAdresi = "Yenimahalle";
        static String bashekim = "Doktor Ali";
        String perIsmi = "Isim atanmadi";
        String perAdres = "Adres atanmadi";
        String perTel ="Telefon atanmadi";

        public static void main(String[] args) {

            Hastane per1 = new Hastane();

            System.out.println(per1.perIsmi);
            System.out.println(per1.perAdres);
            System.out.println(per1.perTel);

            per1.perIsmi = "Hatice";
            per1.perTel = "5443454545";
            per1.perAdres = "Balgat";


            System.out.println(per1.perIsmi); // Hatice
            System.out.println(per1.perAdres); // Balgat
            System.out.println(per1.perTel); // 5443454545


            Hastane per2 = new Hastane();

            per2.perIsmi = "Cansu";
            per2.perTel = "5343423221";
            per2.perAdres = "Yenimahalle";

            System.out.println(per2.perIsmi); // Cansu
            System.out.println(per2.perAdres); // Yenimahalle
            System.out.println(per2.perTel); // 5343423221

            Hastane per3 = new Hastane();

            per3.perAdres = "Cankaya";

            System.out.println(per1.perIsmi);

            System.out.println(per2.perIsmi);

            System.out.println(per3.perIsmi);




































    }

}
