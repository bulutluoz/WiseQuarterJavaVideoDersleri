package K32_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I01_Interface {

    //public void method1(){

    //}

    /*
        biz interface icinde abstract yazmadan bir method olustursak da
        Java body eklememize izin vermiyor ve
        Interface abstract methods cannot have body
     */

    public abstract void method2();
    public void method3();
    abstract int method4();
    String method5();
      /*
        biz interface icinde bir method olusturdugumuzda
        public ve abstract keyword'lerini
        YAZSAK da , YAZMASAK da farketmez
        Java tum method'lari public ve abstract olarak kabul eder
        yukardaki method'larin hepsi public ve abstract'tir
     */

    List<String> list = new ArrayList<>();



}
