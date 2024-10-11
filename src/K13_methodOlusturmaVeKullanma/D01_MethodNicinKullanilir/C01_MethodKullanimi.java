package K13_methodOlusturmaVeKullanma.D01_MethodNicinKullanilir;

public class C01_MethodKullanimi {

    public static void main(String[] args) {

        String str = "Java Candir";


        str.toUpperCase();  // method gorevini yapti, str'i buyuk harfe cevirip bize getirdi
                            // kapicinin istedigimiz ekmegi alip bizim kapimiza gelmesi gibi


        System.out.println(str.toUpperCase()); // JAVA CANDIR
        // method gorevini yapti, biz de degistirilmis halini hemen yazdirip konsolda gorduk
        // kapicinin getirdigi ekmegi hemen ondan alip yedik


        str = str.toLowerCase();
        // method gorevini yapti, biz de yeni halini SONRA KULLANMAK uzere kaydettik
        // kapicinin getirdigi ekmegi alip, saklama kutusuna koymak gibi


        System.out.println(str); // java candir


    }
}
