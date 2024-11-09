package K29_inheritance.D06_overriding;

public class C03_AvciKuslar extends C02_Kuslar {

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        C03_AvciKuslar avciKartal = new C03_AvciKuslar();
        avciKartal.hareket(); // A Ucarlar

        C02_Kuslar kusKartal = new C03_AvciKuslar();
        kusKartal.hareket(); // A Ucarlar
    }


}



















