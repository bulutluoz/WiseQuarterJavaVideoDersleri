package K36_maps.D05_nestedMapOlusturma;

import java.util.HashMap;
import java.util.Map;

public class C02_RezervasyonMapiOlusturma {

    public static void main(String[] args) {

        /*

           asagidaki rezervasyon'u bir map olarak olusturun


           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi"
            }

         */
        Map<String,String> bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        Map<String,Object> rezervasyonMapi = new HashMap<>();
        rezervasyonMapi.put("firstname" ,"Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid",false);
        rezervasyonMapi.put("bookingdates",bookingdatesValueMap);
        rezervasyonMapi.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMapi);

        /*
            {
              firstname=Ahmet,
              additionalneeds=wi-fi,
              bookingdates=
                          {
                            checkin=2024-07-21,
                            checkout=2024-08-10
                            },
              totalprice=500,
              depositpaid=false,
              lastname=Bulut
              }
         */


        // rezervasyondaki firstname'i yazdirin
        System.out.println(rezervasyonMapi.get("firstname")); // Ahmet
        // rezervasyondaki depositpaid'i yazdirin
        System.out.println(rezervasyonMapi.get("depositpaid")); // false
        // rezervasyondaki checkin'i yazdirin

        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin")); // 2024-07-21
        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkout")); // 2024-08-10


        // totalprice 400'den dusuk ise "super", 400 veya daha fazla ise "pahali" yazdirin

        Integer totalPriceDegeri = (Integer)rezervasyonMapi.get("totalprice");

        if (totalPriceDegeri<400){
            System.out.println("super");
        }else System.out.println("pahali");

    }
}
