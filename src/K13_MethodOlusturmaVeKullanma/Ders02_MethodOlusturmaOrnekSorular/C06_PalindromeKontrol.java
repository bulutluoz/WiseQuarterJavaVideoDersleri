package K13_MethodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C06_PalindromeKontrol {

    public static void main(String[] args) {

        // verilen metnin palindrome olup olmadigini kontrol edip,
        // palindrome ise true, palindrome degilse false donduren bir method olusturun


        System.out.println(isPalindrome("Java")); // false

        System.out.println(isPalindrome("Madam")); // true

        System.out.println(isPalindrome("1235321")); // true


    }



    public static boolean isPalindrome( String metin ){

        String tersMetin = C05_MetniTerseCevirme.metninTersiniDondur(metin); // (konsolda gormeyiz)


        if ( metin.equalsIgnoreCase(tersMetin)){

            return true;

        } else {

            return false;

        }

    }
}
