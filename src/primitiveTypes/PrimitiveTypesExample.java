package primitiveTypes;

public class PrimitiveTypesExample {

    public void castType(){
        // byte -> short -> char -> int -> long -> float -> double genis cast

        // double -> float -> long -> int -> char -> shor -> byte daralma

        int yas = 10;
        double yasDouble = yas; // 10.0 genis

        double fiyat = 20.0;
        int fiyatInt = (int) fiyat;

        String fiyatYazi = fiyat + "";
        String fiyatYazi1 = String.valueOf(fiyat); // "20.0"

        String sinifim = "10.5";

        int sinifimTamSayi = Integer.valueOf(sinifim); // 10
        double sinifimOndalikli = Double.valueOf(sinifim); // 10.5


    }
}
